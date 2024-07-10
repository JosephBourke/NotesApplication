package com.bourke;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NoteEditor implements Initializable {
    

    private Note currentNote;

    @FXML
    TextArea body;

    @FXML 
    TextField title;


    // public NoteEditor(Note note){
    //     currentNote = note;
    // }



    // @FXML
    // void save(){
    //     currentNote.data = body.getText();
    //     currentNote.name = title.getText();
    // }



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }



}
