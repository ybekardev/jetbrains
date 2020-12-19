package org.jetBrains.oop.concepts.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamFilter {

    public static void main(String[] args) {
        System.out.println(prime());
        System.out.println(prime1());
        prime2();
    }

    public static List prime(){
        List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
        List<Integer> filteredPrime = primeNumbers.stream()
                .filter(n -> n >= 11 && n <= 23)
                .collect(Collectors.toList());
        return filteredPrime;
    }

    public static List prime1(){
        List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
        List<Integer> filteredPrime = primeNumbers.stream()
                //multiple filters
                .filter(n -> n >= 11)
                .filter(n -> n <= 23)
                .collect(Collectors.toList());
        return filteredPrime;
    }

    public static void prime2(){
        List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
        //using predicate
        Predicate<Integer> between11_23 = n -> n >=11 && n <= 23;
        List<Integer> list = primeNumbers.stream().filter(between11_23).collect(Collectors.toList());
        System.out.println(list);
    }

    private static boolean isPrime(long number) {
        if (number == 2) {
            return true;
        }
        return LongStream
                .iterate(2, n -> n + 1)
                .limit((long) Math.sqrt(number))
                .filter(n -> number % n == 0)
                .count() == 0;
    }

    private static boolean isPrime1(long number) {
        return LongStream
                .rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);

    }
}
