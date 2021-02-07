package org.jetBrains.javacore.practice;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class Method {

    @Test
    public void m() {
        System.out.println(Math.round(79.45));
        System.out.println("A".compareTo("A"));
        System.out.println("A".compareTo("B"));

    }


    @Test
    public void sb() {
        String s = "Hello, Start!";
        StringBuilder sb = new StringBuilder("Hello, Start");
        System.out.println(sb + " - " + s);
        sb.setCharAt(8, 'm');//MUTABLE -> CHANGES
        s.substring(3);//immutable STRING -> NO CHANGE
        System.out.println(sb + " - " + s);
        sb.append(" world!");
        System.out.println(sb + " - " + s);

    }


    @Test
    public void test(){
        String str = null;

        //guarantees no NPE
        if(Objects.equals(str, "abc")){
            System.out.println("Hello!");
        }else{
            System.out.println("Bye!");
        }

        //NO NPE
        if("abc".equals(str)){
            System.out.println("Hello!");
        }else {
            System.out.println("Good Bye!");
        }

        //NPE
        /*if(str.equals("abc")){
            System.out.println("Hello!");
        }*/

        //NPE
        //int size = str.length();

        int size = str != null ? str.length() : 0;
        System.out.println(size);
    }
}
