package org.jetBrains.oop.concepts.lambda;

import java.util.function.*;

public class FunctionalInterfaceGroups {

    /*
functions that accept arguments and produce results;
operators that produce results of the same type as their arguments (a special case of function);
predicates that accept arguments and return boolean values (boolean-valued function);
suppliers that accept nothing and return values;
consumers that accept arguments and return no result.
     */

    public static void main(String[] args) {
        /*
        1) Functions
        Each function accepts a value as a parameter and returns a single value.
        For example, the Function<T, R> is a generic interface that represents
        a function that accepts a value of type T and produces a result of type R.
         */
        // String to Integer function
        Function<String , Integer> converter = Integer::parseInt;
        System.out.println(converter.apply("2000"));
        // String to int function
        ToIntFunction<String> converter2  = Integer::parseInt;
        System.out.println(converter2.applyAsInt("3000"));
        // (Integer, Integer) to Integer function
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        System.out.println(sum.apply(2,5));
        BiFunction<Integer, Integer, Integer> sum2 = (x,y) -> x + y;
        System.out.println(sum2.apply(5,7));

        /*
        2) Operators
        Each operator takes and returns the values of the same type.
        For example, UnaryOperator<T> represents an operator that accepts a value of
        type T and produces a result of the same type T.
         */
        // Long to Long multiplier
        UnaryOperator<Long> longMultiplier = val -> val * 10;
        System.out.println(longMultiplier.apply(4L));
        // int to int operator
        IntUnaryOperator intMultiplier = val -> val * 2;
        System.out.println(intMultiplier.applyAsInt(6));
        // (String, String) to String operator
        BinaryOperator<String> appender = (str1, str2) -> str1 + str2;
        System.out.println(appender.apply("Hi" , "Hello"));

        /*
        3) Predicates
        Each predicate accepts a value as a parameter and returns true or false.
        For example, the Predicate<T> is a generic interface that represents a predicate
        that accepts a value of type T and produces a boolean-valued result.
         */
        // Character to boolean predicate
        Predicate<Character> isDigit = Character::isDigit;
        isDigit.test('h'); // the result is false (boolean)
        // int to boolean predicate
        IntPredicate isEven = val -> val % 2 == 0;
        isEven.test(10); // the result is true (boolean)

        /*4) Suppliers
        Each supplier accepts no parameters and returns a single value.
        For example, Supplier<T> represents a supplier that accepts no arguments
        and returns a value of type T.
         */
        Supplier<String> sup = () -> "Hello";
        System.out.println(sup.get());
        BooleanSupplier boolSup = () -> true;
        System.out.println(boolSup.getAsBoolean());
        IntSupplier intSup = () -> 3;
        System.out.println(intSup.getAsInt());

        /*
        5) Consumers
        Each consumer accepts a value as a parameter and returns no output.
        For example, the Consumer<T> is an interface that represents a consumer that accepts
        a value of type T and returns no result.
         */
        Consumer<String> printer = System.out::print;
        printer.accept("Hi");
    }

}
