package org.jetBrains.javacore.w3schools.objectserialization;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
