package com.bourke;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NoteEditor implements Initializable {
    

    private Note note;
    private int index;

    private MainWindowController main = null;
    @FXML
    TextArea body;

    @FXML 
    TextField title;


    public NoteEditor(Note note){
        this.note = note;
    }

    public NoteEditor(int index){
        this.index = index;
    }

    public NoteEditor(int index, Note note){
        this.index = index;
        this.note = note;
    }

    public NoteEditor(){
        note = new Note();
        note.name = "title";
        note.data = "";
    }

    @FXML
    void save(){
        note.data = body.getText();
        note.name = title.getText();
        main.setNote(index, note);
    }


    public void setMainWindow(MainWindowController main){
        this.main = main;
    }



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        body.setText(note.data);
        title.setText(note.name);
    }



    public void setNote(int index, Note n){
        this.index = index;
        note = n;
        body.setText(note.data);
        title.setText(note.name);
    }


}
