package org.jetBrains.oop.concepts.mapflatmap;

import java.util.List;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args) {

        System.out.println(reduce());

    }

    public static Optional<Integer> reduce(){
        List<Integer> transactions = List.of(20, 40, -60, 5);
        System.out.println(transactions);
        return transactions.stream().reduce((sum, transaction) -> sum + transaction);
    }
}
