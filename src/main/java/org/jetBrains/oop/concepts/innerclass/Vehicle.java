package org.jetBrains.oop.concepts.innerclass;

public class Vehicle {

    private String name;
    public Vehicle(String dixi) {
        this.name = dixi;
    }

    class Engine {
        public void start() {
            System.out.println("RRRrrrrrrr....");
        }
    }

    class Body {
        String color;
        public Body(String color){
            this.color = color;
        }
        public void printColor(){
            System.out.println("Vehicle " + name + " has " + this.color + " body.");
        }
    }
}

class EnjoyVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Body body = vehicle.new Body("red");
        body.printColor();
        Vehicle.Engine engine= vehicle.new Engine();
        engine.start();
    }
}