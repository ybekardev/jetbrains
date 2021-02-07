package org.jetBrains.javacore.algorithms;

public class InsertionSort {

    public static void main(String[] args) {

        for(int a : insertionSort(new int[] {1,5,2,7,3,6,3,8,45,6})){
            System.out.print(a + " ");
        }
    }

    public static int[] insertionSort(int []  array){
        for(int i = 1; i < array.length; i++){
            int elem = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > elem){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = elem;
        }
        return array;
    }


}
