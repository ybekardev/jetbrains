package org.jetBrains.oop.javagcore.practice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimePractices {

    @Test
    public void testDate(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate date = LocalDate.of(2017, 9, 5);
        LocalDate date2 = LocalDate.parse("2019-03-09");
        System.out.println(date);
        System.out.println(date2);

        LocalDate date3 = LocalDate.ofYearDay(2017,18);
        System.out.println(date3);

        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
    }

    @Test
    public void testTime(){
        LocalTime localTime = LocalTime.of(11,23,56);

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(11,45,43));
        System.out.println(LocalTime.parse("20:45:32"));
        System.out.println(LocalTime.ofSecondOfDay(12345));
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.plusHours(3));
        System.out.println(localTime.withHour(6));
    }

    @Test
    public void testLocalDateTime(){
        LocalDateTime localDateTime =  null;
        System.out.println(LocalDateTime.of(2017,06,24,05,45));
        System.out.println(LocalDateTime.parse("2012-11-26T23:40"));

    }
}
