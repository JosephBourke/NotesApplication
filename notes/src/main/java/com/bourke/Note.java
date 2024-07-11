package com.bourke;

import java.io.Serializable;

public class Note implements Serializable{
    public String name;
    public String data;

    public Note(){}
    public Note(String name){
        this.name = name;
    }

    public Note(String name, String data){
        this.name = name;
        this.data = data;
    }



    public String toString(){
        return name;
    }

}
