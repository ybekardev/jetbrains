package org.jetBrains.oop.concepts.transientkeyword;

import java.io.IOException;
import java.util.Arrays;

public class GetCitizens {
    public static void main(String[] args) {
        String filename = "citizens.data";
        try {
            SerializationUtils.serialize(Country.initCitizens(), filename);
            Citizen[] citizens = (Citizen[]) SerializationUtils.deserialize(filename);
            System.out.println(Arrays.toString(citizens));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
