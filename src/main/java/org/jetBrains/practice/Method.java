package org.jetBrains.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

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
}
