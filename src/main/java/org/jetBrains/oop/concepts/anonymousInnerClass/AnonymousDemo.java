package org.jetBrains.oop.concepts.anonymousInnerClass;

import com.sun.security.jgss.GSSUtil;

public class AnonymousDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.getAge();
    }
}

class Person implements Age {
    @Override
    public void getAge() {
        System.out.println("Age is: " + age);
    }
}

//Instead of above TWO-STEP class we can directly copy the code of Person into AnonymousDemo
class AnonymousDemo2 {
    public static void main(String[] args) {
        String name = "Haydar";
        Age myAge = new Age() {
            @Override
            public void getAge() {
               String result = String.format("Name is %s: %nAge is %d:", name, age );
                System.out.println(result);
            }
        };

        myAge.getAge();
    }
}
    /*
    Sometimes developers need to use a small class which overrides some methods of another class or interface only once.
    An anonymous class always implements an interface or extends another class (concrete or abstract). Here is the common syntax of creating an anonymous class:
    An anonymous class must override all abstract methods of the superclass.
    new SuperClassOrInterfaceName() {
    // fields
    // overridden methods
    };

    Generally, you should consider using an anonymous class when:
    only one instance of the class is needed;
    the class has a very short body;
    the class is used right after it's defined.

    Anonymous classes have some restrictions:
    they cannot have static initializers or interface declarations;
    they cannot have static members, except the constant variables (final static fields);
    they cannot have constructors.
     */