package org.jetBrains.oop.concepts.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        List<Integer> num = List.of(1, 4, 2, 5, 3, 5, 6, 7, 8);
        Stream<Integer> numStream = num.stream();
        numStream.forEach(System.out::println);

        Set<String> concept = Set.of("functions", "lazy", "immutable");
        Stream<String> conStream = concept.stream();
        conStream.forEach(System.out::println);

        Stream<Double> doubleStream = Arrays.stream(new Double[]{ 1.01, 1d, 0.99, 1.02, 1d, 0.99 });
        doubleStream.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("some values");
        Stream<String> stream2 = Stream.of("/* some values */");
        Stream<String> resultStream = Stream.concat(stream1, stream2);
        resultStream.forEach(System.out::println);

        Stream<String> persons = Stream.of("John", "Demetra", "Cleopatra");
        persons.sorted().forEach(System.out::println);

    }
}
