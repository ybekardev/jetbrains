package org.jetBrains.oop.concepts.lambda;

import java.util.function.*;

public class Lambda {

    public Lambda(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        greetings("Anastacia");
        System.out.println(addNumber(300));
        lengthOf("Hello123321");
        System.out.println(multiply(4, 6));
        System.out.println(multiply1(4));
        System.out.println(multiply2(4));
        multiply3(4);

        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });
        printResultOfLambda(s -> s.length());
        printResultOfLambda2("Bye Bye 2020");
        System.out.println(unaryOperator.applyAsLong(32));
        System.out.println(unaryOperator.applyAsLong(3));
        System.out.println(unaryOperator.applyAsLong(5));
        System.out.println(unaryOperator.applyAsLong(8));
        System.out.println(doubleUnaryOperator.applyAsDouble(2));
        System.out.println(intBinaryOperator.applyAsInt(3, 7));
        System.out.println(ibo.applyAsInt(7, 3));
        System.out.println(stringUnaryOperator.apply(" Hello "));

    }

    //capture values from a context where the lambda is defined and use
    // the values within the body, this technique is called closure.
    public static void greetings(String person) {
        final String hello = "Hello, ";
        Function<String, String> greetings = (name) -> hello + name + "!";
        System.out.println(greetings.apply(person));
    }

    public static int addNumber(int add) {
        final int constant = 100;
        //the function takes an integer and returns an integer
        Function<Integer, Integer> adder100 = x -> constant + add;
        return adder100.apply(add);
    }

    public static void lengthOf(String str) {
        //the function takes a string and returns integer
        Function<String, Integer> f = s -> s.length();
        System.out.println("The length of the string is: " + f.apply(str));
    }

    public static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("HAPPY NEW YEAR 2021!"));
    }

    public static void printResultOfLambda2(String str) {
        Function<String, Integer> function = s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        };
        System.out.println(function.apply(str));
    }

    public static int multiply(int a, int b) {
        //The expression has the type BiFunction<Integer, Integer, Integer> which means,
        // that it takes two Integer values and returns another Integer value.
        BiFunction<Integer, Integer, Integer> mult = (x, y) -> x * y;
        return mult.apply(a, b);
    }

    public static int multiply1(int a) {
        // if it has only one argument "()" are optional
        Function<Integer, Integer> mult = x -> x * 5;
        return mult.apply(a);
    }

    public static int multiply2(int a) {
        // without type inference
        Function<Integer, Integer> mult = (Integer x) -> x * 2;
        return mult.apply(a);
    }

    public static void multiply3(int a) {
        // with multiple statements use { } curly braces
        Function<Integer, Integer> mult = (x) -> {
            x = x * 20;
            x = x * 30;
            return x;
        };
        System.out.println(mult.apply(a));
    }

    public static LongUnaryOperator unaryOperator = num -> {
        if (num % 2 == 0 && num > 0) {
            return num;
        } else if (num % 2 != 0 && num > 0) {
            return num + 1;
        }
        return num;
    };

    //A lambda expression that accepts a long value and returns a next even number.
    public static LongUnaryOperator longUnaryOperator = (long num) -> num % 2 == 0 ? num + 2 : num + 1;

    //Using closure write a lambda expression that calculates a*x^2 + b*x + c
    public static int a = 10;
    public static int b = 20;
    public static int c = 30;
    public static DoubleUnaryOperator doubleUnaryOperator = num -> a * num * num + b * num + c;

    //A lambda expression that accepts two integer arguments and returns max of them.
    public static IntBinaryOperator intBinaryOperator = (x, y) -> {
        if (x > y) {
            return x;
        } else {
            return y;
        }
        //return 0;
    };

    public static IntBinaryOperator ibo = (x, y) -> x > y ? x : y;

    //A lambda expression that adds PREFIX (before) and SUFFIX (after) to
    // its single string argument; PREFIX and SUFFIX are final variables.
    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> stringUnaryOperator = str -> PREFIX + str.trim() + SUFFIX;

    // https://www.youtube.com/watch?v=VLTEPWkEhsg&ab_channel=edureka%21
}
