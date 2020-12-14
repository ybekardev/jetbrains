package org.jetBrains.oop.concepts.anonymousInnerClass;

import java.util.Scanner;

public class Mathematics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        divide(a, b, new Callback(){
            @Override
            public void calculate(int result) {
                String testToPrint = String.format("%d / %d is %d", a,b, result);
                System.out.println(testToPrint);
            }
            @Override
            public void failed(String errorMsg) {
                System.out.println(errorMsg);
            }
        });


    }

    static void divide(int a, int b, Callback callback){
        if(b == 0){
            callback.failed("ERROR: Division by zero!");
            return;
        }
        callback.calculate(a / b);
    }
}

//Another approach
class Caller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Callback callback = new Callback() {
            @Override
            public void calculate(int result) {
                System.out.println(a / b);
            }
            @Override
            public void failed(String errorMsg) {
                System.out.println(errorMsg);
            }
        };

        if(b == 0) {
            callback.failed("Error, Division by zero!");
            return;
        }else {
            callback.calculate(a / b);
        }
    }
}


