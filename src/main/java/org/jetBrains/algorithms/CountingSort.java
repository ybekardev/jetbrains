package org.jetBrains.algorithms;

public class CountingSort {

    public static void main(String[] args) {
        for(int a : unstableCountingSort(new int[] {1,5,3,6,3,7,3,8,3,6})){
            System.out.print(a + " ");
        }

        System.out.println();

        for(int b : stableCountingSort(new int[] {2,5,3,7,4,8,9,4,4,6}, 10)){
            System.out.print(b + " ");
        }
    }
    public static int[] unstableCountingSort(int[] numbers){
        int maxVal = 10; // we suppose the maximum is 10
        int k = maxVal + 1; // the length of the array containing counts
        int[] counts = new int[k]; // it stores 11 zeros with indexes from 0 to k-1

        /* in this loop we count distinct numbers in the input array */
        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }

        int pos = 0; // a position in the numbers array

        /* in this loop we modify the input array to make it sorted */
        for (int num = 0; num < k; num++) { // get the next element
            int count = counts[num]; // get the count of the element
            while (count > 0) {
                numbers[pos] = num; // write it in the numbers array
                pos++;
                count--;
            }
        }

        return numbers;
    }

    public static int[] stableCountingSort(int[] numbers, int max) {
        int k = max + 1; // the length of the array containing counts
        int[] counts = new int[k]; // it stores counts with indexes from 0 to k-1

        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }

        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i - 1] + counts[i]; // cumulative counts
        }

        int[] sortedNumbers = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {  // go through input array in backward
            int rightmostIndex = counts[numbers[i]] - 1; // get the rightmost index
            sortedNumbers[rightmostIndex] = numbers[i];
            counts[numbers[i]]--; // decrease the index to calculate the previous occurrence
        }

        return sortedNumbers;
    }
}
