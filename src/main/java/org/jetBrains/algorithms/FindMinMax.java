package org.jetBrains.algorithms;

public class FindMinMax {

    public static void main(String[] args) {

        System.out.println(findIndexOfMax(new int[] { 1,5,2,7,4,78,4,9}));
        System.out.println(findMax(new int[] { 1,5,2,7,4,78,4,9}));

    }

    public static int findIndexOfMax(int[] numbers){
        int index = 0;
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > numbers[index]){
                index = i;
            }
        }
        return index;
    }

    public static int findMax(int[] numbers){
        if(numbers.length == 0){
            return -1;
        }
        int index = 0;
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > numbers[index]){
                index = i;
            }
        }
        return numbers[index];
    }
}
