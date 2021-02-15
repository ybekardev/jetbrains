package org.jetBrains.javacore.w3schools.objectserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) {
        readVehicleObject();
    }

    public static void readVehicleObject(){
        //.dat file is not human readable
        try(FileInputStream fileInputStream = new FileInputStream("src/main/java/org/jetBrains/javacore/w3schools/objectserialization/vahicle.dat")){
            try(ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
                Vehicle toyota = (Vehicle) objectInputStream.readObject();
                Vehicle acura = (Vehicle) objectInputStream.readObject();

                System.out.println("Objects: \n" + toyota + "\n" +acura);
            } catch (Exception e){
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
