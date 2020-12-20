package org.jetBrains.oop.javagcore.practice;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ArrayListPractice {

    @Test
    public void testList(){
        List<Long> powersOfTen = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            long power = (long) Math.pow(10, i);
            powersOfTen.add(power);
            System.out.println(power);
        }
        System.out.println(powersOfTen);

        for(Long value : powersOfTen){
            System.out.println(value);
        }
    }

    @Test
    public void testList2(){
        List<String> l = new ArrayList<>();
        l.add("ArrayList");
        l.add("is");
        l.add("a");
        l.add("resized");
        l.add("array");
        System.out.println(l);
        l.remove(1);
        l.remove("a");
        l.remove(2);
        //l.set(1, "Hello");
        System.out.println(l);

        List<String> ls = new ArrayList<>(Arrays.asList("Hello", "World!"));
        System.out.println(ls);
    }

    @Test
    public void collectionTest(){
        Collection<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Kurdish");
        languages.add("Turkish");

        System.out.println(languages.size());

        for(String s : languages){
            System.out.println(s);
        }
        languages.forEach(System.out::println);
        languages.forEach(l -> System.out.println(l));
        languages.removeIf(ln -> ln.equals("Turkish"));
        System.out.println(languages);
        /*It is important to understand that the order of the elements in the ArrayList is anyway preserved. We simply cannot call the get method via the Collection interface.*/
    }

    @Test
    public void ofTest(){
        List<String> daysOfWeek = List.of(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );
        System.out.println(daysOfWeek);

        List<String> weekDays = daysOfWeek.subList(0, 5);
        System.out.println(weekDays);
    }

    @Test
    public void testColl(){
        var num = new ArrayList<>(List.of(3,6,1,8,3,9,2,4));
        Collections.sort(num);
        System.out.println(num);
        Collections.reverse(num);
        System.out.println(num);
        Collections.shuffle(num);
        System.out.println(num);
        //The rotate method shifts the elements in the specified list by the given distance.
        Collections.rotate(num,2);
        System.out.println(num);
        //frequency counts the number of elements equal to the specified object;
        //min and max according to the natural order of elements;
        //disjoint checks the two collections do not contain common elements.
        System.out.println(Collections.min(num));
        System.out.println(Collections.max(num));
        System.out.println(Collections.frequency(num ,3));
        System.out.println(Collections.disjoint(num, List.of(0)));
        System.out.println(Collections.disjoint(num, List.of(1)));

    }

    @Test
    public void test(){
        System.out.println(pow2(Arrays.asList(2,3,4)));
        //System.out.println(Math.pow(2,3));
    }

    public Collection<Integer> pow2(Collection<Integer> numbers) {
        // write your code here
       //numbers.forEach(n -> Math.pow(n, 2));
       //numbers.forEach(n -> numbers.add((int) Math.pow(n, 2)));
        List<Integer> ls = new ArrayList<>();
        Iterator<Integer> iter = numbers.iterator();
        double n;
        while(iter.hasNext()){
            n = Math.pow(iter.next(), 2);
            ls.add((int) n);
        }
        return ls;
    }

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        ListIterator<Integer> iter2 = list2.listIterator();
        ListIterator<Integer> iter1 = list1.listIterator();
        int count = 0;
        if(list1.size() > list2.size()) {
            while (iter1.hasNext() && iter2.hasNext()) {
                if ((iter1.next()).equals(iter2.next())) {
                    count++;
                }
            }

        }else {
            while (iter1.hasNext() && iter2.hasNext()) {
                if ((iter1.next()).equals(iter2.next())) {
                    count++;
                }
            }
        }

        System.out.println(elem + "" + count);

        if(elem == count){
            System.out.println(elem + "" + count);
            return true;
        }

        return false;
    }

    @Test
    public void TestOfCollections(){
        /*List<String> ls = List.of("Ayse", "Ali", "Osman");
        ls.set(0, "Zeynep");//NOT possible since it IS IMMUTABLE!!!
        System.out.println(ls);*/

        //System.out.println(checkTheSameNumberOfTimes(2, List.of(8, 8, 3, 3, 2), List.of(1, 3, 3, 2)));
        System.out.println(checkTheSameNumberOfTimes2(3, List.of(8, 8, 3, 3, 2), List.of(1, 3, 3, 2)));


    }

    public static boolean checkTheSameNumberOfTimes2(int elem, List<Integer> list1, List<Integer> list2) {

        List<Integer> ls = new ArrayList<>();
        int count =0;
            for (int i = 0; i < list1.size(); i++) {
                int n = list1.get(i);
                for (int j = 0; j < list2.size(); j++) {
                    int m = list2.get(j);
                if (list2.get(j) == list1.get(i)) {
                    ls.add(list1.get(i));
                    System.out.println(ls + "***");
                    count++;
                    System.out.println(list2.get(j) + m+" " + n+ list1.get(i));
                    break;

                }
            }
        }

            if(elem == count){
                return true;
            }

            return false;
    }


    @Test
    public void t(){
        List<GreekLetter> letterList = new ArrayList<>();

        letterList.add(new GreekLetter("Gamma",  3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha",  1));

       letterList.forEach(System.out::println);
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }


    @Test
    public void testArray() {

        String s = "Google Oracle JetBrains";
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));

        List<String[]> ls = new ArrayList<>();
        ls.add(str);
        System.out.println(Arrays.toString(ls.get(0)));


    }


    @Test
    public void testSentence() {

        List<Integer> num = Arrays.asList(1,2,3,4);
        Collections.reverse(num);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String st = scanner.nextLine();
        System.out.println(st);
        List<String> lst = Arrays.asList(st.split(" "));
        String s = null;
        for(int i =0; i<lst.size(); i++){
            int max = 0;
            int temp = lst.get(i).length();
            if(max < temp){
                s = lst.get(i);
            }
        }

        //List<String> l = new ArrayList<>();
        for(int i=0; i< lst.size(); i++){
            //l.add(s);
            lst.set(i, s);
        }
        //System.out.print(l);
        System.out.println(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }

}
