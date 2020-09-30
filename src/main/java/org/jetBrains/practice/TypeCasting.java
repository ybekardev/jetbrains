package org.jetBrains.practice;

import org.junit.jupiter.api.Test;

public class TypeCasting {

    /*If you want to cast a narrower type to a wider type, you do not need to write anything,
    the Java compiler will do it automatically for you. But if you want the opposite,
    specify the required type in parentheses following the assignment operator.
    Keep in mind, the boolean type cannot be cast to another type and vice versa.*/

    @Test
    public void implicitCasting(){
        int num = 100;
        long bigNum = num;
        System.out.println(num + " int \nlong " + bigNum);
    }

    @Test
    public void explicitCasting(){
        long num = 100;
        int bigNum = (int) num;
        System.out.println(num + " long \nint " + bigNum);

        long longNum = 100000000000000L;
        int intNum = (int) longNum;
        System.out.println(longNum + " long \nint " + intNum);

    }

    @Test
    void test(){
        //primitive types - Stack Memory: -byte , short , int , long , float , double , boolean , char , sthe value is just copied, these values can't be NULL!!!;
        //reference types - Heap Memory: -String , Scanner , Random , Die , int[] , the address to the value is copied (the data is shared between several variables), these values CAN be NULL!!!.
        //All values of primitive types are stored in stack memory, but variables of reference types store addresses on objects located in heap memory.

        int a = 3;
        int b = 3;
        int c = a;

        System.out.println(a==b);
        System.out.println(a==c);

        //Actually, when you are comparing two variables of the String type, it compares references (addresses) rather than actual values.
        String language = new String("Java");
        String java = "Java";

        System.out.println(language == java);
        System.out.println(language.equalsIgnoreCase(java));

        String e = new String("abc");
        String d = e;

        System.out.println(e == d);
        System.out.println(e.equalsIgnoreCase(d));
    }
}
