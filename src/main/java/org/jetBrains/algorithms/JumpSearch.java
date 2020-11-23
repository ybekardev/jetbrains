package org.jetBrains.algorithms;

public class JumpSearch {

    public static void main(String[] args) {

        int[] array = { 10, 13, 19, 20, 24, 26, 30, 34, 35 };
        System.out.println(jumpSearch(array, 26));
    }

    // Jump search (also known as block search) is an algorithm for finding the position of an element in a sorted array.
    // Unlike the linear search, it doesn't compare each element of an array with the target value.
    // It splits the given array into a sequence of blocks and then jumps over them to find a block that may contain the target element.
    // To do that, the algorithm compares the right borders of blocks with the target element.

    public static int jumpSearch(int[] array, int target) {
        int currentRight = 0;
        int prevRight = 0;

        //if the array is empty
        if (array.length == 0) {
            return -1;
        }
        //checking the first element if it contains
        if (array[currentRight] == target) {
            return 0;
        }

        int jumpLength = (int) Math.sqrt(array.length);

        //finding a block where the element may be present
        while (currentRight < array.length - 1) {
            currentRight = Math.min(array.length - 1, currentRight + jumpLength);
            if (array[currentRight] >= target) {
                break; //foud the block that may contain the target element
            }
            prevRight = currentRight;

            if ((currentRight == array.length - 1) && target > array[currentRight]) {
                return -1;
            }
        }
        return backwardSearch(array, target, prevRight, currentRight);
    }


    public static  int backwardSearch(int [] array, int target, int leftExcl, int rightExcl ){

        for(int i = rightExcl; i > leftExcl; i--){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

}
