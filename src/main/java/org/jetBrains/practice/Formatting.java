package org.jetBrains.practice;

import org.junit.jupiter.api.Test;

public class Formatting {

    //Java will replace %c - (char), %s - (string), %d - (int, short, byte, long), %f - (double, float)
    //%n newline character breaks the line every time it was used.

    @Test
    public void formatString(){
        char sex = 'M';
        int age = 34;
        float height = 6.00f;
        String name = "Johnathan";

        //String.format()
        String customer = String.format("Customer Information: %nName: %s,  %nAge: %d, %nHeight: %.2f, %nSex: %c", name, age, height, sex);
        System.out.println(customer);

        //string - printf()
        System.out.printf("Customer Information: %nName: %s,  %nAge: %d, %nHeight: %.2f, %nSex: %c", name, age, height, sex);


    }



}
