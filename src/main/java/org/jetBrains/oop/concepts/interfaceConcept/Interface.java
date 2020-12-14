package org.jetBrains.oop.concepts.interfaceConcept;

public interface Interface {

    int INT_CONSTANT = 0; // it's a constant, the same as public static final int INT_FIELD = 0

    public void instanceMethod1();

    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface: default method. It can be overridden");
    }

    private void privateMethod() {
        System.out.println("Interface: private methods in interfaces are acceptable but should have a body");
    }

    /*
    Let's take a closer look at this interface.
    The variable INT_CONSTANT is not a field here, it's a static final constant.
    Two methods instanceMethod1() and instanceMethod2() are abstract methods.
    The staticMethod() is just a regular static method.
    The default method defaultMethod() has an implementation but it can be overridden in subclasses.
    The privateMethod has an implementation as well and can be used to decompose default methods.
     */
}
