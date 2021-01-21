package org.jetBrains.oop.javacore.practice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

public class MapPractices {

    @Test
    public void immutableMapPractice() {

        Map<String, String> map = Map.of(
                "Bob", "216 354 3452",
                "Heisenberg", "816 845 8764",
                "Rob", "216 354 3452");

        System.out.println(map);

        System.out.println(map.get("Bob"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }

    @Test
    public void mutableMapPractice() {

        //This implementation is often used in practice since
        //it is highly-optimized for putting and getting pairs.
        Map<Integer, String> products = new HashMap<>();
        products.put(8, "Notebook");
        products.put(23, "Pencils");
        products.put(6, "Marker");
        products.putIfAbsent(2, "Eraser");

        System.out.println(products);
        System.out.println(products.entrySet());

        //The LinkedHashMap stores the order in which elements were inserted.
        //Always printed as ordered
        Map<Integer, String> prod = new LinkedHashMap<>();
        prod.put(8, "Notebook");
        prod.put(23, "Pencils");
        prod.put(6, "Marker");
        prod.putIfAbsent(2, "Eraser");

        System.out.println(prod);
        System.out.println(prod.entrySet());


        //The TreeMap class represents a map that
        //gives us guarantees on the order of the elements.
        //This class implements the SortedMap interface which extends the base Map interface.
        //Use TreeMap only when you really need the sorting order of elements since this implementation is less effective than HashMap.
        SortedMap<LocalDate, String> events = new TreeMap<>();
        events.put(LocalDate.of(2017, 6, 6), "The Java Conference");
        events.put(LocalDate.of(2017, 6, 7), "Another Java Conference");
        events.put(LocalDate.of(2017, 6, 8), "Discussion: career or education?");
        events.put(LocalDate.of(2017, 6, 9), "The modern art");
        events.put(LocalDate.of(2017, 6, 10), "Coffee master class");

        LocalDate fromInclusive = LocalDate.of(2017, 6, 8);
        LocalDate toExclusive = LocalDate.of(2017, 6, 10);

        System.out.println(events.subMap(fromInclusive, toExclusive));


        //It is impossible to directly iterate over a map since it does not implement
        //the Iterable interface. Fortunately, some methods of maps return other
        //collections which are iterable.
        for (int n : products.keySet()) {
            System.out.println(n);
        }

        for (String s : products.values()) {
            System.out.println(s);
        }

        products.forEach((num, val) -> System.out.println(num + " : " + val));

        // Print keys and values
        for (int i : products.keySet()) {
            System.out.println("key: " + i + ", value: " + products.get(i));
        }
        int count = 0;
        for (int key : products.keySet()) {
            count++;
            System.out.println(count + ". key : " + key + ", value : " + products.get(key));
        }

        for(Map.Entry<Integer, String> entry : products.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

}


class Example {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String str = "aa ff grt dd";
        char[] c = str.toCharArray();

        for (char ch : c) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }

        for (Map.Entry entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
