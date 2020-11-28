package org.jetBrains.oop.concepts;

import java.util.Scanner;

public class Concatenation {

    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        if (firstName != null && lastName != null) {
            String s = firstName + " " + lastName;
            return s;
        } else if (firstName != null && lastName == null) {
            String s = firstName;
            return s;
        } else if (firstName == null && lastName != null) {
            String s = lastName;
            return s;
        }
        return null;
    }


    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}
