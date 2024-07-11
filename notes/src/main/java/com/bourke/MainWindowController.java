package com.bourke;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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


    
    private  ArrayList<Note> list = null;
    private  FileHandler fh = new FileHandler();


    @SuppressWarnings("unchecked")
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        FileHandler fh = new FileHandler();
        if((list = (ArrayList<Note>)fh.LoadObject(Constants.SAVE_LOCATION)) == null){
            list = new ArrayList<>();
        }
        lv.setItems(FXCollections.observableArrayList(list));
    }

    public  void addNote(Note n){
        list.add(n);
        fh.SaveObject(list, Constants.SAVE_LOCATION);
        lv.setItems(FXCollections.observableArrayList(list));
        
    }

    public  void addNote(int index, Note n){
        list.add(index,n);
        fh.SaveObject(list, Constants.SAVE_LOCATION);
        lv.setItems(FXCollections.observableArrayList(list));
    }

    public  void setNote(int index, Note n){
        list.set(index,n);
        fh.SaveObject(list, Constants.SAVE_LOCATION);
        lv.setItems(FXCollections.observableArrayList(list));
    }

    public  void removeNote(int index){
        list.remove(index);
        fh.SaveObject(list, Constants.SAVE_LOCATION);
        lv.setItems(FXCollections.observableArrayList(list));
    }




    @FXML
    public void listViewSelected(){

        
        try {
            Note n = (Note)lv.getSelectionModel().getSelectedItem();


            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("notewindow.fxml"));
            Parent pane = (Parent)loader.load();
            NoteEditor ne = loader.getController();
            ne.setMainWindow(this);
            if(n != null){
                ne.setNote(lv.getSelectionModel().getSelectedIndex(),(Note)lv.getSelectionModel().getSelectedItem());
            }else{
                n = new Note("title","");
                addNote(n);
                ne.setNote(list.size(), n);
            }


            
            
            

            
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
