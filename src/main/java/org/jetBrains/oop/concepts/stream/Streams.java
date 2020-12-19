package org.jetBrains.oop.concepts.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        List<Integer> num = List.of(1, 3, 6, 8, 0);
        //with lambda
        num.forEach(n -> System.out.print(n + " - "));
        System.out.println();
        //with a for loop
        for(int i = 0; i < num.size(); i++){
            System.out.print(num.get(i) + " - ");
        }
        System.out.println();
        //with stream
        System.out.println(Arrays.toString(num.stream().toArray()));
        num.stream().forEach(System.out::println);

        listOfCompanies();
        skipNumber();
        count();

    }

    public static void listOfCompanies(){
        List<String> companies = List.of("Google", "Amazon", "Samsung", "GOOGLE", "amazon", "Oracle");
        companies.stream().map(String::toUpperCase).distinct().forEach(System.out::println);
    }

    public static void skipNumber(){
        List<Integer> num = List.of(2,4,1,8,3,6,1,5,9,3);
        num.stream().skip(5).filter(n -> n > 2).forEach(System.out::println);
    }

    public static void count(){
        List<Double> d = List.of(3.6,6.7,2.7,1.8,4.2,2.8);
        Long count = d.stream().filter(n -> n > 2).count();
        System.out.println("The count is : " + count);
    }
}
