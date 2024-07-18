package com.bourke;

import java.io.Serializable;

public class FileSelectionHandler {
    private String currentPath = null;
    private Object currentObject = null; 
    private FileHandler fh = new FileHandler();




    public void saveNew(Serializable object, String path){
        currentObject = object;
        currentPath  = path;
        fh.SaveObject(object, path);
    }

    public void saveExisting(){
        fh.SaveObject(currentPath, currentPath);
    }

    

    public void open(){

    }

    public Object getCurrentObject(){
        return currentObject;
    }


}
