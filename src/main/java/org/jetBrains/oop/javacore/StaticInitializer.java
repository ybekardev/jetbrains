package org.jetBrains.oop.javacore;

public class StaticInitializer {

    private static int field = 1;
    private static String hi = "Hello World!";

    //It's used to initialize static fields and constants, just like constructors help to initialize instance fields.
    // A class can have multiple static blocks which will be executed in the order that they appear in the source code.
    // A static field is performed fisrt. After that, the static block is executed. Note, it's impossible to access instance fields and methods in a static block.
    // A static initialization block is executed once for the whole class, not for each instance of the class.
    static {
        field = Integer.MAX_VALUE;
    }
    //There is also an instance initialization block. It's used to initialize instance data members.
    // It is run each time an object of the class is created. An instance initialization block is code enclosed in braces {}.
    // The instance initialization block is executed before any constructor of a class (but after the superclass constructors).
    // The java compiler invokes the block as the first statement in the constructor, before other statements.
    // You can write as many initialization blocks as you need. They will be performed in the order in which they appear in your code.
    // Note, static class members can be accessed in an instance initialization block.

    {
        hi = String.valueOf(65);
    }

    public StaticInitializer(int val) {
        field = val;
    }

    public static void main(String[] args) {
        StaticInitializer instance = new StaticInitializer(100);
        StaticInitializer instance2 = new StaticInitializer(200);
    }
}
