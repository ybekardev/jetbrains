package org.jetBrains.oop.concepts.polymorphism;

import java.util.Date;

public class ObjectReference {

    static class Person {
        protected String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        protected int yearOfBirth;
        protected String address;
    }

    static class Client extends Person {
        protected String contactNumber;
        protected boolean premiumMember;
    }

    static class Employee extends Person {
        protected Date startDate;
        protected Long salary;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Client client = new Client();
        Employee employee = new Employee();

        Person client2 = new Client(); //Reference is Person, Object is Client
        Person employee2 = new Employee(); // reference Person, Object is Employee

        //You can always cast an object of a subclass to its superclass.
        //It may also be possible to cast an object from a superclass type to a subclass, but only if the object really is an instance of this subclass, otherwise ClassCastException will be thrown.
        Client client3 = (Client) client2; //works okay
       // Employee employee3 = (Employee) client2; //ClassCastException

        //Client client2 = new Employee(); impossible since there is no relationship between them
        //Client client3 = new Person(); impossible since can't assign an object of the parent  to the reference of the subclass

        employee2.name = "Yasin";
        employee2.address = "8271 N Tullis Ave";
        employee2.yearOfBirth = 1985;
        //employee2.salary = 34343; // Compile-time error, the base class "doesn't know" about the method

        client2.name = "Muhsin";
        client2.yearOfBirth = 2015;
        client2.address = " Kansas City";

        client.contactNumber = "34553343";
        client.premiumMember = true;

        Person person1 = new Employee();
        person1.setName( "Gerard");

        Client client1 = new Client();
        client1.setName( "Hailey");

        Employee employee1 = new Employee();
        employee1.setName( "Jenny");

        Person[] persons = {person1, client1, employee1};
        printNames(persons);
    }

    public static void printNames(Person[] persons){
        for(Person person : persons){
            System.out.println(person.getName());
        }
    }

}
