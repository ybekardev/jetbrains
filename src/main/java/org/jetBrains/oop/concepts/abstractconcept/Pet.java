package org.jetBrains.oop.concepts.abstractconcept;

public abstract class Pet {

    protected String name;
    protected int age;

    protected Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void makeVoice();

}
