package org.jetBrains.oop.concepts.transientkeyword;

import org.jetBrains.oop.concepts.transientkeyword.innerpackage.Address;

import java.util.Arrays;

public class Country {
    public static Citizen[] initCitizens() {
        Citizen mark = new Citizen();
        mark.setName("Mark Olson");
        mark.setPassport("503143798"); // the passport was set

        Address markAddress = new Address();
        markAddress.setState("Arkansas");
        markAddress.setCity("Conway");
        markAddress.setStreet("1661  Dawson Drive");

        mark.setAddress(markAddress);

        Citizen anna = new Citizen();
        anna.setName("Anna Flores");
        anna.setPassport("605143321"); // the passport was set

        Address annaAddress = new Address();
        annaAddress.setState("Georgia");
        annaAddress.setCity("Atlanta");
        annaAddress.setStreet("4353  Flint Street");

        anna.setAddress(annaAddress);

        return new Citizen[]{ mark, anna };
    }

    public static void main(String[] args) {
        //String filename = "citizens.data";
        try {
            //SerializationUtils.serialize(initCitizens(), filename);
            //Citizen[] citizens = (Citizen[]) SerializationUtils.deserialize(filename);
            Country citizen = new Country();
            System.out.println();
            System.out.println(Arrays.toString(initCitizens()));
            for(Citizen c : initCitizens()){
                System.out.println(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
