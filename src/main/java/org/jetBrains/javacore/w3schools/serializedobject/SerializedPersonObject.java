package org.jetBrains.javacore.w3schools.serializedobject;

import java.io.Serializable;

public class SerializedPersonObject implements Serializable {

    private static final long serialVersionUID = 1L;
    static String country = "USA";
    private String name;
    private int age;
    private double height;


    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        SerializedPersonObject.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
