package org.jetBrains.algorithms;

public class CountNonDuplicatesInArray {
    /*# Remove Duplicates from Sorted Array
# Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
# Do not allocate extra space for another array, you must do this by modifying the input array in-place
# Example:
# Given nums = [0,0,1,1,1,2,2,3,3,4],
# Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
# It doesn't matter what values are set beyond the returned length.*/

    public static void main(String[] args) {
        System.out.print(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        //in case of 1st and 2nd index is equal it will skip counting since they are equal it will not enter the loop
        System.out.print("The array is: " + nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                System.out.print(nums[i]);
                count++;
            }
        }
        System.out.print("\nThe length is: ");
       // System.out.println(count);

        return count;
    }
}
