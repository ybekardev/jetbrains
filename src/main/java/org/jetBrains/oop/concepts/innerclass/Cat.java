package org.jetBrains.oop.concepts.innerclass;

public class Cat {

    private String name;
    public Cat(String name){
        this.name = name;
    }
    public void sayMeow(){
        System.out.println("The cat " + this.name + " says: MEOW!" );
    }

    public class Bow {
        String color;
        public Bow(String color){
            this.color = color;
        }
        public void putOnABow(){
            Cat.this.sayMeow();
            System.out.println("Bow is on!");
        }
        public void printColor(){
            System.out.println("The cat has " + this.color + "color");
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Princes");
        Cat.Bow bow = cat.new Bow("golden");

        bow.printColor();
        bow.putOnABow();
    }

}
