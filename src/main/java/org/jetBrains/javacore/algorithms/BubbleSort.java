package org.jetBrains.javacore.algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        for (int a : bubbleSort(new int[] {1,5,2,6,23,7,3,8,43,9,4})) {
            System.out.print(a + " * ");
        }
    }

    public static int[] bubbleSort(int[] array){
        for(int i = 0; i< array.length-1; i++){
            for(int j =0; j < array.length-i-1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
