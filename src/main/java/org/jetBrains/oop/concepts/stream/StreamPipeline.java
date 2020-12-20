package org.jetBrains.oop.concepts.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeline {

    public static void main(String[] args) {

        pipeline();
        takewhile();
        dropwhile();
    }

    /*
    Both methods takeWhile and dropWhile work well in case of ordered streams.
    How to achieve repeatable results in this case?

    to use List instead of Set;
    to add the sorted() method before takeWhile() to keep always the same order of elements within the stream.
    */

    public static void takewhile(){
        //!!!!!!!!!!The takeWhile method stops after taking the element 0, because the condition becomes false.
        //The takeWhile method takes elements from the stream until the first inappropriate element is encountered.
        List<Integer> l = Stream.of(4, 8, 0, 2, 5, 0).takeWhile(n -> n > 1).collect(Collectors.toList());
        l.stream().forEach(System.out::println);
        System.out.println(l);
    }

    public static void dropwhile(){
        // It drops the elements which match the given predicate until the first element does not match it.
        List<Integer> numbers = Stream.of(3, 5, 1, 2, 0, 4, 5).dropWhile(n -> n > 0).collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }

    public static void pipeline(){
        List<String> words = List.of("JAR", "Java", "Kotlin", "JDK", "jakarta");

        long number = words.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("J"))
                .count();
        System.out.println(number);

        //We can see it by ourselves by adding the peek operation to print the intermediate elements of the stream.
        //The output actually means, that the filter operation is applied to an element right after the element was mapped.
        /*
        long numberOfWords = words.stream()
        .map(String::toUpperCase)
        .peek(System.out::println)
        .filter(s -> s.startsWith("JA"))
        .peek(System.out::println)
        .count();
     */
    }
}
