package org.jetBrains.javacore.w3schools.objectserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        writeVehicleObject();
    }
    public static void writeVehicleObject() {
        Vehicle toyota = new Vehicle("Toyota", 2015);
        Vehicle acura = new Vehicle("Acura", 2012);

        try (FileOutputStream fileInputStream = new FileOutputStream("src/main/java/org/jetBrains/javacore/w3schools/objectserialization/vahicle.dat")) {
            try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream)){
                objectOutputStream.writeObject(toyota);
                objectOutputStream.writeObject(acura);
                System.out.println("Objects are written on to the file");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
