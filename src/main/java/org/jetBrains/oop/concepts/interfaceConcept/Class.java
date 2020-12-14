package org.jetBrains.oop.concepts.interfaceConcept;

public class Class implements Interface{
    @Override
    public void instanceMethod1(){
        System.out.println("Class: Instance Method1");
    }
    @Override
    public void instanceMethod2(){
        System.out.println("Class: Instance Method2");
    }

    public static void main(String[] args) {
        Class c = new Class();
        c.instanceMethod1();
        c.instanceMethod2();
    }
}
