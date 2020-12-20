package org.jetBrains.oop.concepts.mapflatmap;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.*;

public class Job {
    private String title;
    private String description;
    private double salary;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Demo {
    public static void main(String[] args) {
        Job jobs = new Job();
        jobs.setTitle("Java");
        jobs.setDescription("Coding");
        jobs.setSalary(125000.00D);

        Stream<Job> titles = Stream.of(jobs);
        titles.map(Job::getTitle).forEach(System.out::println);

        //the below one does not work somehow
        /*List<String> titles = jobs.stream()
                .map(Job::getTitle) // get title of each job
                .collect(Collectors.toList()); // collect titles to a new list*/

        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        List<Double> l = randomNumbers.collect(Collectors.toUnmodifiableList());
        l.stream().forEach(System.out::println);

        DoubleStream.generate(Math::random).limit(10).forEach(System.out::println);

        //Stream<T> iterate(T seed, UnaryOperator<T> next)
        System.out.println("Iterate:");
        Stream.iterate(1, x -> x +2).limit(8).forEach(System.out::println);

        System.out.println("Odd Numbers:");
        Stream<Integer> oddNums = Stream.iterate(1, x -> x + 2).limit(9);
        oddNums.forEach(System.out::println);

        //Stream<T> iterate(T seed, Predicate<T> hasNext, UnaryOperator<T> next)
        System.out.println("Double Even Numbers:");
        Stream<Double> evenNums = Stream.iterate(0.0, x -> x < 20.0, x -> x + 2.0).limit(10);
        evenNums.forEach(System.out::println);

        Stream.iterate(1, x -> x < 10, x -> x + 2).forEach(System.out::println); // 1 3 5 7 9

        System.out.println("Int Even Numbers:");
        Stream<Integer> evenNums2 = Stream.iterate(0, x -> x < 10, x -> x + 2).limit(8);
        evenNums2.forEach(System.out::println);

        IntStream.of(1, 2, 3, 4).asDoubleStream().forEach(System.out::println); // it prints doubles 1.0, 2.0, ...

        List<Integer> number = List.of(1, 5, 9);
        int sum1 = number.stream().mapToInt(i -> i).sum(); // 15
        System.out.println(sum1);

        int[] numbers = { 10, 11, 25, 14, 22, 21, 18 };

        int max = IntStream.of(numbers).max().getAsInt();
        System.out.println(max); // 25

        int min = IntStream.of(numbers).min().getAsInt();
        System.out.println(min); // 10

        double avg = IntStream.of(numbers).average().orElse(0.0);
        System.out.println(avg); // 17.2857...

        int sum = IntStream.of(numbers).sum();
        System.out.println(sum); // 121

        IntSummaryStatistics stat = IntStream.rangeClosed(1, 55).summaryStatistics();
        System.out.println(String.format("Count: %d, Min: %d, Max: %d, Avg: %.1f",
                stat.getCount(), stat.getMin(), stat.getMax(), stat.getAverage()));
    }
}


