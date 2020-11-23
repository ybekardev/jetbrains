package org.jetBrains.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println(selectionSort(new int[] {21,23,19,30,11,28}));
        selectionSort(new int[] {21,23,19,30,11,28});
        for (int i : selectionSort(new int[] {21,23,19,30,11,28})) {
            System.out.print(i+ " - ");
        }

        System.out.println(selectionSortList(new int[] {21,23,19,30,11,28}));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i; // the index of the found min

            /* Iterating over the unsorted subarray to find the min */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            /* Exchanging the found min and the current element */
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }

        return array;
    }


    public static List<Integer> selectionSortList(int[] array) {
        System.out.println();
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            int index = i; // the index of the found min

            /* Iterating over the unsorted subarray to find the min */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            ls.add(array[index]);
            System.out.print(ls.get(i) + " * ");
        }
        System.out.println();
        return ls;
    }
}
