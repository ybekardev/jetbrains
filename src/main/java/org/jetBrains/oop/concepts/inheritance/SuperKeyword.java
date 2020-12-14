package org.jetBrains.oop.concepts.inheritance;

import java.util.Date;

public class SuperKeyword {

    class Person {
        protected String name;
        protected int age;
        protected String address;

        public Person (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        //getters and setters
    }

    class Employee extends Person {
        protected Date startDate;
        protected long salary;

        public Employee (String name, int age, String address, Date startDate, long salary){
            super(name, age, address);
            this.startDate = startDate;
            this.salary = salary;
        }
        //setter and getter
    }

    /*
    This keyword can be used in several cases:
    to access instance fields of the parent class;
    to invoke methods of the parent class;
    to invoke constructors of the parent class (no-arg or parameterized).

    The keyword super is optional if members of a subclass have different names from members of the superclass.
    Otherwise, using super is the right way to access hidden (with the same name) members of the base class.

    invoking super(...) must be the first statement in a subclass constructor, otherwise, the code cannot be compiled;
    the default constructor of a subclass automatically calls the no-argument constructor of the superclass.
     */
}
