package org.jetBrains.practice;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.math.BigInteger;

public class MathClass {

    @Test
    public void mathTest() {
        //BigInteger is IMMUTABLE!!!
        BigInteger bigInteger = new BigInteger("43253433353454534534534455675664352353634523344334534534323");
        System.out.println(bigInteger);

        BigInteger zero = BigInteger.ZERO;
        BigInteger num = BigInteger.TEN;
        System.out.println(zero + " - " + num);

        BigInteger a = num.add(BigInteger.TWO);
        BigInteger b = BigInteger.valueOf(33432);
        BigInteger c = num.multiply(BigInteger.TWO);//.sqrt().mod().divide().abs().pow().min()max()
        System.out.println(a + "" + b + "" + c);

        //Process ONLY two values
        int n = Math.min(1, 5);
        int m = Math.max(1, 5);

        int abs = Math.abs(-10);
        double floor = Math.floor(3.45);
        double ceil = Math.ceil(3.45);
        double sqrt = Math.sqrt(2);
        double cuberoot = Math.cbrt(9);
        double sqr = Math.pow(2, 2);

        System.out.println("" + n + m + abs + ceil + floor + sqr + sqrt + cuberoot);

        /*Scanner scanner = new Scanner(System.in);
        double ab = scanner.nextDouble();
        double ba = scanner.nextDouble();
        System.out.println(Math.pow(ab,ba));
*/

        //Immutable!!!
        BigInteger current = BigInteger.ZERO;
        current.add(BigInteger.valueOf(1000));
        current.subtract(BigInteger.valueOf(10));
        BigInteger result = current.add(BigInteger.ONE);
        System.out.println(result);
    }


    @Test
    public void randomTest(){
        Random random = new Random();
        System.out.println(random.nextInt(8));
        System.out.println(random.nextInt(8));

    }

    public static void main(String[] args) {
        //Unfortunately, the Random class does not provide a method to generate numbers in a range.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Random random = new Random();

        int interValue = a - b + 1;
        System.out.println(random.nextInt(interValue));
    }

}
