package org.jetBrains.oop.concepts.abstractconcept;

public class Animal {

    public static void main(String[] args) {
        Cat cat = new Cat("Ayran Hanim", 3);
        cat.makeVoice();

        Dog dog = new Dog("Karabas", 5);
        dog.makeVoice();
    }
}

    class Cat extends Pet {
        protected Cat(String name, int age) {
            super(name, age);
        }
        @Override
        public void makeVoice() {
            System.out.println("Cat name: " + name + " age: " + age + " Meow!");
        }
    }

    class Dog extends Pet {
        protected Dog(String name, int age){
            super(name, age);
        }
        @Override
        public void makeVoice(){
            System.out.println("Dog name: " + name + " age: " + age + " Woof!");
        }
    }

