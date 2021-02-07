package org.jetBrains.javacore.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysPractice {

    @Test
    void testArray() {
        int n = 10; // the size of an array
        int[] squares = new int[n]; // creating an array with the specified size

        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // set the value by the element index
        }
        System.out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
    }

    @Test
    void orderOfAnArray() {
        int[] arr = {1, 3, 6, 8, 9, 35, 53, 76, 3};
        boolean broken = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                broken = true;
                break;
            }
        }
        if (broken = true) {
            System.out.println("The array is not ordered");
        } else {
            System.out.println("The array is in order");
        }
    }


    /*  public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number: ");
          int len = scanner.nextInt();
          int [] arr = new int[len];
          for(int i =0; i < len; i++){
              arr[i] = scanner.nextInt();
          }
          System.out.println(Arrays.toString(arr));
      }
  */
    @Test
    void character() {
        char[] ch = {'a', 'r', 'a', 'g', 'a', 'u', 'q', 'a'};
        int count = 0;
        for (char c : ch) {
            if (c == 'a') {
                count++;
                System.out.print("line-1 " + count);
            }
            System.out.print("line-2 " + count);
        }
        System.out.print("line-3 " + count);
    }

    @Test
    public void t() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
    }

 /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
           int  i = scanner.nextInt();
        if (i ==0){
            System.out.println("0");
            break;
        } else if (i % 2 == 1) {
            System.out.println("odd");
        }else if (i % 2 == 0) {
            System.out.println("even");
        }
    }

}*/


    @Test
    public void arrayTest() {
        int[][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < twoD.length; i++) {
            System.out.println(Arrays.toString(twoD[i]));
        }
    }

    @Test
    public void arrayTestToString() {
        int[][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < twoD.length; i++) {
            for (int j : twoD[i]) {
                System.out.println(j);
            }
        }
    }

    @Test
    public void arrayTestToString2() {
        int[][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < twoD.length; i++) {
            for(int j=0; j < i; j++){
                System.out.println(Arrays.toString(twoD[j]));
            }
        }
    }

    public String[] charArrayLenght(int lenArr){
        return new String [lenArr];
    }

    public static int divideBy(int number, int times){
        if(times <= 0){
            return number;
        }
        for(int i =0; i < times; i++){
            number /= 2;
        }
        return number;
    }

    @Test
    public void testMethod(){
        System.out.println(divideBy(80,2));
        System.out.println(Arrays.toString(charArrayLenght( 5)));
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        sawpFandL(num);
    }

    public static void sawpFandL(int[] nums){
        if(nums.length < 1){
            return;
        }
        int temp = nums[nums.length-1];
        nums[nums.length-1] = nums[0];
        nums[0]= temp;
        System.out.println(Arrays.toString(nums));
    }


}
