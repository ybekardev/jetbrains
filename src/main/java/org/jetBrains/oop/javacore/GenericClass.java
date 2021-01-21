package org.jetBrains.oop.javacore;

/*
A class can have any number of type parameters.
It is impossible to use a primitive type like int or double
The most commonly used type parameter names are:

T – Type
S, U, V etc. – 2nd, 3rd, 4th types
E – Element (used extensively by different collections)
K – Key
V – Value
N – Number
*/

public class GenericClass<T> {

    /**
     * A field of "some type"
     */
    private T t;

    /**
     * Takes a value of "some type" and set it to the field
     */
    public GenericClass(T t) {
        this.t = t;
    }

    /**
     * Returns a value of "some type"
     */
    public T get() {
        return t;
    }

    /**
     * Takes a value of "some type", assigns it to a field and then returns it
     */
    public T set(T t) {
        this.t = t;
        return this.t;
    }
}
