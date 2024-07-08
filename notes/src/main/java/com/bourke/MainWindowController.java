package com.bourke;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class MainWindowController implements Initializable{


    @FXML
    ListView lv;






    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        FileHandler fh = new FileHandler();
        fh.LoadObject(Constants.SAVE_LOCATION);    
        
        
        lv.getItems().add("1");
        lv.getItems().add("2");
        lv.getItems().add("3");

    }



    @FXML
    public void save(){

    }



}
