package org.jetBrains.oop.javagcore.practice;

import org.junit.jupiter.api.Test;
import java.util.*;

public class SetCollections {

    //there are immutable and mutable sets. They can be both unordered and ordered, but always do not contain duplicates.
    //if ORDER -> pick TreeSet, if container -> pick HasTable
    @Test
    public void setPracticeImmutable(){
        Set<String> names = Set.of("Hasan", "Nermin", "Yusuf");
        System.out.println(names);

        names.forEach(n -> System.out.println(n));
        names.forEach(System.out::println);

        for(String n : names){
            System.out.println(n);
        }
    }

    @Test
    public void setPracticeMutable(){
        //It uses hash codes of elements to effectively store them.
        // It makes no guarantees as to the iteration order of the set; in particular,
        // it does not guarantee that the order will remain constant over time.

        //In practice, sets are often used to check whether some elements
        // belong to them. The HashSet class is especially recommended
        // for such cases since its contains operation is highly optimized.
        Set<String> cities = new HashSet<>();
        cities.add("San Antonio");
        cities.add("Charlotte");
        cities.add("Dallas");
        cities.add("Dallas");

        System.out.println(cities.size()); // the size is 4 but no DUPLICATION is allowed
        cities.forEach(c -> System.out.println(c));
        cities.forEach(System.out::println);


        //The TreeSet class represents a set that gives us guarantees on the order of the elements.
        // It corresponds to the sorting order of the elements determined
        // either by their natural order or by specific Comparator implementation.

        //The TreeSet class implements the SortedSet interface which extends the base Set interface.
        //The SortedSet interface provides some new methods related to comparisons of elements
        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(62);
        numbers.add(5);

        System.out.println(numbers.first() + " first and last " + numbers.last());
        System.out.println(numbers.size()); //size is 4 but NO duplication is allowed

        for(int n : numbers){
            System.out.println(n);
        }


        //HASHSET VS TREESET
        //Note, HashSet is much faster than TreeSet: constant-time versus log-time
        // for most operations, it offers no ordering guarantees. If you need to use the
        // operations from the SortedSet interface, or if the value-ordered iteration is
        // required, use TreeSet, otherwise, HashSet would be a better choice.


        //The LinkedHashSet class represents a set with linked elements.
        // It differs from HashSet by guaranteeing that the order of the elements
        // is the same as the order they were inserted to the set.
        //this set provides insertion-ordered iteration and runs nearly as fast as HashSet.
        Set<Character> ch = new LinkedHashSet<>();
        for(char c = 'a'; c<= 'k'; c++){
            ch.add(c);
        }
        System.out.println(ch);


        System.out.println(Objects.equals(Set.of(1,2,3), Set.of(1,2)));
        System.out.println(Objects.equals(Set.of(1,2,3), Set.of(1,2,3)));



        //peek() returns the current head element,
        // but does not remove it from the queue, whereas poll() does it.
        Queue<String> q = new ArrayDeque<>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.println(q.peek()); // first
        System.out.println(q.peek()); // first
        System.out.println(q.poll()); // first,

        System.out.println(q.peek()); // second
        System.out.println(q.poll()); // second
        System.out.println(q.poll()); // third

        System.out.println(q.isEmpty()); // true


        Deque<String> stack = new ArrayDeque<>();

        stack.offerLast("first");
        stack.offerLast("second");
        stack.offerLast("third");

        System.out.println(stack); // [first, second, third]

        System.out.println(stack.pollLast()); // third
        System.out.println(stack.pollLast()); // second
        System.out.println(stack.pollLast()); // first

        System.out.println(stack.pollLast()); // null


        Stack<String> stack2 = new Stack<>();

        stack2.push("first");
        stack2.push("second");
        stack2.push("third");

        System.out.println(stack2); // [first, second, third]

        System.out.println(stack2.pop()); // "third"
        System.out.println(stack2.pop()); // "second"
        System.out.println(stack2.pop()); // "first"

        System.out.println(stack2.pop()); // throws EmptyStackException
        //The method pop() always throws an exception if the stack is empty.

        //Can't' you create an object of Collection<E> or List<E> by using the new keyword:
        //List<String> ls = new List<String>();
        //Collections<String> cl = new Collections<>();
    }


    @Test
    public void testCollections(){
        List<Integer> l = new ArrayList<>(Arrays.asList(1,3,6,9));
        System.out.println(Collections.max(l));
        int n = Collections.max(l);
        System.out.println(n);
    }

    @Test
    public void Test(){
        List<String> list = new ArrayList<>(Arrays.asList("ImageButton JTextField JTextArea CheckBox JMenu"));

        List<String> l = new ArrayList<>();
        for(String s : list){
            l.add(s);
        }
        String str = l.get(0);
        String [] arr = str.split(" ");
        System.out.println(arr.length);
        String s = "";
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i].startsWith("J")){
                s += arr[i].substring(1) +"\n";
            }
        }
        System.out.println(s);



       /* Object [] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        String[] ay = Arrays.toString(arr).split(" ");

        System.out.println(Arrays.toString(ay));*/

    }
}
