package org.jetBrains.oop.javacore.practice;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Loops {

    //Reading a sequence with an unknown length
    //The while loop can also be used to read a sequence of characters of an arbitrary length.
    // For that, we can invoke hasNext() method of Scanner inside the condition.
    // The method returns true if the next element exists and false otherwise.

    @Test
    void loop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = 0;
        while(scanner.hasNext()){
            int element = scanner.nextInt();
            num =+ element;
        }
        System.out.println(num);
    }

    @Test
    void scan(){
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        while(num != 0){
            num = scan.nextInt();
            sum =+ num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*    int num = 1;
        int sum = 0;
        while(num != 0){
            num = scan.nextInt();
            System.out.println( sum += num);
        }
        System.out.println(sum);*/


        int a = scan.nextInt();
        int b = 1;
        int sq = 0;

        for(int i =1; a>sq; a--){
            sq = i*i;
            System.out.println(sq);
            i++;
        }
    }

@Test
    public void breakStatement(){
    boolean stopped = false;
    for (int i = 0; (i < 10) && !stopped; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
            if (i == j) {
                stopped = true;
                break;
            }
        }
        System.out.println();
    }
}

    @Test
    public void breakStmnt(){
        boolean stopped = false;
        for (int i = 0; (i < 10) && !stopped; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    stopped = false;
                    break;
                }
            }
            System.out.println();
        }
    }
}
