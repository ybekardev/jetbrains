package org.jetBrains.oop.javagcore.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class ArraysUtils {

    @Test
    void test() {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {6, 7, 8, 9, 3, 5};

        System.out.println(Arrays.equals(num1, num2));

        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.stream(arr).sorted().forEach(n -> System.out.print(n + " "));
        Arrays.sort(arr);
        System.out.printf("\nModified array: %s", Arrays.toString(arr));

        String strArr[] = {"geeks.com", "tutorialpoint.com", "jetbrains.org"};
        System.out.println("\n" + Arrays.toString(strArr));
        Arrays.sort(strArr, Collections.reverseOrder());
        System.out.printf("Sorted string array : %s", Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.printf("\nSorted string array : %s", Arrays.toString(strArr));

        int a = Arrays.binarySearch(arr, 13);
        //if exists - the index will be given, if does not exists -1 will be given
        System.out.printf("\nBinary search: %s", Arrays.binarySearch(arr, 45));
        System.out.printf("\nBinary search: %s", Arrays.binarySearch(arr, 13));
        System.out.printf("\nBinary search: %s", 3);

        int [] number = {1,2,3,4,5};
        Arrays.fill(number, 2,4,10);
        System.out.println("\n" + Arrays.toString(number));
    }
}
