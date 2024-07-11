package com.bourke;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;



public class MainWindowController implements Initializable {


    @FXML
    ListView lv;


    
    private static ArrayList<Note> list = null;



    @SuppressWarnings("unchecked")
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
      

        lv.getItems().add("1");
        lv.getItems().add("2");
        lv.getItems().add("3");
        lv.getItems().add("4");
        lv.getItems().add("5");
    }

    public static void addNote(Note n){
        list.add(n);
    }

    public static void addNote(int index, Note n){
        list.add(index,n);
    }

    public static void removeNote(int index){
        list.remove(index);
    }




    @FXML
    public void listViewSelected(){

        
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("notewindow.fxml"));
            Parent pane = (Parent)loader.load();
            NoteEditor ne = loader.getController();
            ne.setNote(new Note(lv.getSelectionModel().getSelectedItem().toString(), "null"));

            
            
            

            
            stage.setScene(new Scene(pane));
            stage.setTitle("Note Editor");
            stage.show();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(lv.getSelectionModel().getSelectedItem());
    }


}
