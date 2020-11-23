package org.jetBrains.algorithms;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println(returnIndexValue(new int[] {1,5,2,7,3,8,2,9}, 5));
        System.out.println(returnIndexValue(new int[] {1,5,2,7,3,8,2,9}, 35));
        System.out.println(returnIndex(new int[] {1,5,2,7,3,8,6,9}, 6));

    }

    public static int returnIndexValue(int [] number, int value){
        if(number.length < value)
            return -1;
        int index =0;
        for(int i = 0; i <number.length; i++){
            index = number[value];
        }
        return index;
    }

    public static int returnIndex(int[] number, int value){
        int index = -1;
        for(int i = 0; i < number.length; i++){
            if(number[i] == value){
                index = i;
                break;
            }
        }
        return index;
    }
}
