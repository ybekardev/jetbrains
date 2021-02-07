package org.jetBrains.javacore.algorithms;

public class Substring {

    public static void main(String[] args) {
        System.out.println(containsPattern("ACBACAD", "ACA")); // true
        System.out.println(containsPattern("Substring", "string")); // true
        System.out.println(containsPattern("Hello, world!", "Hi!")); // false


        //simple way
        String s = "Hello";
        System.out.println(s.contains("ello"));

    }

    public static boolean containsPattern(String text, String pattern){
        if(text.length() < pattern.length()){
            return false;
        }
        for(int i = 0; i < text.length() - pattern.length() + 1; i++){
            boolean patternIsFound = true;
            for(int j = 0; j < pattern.length(); j++){
                if(text.charAt(i + j) != pattern.charAt(j)){
                    patternIsFound = false;
                    break;
                }
            }

            if(patternIsFound){
                return true;
            }
        }
        return false;
    }


}
