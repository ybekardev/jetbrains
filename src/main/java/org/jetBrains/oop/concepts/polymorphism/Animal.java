package org.jetBrains.oop.concepts.polymorphism;

public class Animal {
        protected int age;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

    class Pet extends Animal {
        protected String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    class Cat extends Pet {
        protected String color;
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
    }

    class Test {
        public static void main(String[] args) {
            Pet cat = new Cat();
            cat.setAge(4);
            System.out.println(cat.getAge());
            System.out.println(cat.name = "Kitty");
            cat.setName("Kay");
            System.out.println(cat.getName());

            Animal c = new Cat();
            c.setAge(5);
            System.out.println(c.getAge());
            System.out.println(c.age=3);
            c.setAge(2);
            System.out.println(c.getAge());

            Cat cat1 = new Cat();
            cat1.age = 5;
            cat1.getAge();
            cat1.name = "kat";
            cat1.color = "White";
            System.out.println(cat1.getColor());
            System.out.println(cat1.getAge());
            System.out.println(cat1.getName());

            //The superclass Person doesn't have the method setSalary of the class Employee.
            //You cannot invoke the method through the superclass reference. The same rule works for fields as well.

            //REFERENCE      OBJECT
              Animal a = new Pet();
            //a.name = "WRONG!!!"; We CANNOT retrieve the Pet() object's fields OR method, we can reach NOTHING
            //a.getName(); - CAN'T be retrieved
            // a.setName(); - CAN'T be retrieved
            //The Reference DECIDES what to bring but Object side DOES NOT!!!
        }
    }
