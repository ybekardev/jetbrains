package org.jetBrains.javacore.practice;

import org.junit.jupiter.api.Test;
import java.util.*;

public class IterablePractice {

    //The Collection interface extends Iterable, but Map does not.
    //Due to this, any collection class (List, Queue, Set) can be considered as Iterable.

    @Test
    public void iterabletest() {
        Iterable<String> iterable = List.of("first", "second", "third");
        iterable.forEach(s -> System.out.println(s));
        for (String s : iterable) {
            System.out.println(s);
        }
        iterable.forEach(System.out :: println);

        System.out.println("--- SET ---");
        Set<String> s = Set.of("first", "second", "third");
        s.forEach(word -> System.out.println(word));

        Set<Integer> i = Set.of(1,2,3,4,5);
        i.forEach(n -> System.out.println(n));
        System.out.println("The value: " + i);


        System.out.println("--- Iterator ---");

        //Using iterators
        //In some sense, it is like a moveable "pointer" to an element of the collection.
        //The typical usage includes three steps:
        //Check the collection has next element.
        //Obtain the next element.
        //Process the obtained element.

        Set<Long> n = new TreeSet<>();
        n.add(10L);
        n.add(5L);
        n.add(18L);
        n.add(3L);
        n.add(5L);//will not be added since duplicated

        n.forEach(num -> System.out.println(num));


        System.out.println("--- iterator2 ---");

        Iterator<Long> it = n.iterator();
        while(it.hasNext()){
            Long current = it.next();
            if(current<10L){
                it.remove();
            }
        }
        System.out.println(n);


        System.out.println("--- iterator2 ---");

        List<Integer> ls = List.of(1,2,3,4,5,6);
        ListIterator<Integer> iter = ls.listIterator();
        System.out.println(ls);

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        while(iter.hasPrevious()){
            int previous = iter.previousIndex();
            int element = iter.previous();
            System.out.println(element + " was on previous index of " + previous);
        }


        Set<Integer> number = new HashSet<>();
        number.add(3);
        number.add(4);
        number.add(2);
        number.add(3);

        System.out.println(number);
        number.forEach(nm -> System.out.println(nm));
        number.forEach(System.out::println);

        Iterator<Integer> iter2 = number.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }

    }
}
