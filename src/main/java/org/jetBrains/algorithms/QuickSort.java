package org.jetBrains.algorithms;

public class QuickSort {

    public static void main(String[] args) {
        int[] array1 = { 17, 25, 11, 16, 10, 13, 22, 14 };
        quickSort(array1, 0, array1.length - 1); // { 10, 11, 13, 14, 16, 17, 22, 25 }

        int[] array2 = { 19, 18, 17, 17, 16, 15 };
        quickSort(array2, 0, array2.length - 1); // { 15, 16, 17, 17, 18, 19 }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right); // the pivot is already on its place
            quickSort(array, left, pivotIndex - 1);  // sort the left subarray
            quickSort(array, pivotIndex + 1, right); // sort the right subarray
        }else{
            System.out.println("Error!");
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];  // choose the rightmost element as the pivot
        int partitionIndex = left; // the first element greater than the pivot

        /* move large values into the right side of the array */
        for (int i = left; i < right; i++) {
            if (array[i] <= pivot) { // may be used '<' as well
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(array, partitionIndex, right); // put the pivot on a suitable position

        return partitionIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
