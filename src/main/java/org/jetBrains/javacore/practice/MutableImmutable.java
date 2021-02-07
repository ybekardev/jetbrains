package org.jetBrains.javacore.practice;

public class MutableImmutable {

    static class Patience {
        String name;
        int age;

        public String toString(){
            String patience = name + " - " + age;
            return patience;
        }

    }

    public static void main(String[] args) {

        Patience patience = new Patience();
        patience.name = "Melissa";
        patience.age = 24;

        System.out.println(patience.toString());

        Patience pat1 = new Patience();
        pat1.name = "Ashley";
        pat1.age = 32;

        System.out.println(pat1);

        //It is important to understand that two variables refer to the same data in memory rather than two independent copies.
        //Since our class is mutable, we can modify the object using both references.
        Patience pat2 = pat1;

        //pat2 still prints pat1 values
        System.out.println(pat2);

        pat2.name = "Alissa";
        pat2.age = 34;

        System.out.println(pat2);

        //Immutability means that an object always stores the same values. Values do NOT change
        String str = new String("Naime");
        System.out.println(str);
        String s = "Naim";
        System.out.println(s);
        //The below code will stay immutable while making it all uppercase, it will print the same value unless we reassign it to itself
        s.toUpperCase();
        System.out.println(s);
        //Now all will be upper case
        s = s.toUpperCase();
        System.out.println(s);

        //MUTABLE
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        //without reassigning to sb, we can append it
        sb.append(" world!");
        System.out.println(sb);
    }
}
