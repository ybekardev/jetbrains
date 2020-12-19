package org.jetBrains.oop.concepts.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMap {

    public static void main(String[] args) {
        mapFilter();
    }

    public static void mapFilter(){
        List<Integer> list  = Arrays.asList(1,4,7,8,5,4,2,6);
        list.stream().filter(n -> n % 2 ==0).forEach(System.out::println);

        //Stream<List<Integer>> str1 = Stream.of(Arrays.asList(2,6,8,1,3,9,4)); not working somehow

        List<Integer> str1 = Arrays.asList(2,6,8,1,3,9,4);
        str1.stream().map(n -> n / 2).collect(Collectors.toList());
        System.out.println(str1);

        Stream<Integer> str = Stream.of(2,6,8,1,3,9,4);
        str.map(n -> n / 2).forEach(System.out::println);
    }


}
