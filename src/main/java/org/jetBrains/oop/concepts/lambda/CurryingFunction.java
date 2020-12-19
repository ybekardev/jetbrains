package org.jetBrains.oop.concepts.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class CurryingFunction {

    //Currying is a technique for translating the evaluation of a function that takes multiple parameters into evaluating a sequence of functions, each with a single argument.
    IntBinaryOperator notCurriedFun = (x, y) -> x + y; // not a curried function
    IntFunction<IntUnaryOperator> curriedFun = x -> y -> x + y; // a curried function

    public static void main(String[] args) {
        Function<String, Consumer<String>> say = what -> who -> System.out.println(what + " - " + who);
        List<String> friends = Arrays.asList("John", "Joe", "Jose");
        Consumer<String> sayHi = say.apply("Hi");

        friends.forEach(sayHi);
    }



}
