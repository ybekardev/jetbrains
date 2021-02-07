package org.jetBrains.javacore.algorithms;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = { 10, 13, 19, 20, 24, 26, 30, 34, 35 };
        int from = 0, to = array.length - 1;
        //System.out.println(binarySearch(array, 19, from, to));

        //System.out.println(binarySearch(new int[] {1,4,6,8,9,3,5,7,6}, 8, 0, 9));

        System.out.println(recursiveSearch(new int[] {1,4,6,8,9,3,5,7,6}, 8, 0, 9));

    }

    //Binary search is a fast algorithm for finding the position of an element in a sorted array.
    public static int binarySearch(int[] array, int elem, int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(elem == array[mid]){
                return mid;
            }else if(elem < array[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    //The recursive implementation makes a recursive call instead of using a loop.
    public static int recursiveSearch(int[] array, int elem, int left, int right){
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;

        if(elem == array[mid]){
            return mid;
        }else if(elem < array[mid]){
            return recursiveSearch(array, elem, left, mid -1 );
        }else{
            return recursiveSearch(array, elem, mid + 1, right);
        }
    }

}
