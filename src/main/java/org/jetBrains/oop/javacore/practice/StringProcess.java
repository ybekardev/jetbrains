package org.jetBrains.oop.javacore.practice;

import org.junit.jupiter.api.Test;

public class StringProcess {

    @Test
    public void testString(){
        char[] arr  = {'A', 'B', 'C','D'};
        String formString = String.valueOf(arr);
        System.out.println(formString);

        char[] charsOfString =  formString.toCharArray();
        System.out.println(charsOfString);

        String h = "Hello";
        String [] s = h.split("");
        for(String str : s){
            System.out.print(str);
        }

        String sentence = " I am a Java Software programmer";
        String [] word = sentence.split(" ");
        for(String a : word){
            System.out.println(a);
        }

        String[] real = sentence.split(" Software ");
        for(String b  : real){
            System.out.print(" " + b);
        }

    }
}
