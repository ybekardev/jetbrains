package org.jetBrains.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class FindTheMaxNumber {

    public static void main(String[] args) {
      /*  int max = findMax(new int[]{1, 53, 23, 67, 23, 67, 23}); //the highest number is 67 at index 3 and 5, the index 3 will be picked
        System.out.println(max);
        int max2 = findMax(new int[]{});
        System.out.println(max2);

        System.out.println(countEven(new int []{ 3, 8, 8 }));

        System.out.println(searchIndex(new int[]{12,34,67,42,7}, 4));
        System.out.println(searchIndex(new int[]{12,34,67,42,7}, 6));

        System.out.println(search(new int[]{12,4,67,42,7}, 4));
        System.out.println(search(new int[]{12,34,63,42,7}, 6));

        System.out.println(contains(new int[]{12,4,67,42,7}, 6));
       */

        System.out.println(Arrays.toString(innerArray(new int[]{15, 10, 18, 17, 15}, new int[]{10, 10, 15, 10, 17, 17})));
        System.out.println(findIndexOfMax(new int[]{15, 10, 18, 17, 15}));

    }

    public static int findMax(int[] num) {
        int index = 0;
        if (num.length == 0) {
            return -1;
        }
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                index = i;
            }
        }
        System.out.println("The index of the array: " + index);
        return max;
    }

    public static int countEven(int[] numbers) {
        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 4 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int searchIndex(int [] num, int index){
        if(index > num.length){
            return -1;
        }
        int number = 0;
        for(int i = 0; i < num.length; i++){
            number = num[index];
        }
        return number;
    }

    public static int search(int[] num, int value){
        int index = -1;
        for(int i = 0; i < num.length; i++){
            if(num[i] == value){
                index = num[i];
                break;
            }
        }
        return index;
    }

    public static boolean contains(int[] numbers, int number) {
        // write your code here
        for(int i=0; i < numbers.length; i++){
            if(numbers[i] == number){
                return true;
            }
        }
        return false;
    }

    public static int[] innerArray(int[] n, int[] m){
        List<Integer> ls = new ArrayList<>();
        int[] num = new int[1];
        int counter= 0;
        //String count = "";
        for(int i=0; i< n.length; i++){
            counter = 0;
            for(int j=0; j< m.length; j++){
                if(n[i] == m[j]){
                    counter ++;
                }
            }
            ls.add(counter);
            //count = count + counter;
        }
        //int val = parseInt(count);
        //System.out.println(val);
        System.out.println(ls);
        //num[0] = val;
        int [] nmb = new int[1];
        return nmb;
    }

    public static int findIndexOfMax(int [] numbers){
        int index = 0;
        for(int i =0; i <numbers.length; i++){
            if(numbers[i] > numbers[index]){
                index = i;
            }
        }
        return index;
    }
}
