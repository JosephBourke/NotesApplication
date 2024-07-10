package com.bourke;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;



public class MainWindowController implements Initializable {


    @FXML
    ListView lv;


    
    private static ArrayList<Note> list = null;



    @SuppressWarnings("unchecked")
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // FileHandler fh = new FileHandler();
        // fh.LoadObject(Constants.SAVE_LOCATION);    


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
}
