package org.jetBrains.practice;

import org.junit.jupiter.api.Test;

public class Ternary {

    @Test
    void ternary(){
        int a  =3;
        int b = 5;
        int max;

        if (a > b){
            max = a;
            System.out.println("hello " + max);
        } else {
            max = b;
            System.out.println("hello " + max);
        }

        max = a > b ? a : b;
        System.out.println("hello max: " + max);
    }
}
