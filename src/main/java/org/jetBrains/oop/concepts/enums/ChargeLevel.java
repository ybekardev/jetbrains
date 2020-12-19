package org.jetBrains.oop.concepts.enums;

public enum ChargeLevel {
    FULL(4, "green", new int[]{1,2,3,4}),
    HIGH(3, "green", new int[]{1,2,3,4}),
    MEDIUM(2, "yellow", new int[]{1,2,3,4}),
    LOW(1, "red", new int[]{1,2,3,4});

    int sections;
    String color;
    int[] tire;

    //Enums include NO public constructors since we can't create an object from it!!!
    ChargeLevel(int sections, String color, int[] tire) {
        this.sections = sections;
        this.color = color;
        this.tire = tire;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }

    public int[] getTire(){ return tire; }

    public static ChargeLevel findBySections(int sections) {
        //pay attention the for loop is not the same as in the main method with ChargeLeve.values()!!!
        for (ChargeLevel value: values()) {
            if (value.sections == sections) {
                return value;
            }
        }
        return null;
    }

    public static ChargeLevel findByColor(String color){
        for(ChargeLevel value : values()){
            if(value.color == color){
                return value;
            }
        }
        return null;
    }

    /*
    Note that all of these instances are created by JVM in the same way as a static field of a class. This is the reason why an enum cannot contain a public constructor. This means we cannot create enum objects by invoking enum constructor by the new keyword but have to choose one of the predefined instances instead.
    Keep in mind that if your enum contains fields and methods, you should always define them after the list of constants in the enum.
     */
}
