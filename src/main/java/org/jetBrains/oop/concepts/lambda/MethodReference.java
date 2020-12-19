package org.jetBrains.oop.concepts.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> maxNum = Integer::max;
        System.out.println(maxNum.apply(34,76));

        BiFunction<Integer, Integer, Integer> maxNum2 = (num1, num2) -> Integer.max(num1, num2);
        System.out.println(maxNum2.apply(43,87));

        //1) Reference to a static method
        Function<Double, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(100D));
        Function<Double, Double> sqrt2 = num -> Math.sqrt(num);
        System.out.println(sqrt2.apply(100D));

        //2) Reference to an instance method of an object
        String str = "What is going on here?!";
        Function<String, Integer> index = str::indexOf;
        System.out.println(index.apply("?"));
        Function<String, Integer> index2 = str2 -> str.indexOf(str2);
        System.out.println(index2.apply("!"));

        //3) Reference to an instance method of an object of a particular type
        Function<Long, Double> val = Long::doubleValue;
        System.out.println(val.apply(200L));
        Function<Long, Double> val2 = l -> l.doubleValue();
        System.out.println(val2.apply(300L));

        //4) Reference to a constructor
        Function<String, Lambda> generator = Lambda::new;
        System.out.println(generator.apply("New method"));
        Function<String, Lambda> generator2 = l -> new Lambda(l);
        System.out.println(generator2.apply("Newest method"));
    }





}
