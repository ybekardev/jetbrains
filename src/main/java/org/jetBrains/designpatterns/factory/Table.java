package org.jetBrains.designpatterns.factory;

public class Table {

    private String name;

    Table(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void attachLegs(){
        System.out.println("Attaching Legs");
    }
    void attachTableTop(){
        System.out.println("Attaching table top");
    }
}
