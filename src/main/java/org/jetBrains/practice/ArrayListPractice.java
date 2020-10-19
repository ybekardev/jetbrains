package org.jetBrains.practice;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ArrayListPractice {

    @Test
    public void testList(){
        List<Long> powersOfTen = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            long power = (long) Math.pow(10, i);
            powersOfTen.add(power);
            System.out.println(power);
        }
        System.out.println(powersOfTen);

        for(Long value : powersOfTen){
            System.out.println(value);
        }
    }

    @Test
    public void testList2(){
        List<String> l = new ArrayList<>();
        l.add("ArrayList");
        l.add("is");
        l.add("a");
        l.add("resized");
        l.add("array");
        System.out.println(l);
        l.remove(1);
        l.remove("a");
        l.remove(2);
        //l.set(1, "Hello");
        System.out.println(l);

        List<String> ls = new ArrayList<>(Arrays.asList("Hello", "World!"));
        System.out.println(ls);
    }

    @Test
    public void collectionTest(){
        Collection<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Kurdish");
        languages.add("Turkish");

        System.out.println(languages.size());

        for(String s : languages){
            System.out.println(s);
        }
        languages.forEach(System.out::println);
        languages.forEach(l -> System.out.println(l));
        languages.removeIf(ln -> ln.equals("Turkish"));
        System.out.println(languages);
        /*It is important to understand that the order of the elements in the ArrayList is anyway preserved. We simply cannot call the get method via the Collection interface.*/
    }

    @Test
    public void ofTest(){
        List<String> daysOfWeek = List.of(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );
        System.out.println(daysOfWeek);

        List<String> weekDays = daysOfWeek.subList(0, 5);
        System.out.println(weekDays);


    }


}
