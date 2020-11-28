package org.jetBrains.oop.concepts;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if(firstName != null) {
            this.firstName = firstName;
        }else{
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null) {
            this.lastName = lastName;
        }else{
            this.lastName = "";
        }
    }

    /*
    public String getFullName() {
        String fullName = firstName + " " + lastName;
        if (fullName.trim().length() == 0) {
            return "Unknown";
        }
        return fullName;
    }
     */

    public String getFullName() {
        if (firstName != null && lastName != null) {
            String name = firstName + " " + lastName;
            return name;
        }else if (firstName != null && lastName == null) {
            String name = firstName;
            return name;
        } else if (firstName== null && lastName != null) {
            String name = lastName;
            return name;
        }else if (firstName == null && lastName == null) {
            String name = "unknown";
            return name;
        }
        return "";
    }



    static class Test {
        public static void main(String[] args) throws InterruptedException {
            User tim = new User();
            tim.setFirstName("Tim");
            tim.setLastName("Towler");
            System.out.println(tim.getFullName()); // Tim Towler

            User katie = new User();
            katie.setFirstName("Katie");
            katie.setLastName(null);
            System.out.println(katie.getFullName()); // Katie (without additional spaces)

        }
    }
}
