package org.jetBrains.algorithms;

public class HammingDistance {

    public static void main(String[] args) {

        System.out.println(hammingDistance("microscope", "microphone"));
        System.out.println(hammingDistance("Hello", "Hi"));
    }

    //Hamming distance is a simple metric that allows estimating similarity between two strings of equal length.
    public static int hammingDistance(String s1, String s2){

        int hammingDistance = 0;
        if(s1.length() != s2.length()){
            return -1;
        }

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                hammingDistance++;
            }
        }
        return hammingDistance;
    }
}
