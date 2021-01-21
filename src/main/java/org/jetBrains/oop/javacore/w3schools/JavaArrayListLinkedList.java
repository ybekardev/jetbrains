package org.jetBrains.oop.javacore.w3schools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class JavaArrayListLinkedList {

    public static void main(String[] args) {

        linkedListMethod();
        arrayListUtil();
    }
    public static void arrayListUtil() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Acura");

        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars.set(3, "Honda"));
        System.out.println(cars.remove(2));
        //cars.clear();
        System.out.println(cars.size());

        System.out.println("***");

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("***");

        for(String s : cars){
            System.out.println(s);
        }

        System.out.println("***");

        cars.forEach(c -> System.out.println(c));

        System.out.println("***");

        cars.forEach(System.out :: println);

        System.out.println("***");

        Collections.sort(cars);
        System.out.println(cars);
    }

    public static void linkedListMethod() {
        /*
        The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
        The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list.

        When To Use
        It is best to use an ArrayList when:
        You want to access random items frequently
        You only need to add or remove elements at the end of the list

        It is best to use a LinkedList when:
        You only use the list by looping through it instead of accessing random items
        You frequently need to add and remove items from the beginning or middle of the
        list
         */

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);

        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(15);
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        int first = linkedList.getFirst();
        int last = linkedList.getLast();
        System.out.println(first + " - " + last);
    }




}
