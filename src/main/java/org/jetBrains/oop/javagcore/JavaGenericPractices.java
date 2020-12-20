package org.jetBrains.oop.javagcore;

import org.junit.jupiter.api.Test;

class JavaGenericsPractice {

    @Test public void test() {

        GenericClass<String> gs = new GenericClass<>("Hello World!");
        System.out.println(gs.get());
        GenericClass<Integer> gi = new GenericClass<>(182362);
        System.out.println(gi.get());

        //without a type argument
        GenericClass gi2 = new GenericClass("Bye Bye");
        System.out.println(gi2.get());
        //using Object type
        GenericClass<Object> gi3 = new GenericClass<>(3223);
        System.out.println(gi3.get());

        //Sometimes, declaring a variable with a generic type can be too long and poorly readable.
        //Fortunately, you can write var instead of a specific type to force automatic type inference based on the type of assigned value.
        var obj3 = new GenericClass<>("Hi!");
        System.out.println(obj3.get());
        var obj4 = new GenericClass<>(42323421);
        System.out.println(obj4.get());

        System.out.println(gs.set("Good Bye!"));
        System.out.println(gi.set(3324));
        System.out.println(obj4.set(882123));

        var strArr = new ImmutableArray<>(new String[] {"item1", "item2", "item3"});
        System.out.println(strArr.get(0));
        for(int i = 0; i < strArr.length(); i++){
            System.out.println(strArr.get(i));
        }

        GenericsOfObjects go = new GenericsOfObjects("Hello World!");
        System.out.println(go.get());

        GenericsOfObjects go2 = new GenericsOfObjects(123);
        System.out.println(go2.get());
        //Integer i = go2.get(); will not compile, because the type is Object!!!



    }
}
