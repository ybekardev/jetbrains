package org.jetBrains.oop.concepts.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToString {

    public static void main(String[] args) {
        Employee employee = new Employee("Yusuf", 23343);
        System.out.println(employee.toString());

        Client client1 = new Client("Jason", 24, new String[] {"MO", "TX", "NC"});
        Client client2 = new Client("Jenny", 34, new String[] {"NY", "MX"});
        System.out.println(client1 + " - " + client2);
        List<Client> client  = new ArrayList<>();
        client.add(client1);
        client.add(client2);
        System.out.println(client);
    }

}

class Person {
    protected String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Person{name= " + name + "}";
    }
}

class Employee extends Person {
    protected long salary;

    public Employee(String name, long salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name= " + name + " , salary= " + salary + "}";
    }
}

class Client {
    private String name;
    private int age;
    private String[] location;

    public Client(String name, int age, String[] location){
        this.name = name;
        this.age = age;
        this.location = location;
    }

    //setter, getter

    public String toString() {
        String result = "";
        for (int i = 0; i < this.location.length; i++) {
            result +=  location[i] + ",";
        }
        return "Client [clientName=" + name + ", clientAge= " + age + Arrays.toString(location).replace(", ", ",") + "]";
        //return "Client [clientName=" + name + ", clientAge= " + age + result + "]";

    }
}
