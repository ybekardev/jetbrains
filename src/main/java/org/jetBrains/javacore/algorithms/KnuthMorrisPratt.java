package org.jetBrains.javacore.algorithms;

import java.util.ArrayList;
import java.util.List;

public class KnuthMorrisPratt {

    //the algorithm performs a symbol-by-symbol comparison of a pattern with each substring of a text.

    public static void main(String[] args) {
        System.out.println(KMPSearch("ABADABA", "ABA"));
    }

    public static int[] prefixFunction(String str){
        int[] prefixFunc  = new int[str.length()];
        for(int i = 1; i < str.length(); i++){
            int j = prefixFunc[i - 1];
            while(j > 0 && str.charAt(i) != str.charAt(j)){
                j = prefixFunc[j - 1];
            }
            if(str.charAt(i) == str.charAt(j)){
                j += 1;
            }
            prefixFunc[i] = j;
        }
        return prefixFunc;
    }


    public static List<Integer> KMPSearch(String text, String pattern){
        int[] prefixFunc = prefixFunction(pattern);
        ArrayList<Integer> occurrences = new ArrayList<>();

        int j = 0;
        for(int i = 0; i < text.length(); i++){
            while(j > 0 && text.charAt(i) != pattern.charAt(j)){
                j = prefixFunc[j - 1];
            }
            if(text.charAt(i) == pattern.charAt(j)){
                j += 1;
            }
            if(j == pattern.length()){
                occurrences.add(i - j + 1);
                j = prefixFunc[j - 1];
            }
        }
        return  occurrences;
    }

}
