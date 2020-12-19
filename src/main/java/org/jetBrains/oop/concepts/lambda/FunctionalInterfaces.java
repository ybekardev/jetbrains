package org.jetBrains.oop.concepts.lambda;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        //first way with polymorphism
        //Cab cab = new Uber();
        //cab.bookCab();
        //second way
        Uber uber = new Uber();
        uber.bookCab("Kansas", "Dallas");

        //Anonymous class
        Cab cab = new Cab(){
            @Override
            public void bookCab(String from, String to) {
                System.out.println("Your Uber is arriving, from "+ from + " to " + to);
            }
        };
        cab.bookCab("Kansas", "Raleigh");

        //using lambda, functional interface
        Cab cab1 = (from, to) -> {
            System.out.println("Uber arrives soon, from " + from + " to " + to);
        };
        cab1.bookCab("Kansas", "Texas");
    }
}


@FunctionalInterface
interface Cab { //when an interface have exactly ONE abstract method we call it functional interface
    void bookCab(String from, String to);//it is public abstract void bookCab() by default
}

class Uber implements Cab {
    public void bookCab(String from, String to){
        System.out.println("Uber booked, arriving soon, from "+ from + " to " + to);
    }
    }


