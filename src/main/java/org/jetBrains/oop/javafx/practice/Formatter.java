package org.jetBrains.oop.javafx.practice;

import java.util.Scanner;

public class Formatter {

    public void printOut(){
        String string = "Hello world!";
        int number = 3;
        char c = 'c';
        double d = 23445.6;

        System.out.println(string + " - " + number + " - " + c + " - " + d);
    }

    public static void main(String[] args) {
        //formattedPrint();
        intro();
    }
    //@Test
    public static void formattedPrint(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        char c = scanner.next().charAt(0);
        float f = scanner.nextFloat();

        System.out.printf(
                "\n The string value is: %s " +
                "\n The int value is: %d " +
                "\n The char value is: %c " +
                "\n The float value is: %.2f"
                ,s,i,c,f);
    }

    //@Test
    public static void intro(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        char sex = scanner.next().charAt(0);
//        float height = scanner.nextFloat();
//        double pop = scanner.nextDouble();
        String.format("The name is %s ", name);
        System.out.println(name);
       //  System.out.printf("\n Name is: %s \n Age is: %d \n Sex is: %c \n Height is: %.2f \n pop is %f", name, age, sex, height, pop);
    }
}
