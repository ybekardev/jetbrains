package org.jetBrains.javacore.w3schools;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDates {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));
    }

    /*
    Value	       Example
    yyyy-MM-dd	   "1988-09-29"
    dd/MM/yyyy	   "29/09/1988"
    dd-MMM-yyyy	   "29-Sep-1988"
    E, MMM dd yyyy "Thu, Sep 29 1988"
     */

    @Test
    public void test(){
        String s = "a";
        String  s2 = "a";
        String s3 = new String("a");

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s2 == s3);

        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s3));

    }
}
