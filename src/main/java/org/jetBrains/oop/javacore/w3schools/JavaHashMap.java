package org.jetBrains.oop.javacore.w3schools;

import java.util.*;

public class JavaHashMap {

    public static void main(String[] args) {
        hashMap();
        hashSet();
        iterator();
    }

    public static void hashMap() {
        HashMap<String, String> cities = new HashMap<>();
        cities.put("England", "London");
        cities.put("Germany", "Berlin");
        cities.put("Norway", "Oslo");

        System.out.println(cities.get("England"));
        System.out.println(cities.containsKey("England"));
        System.out.println(cities.size());
        cities.forEach((country, city) -> System.out.println(country + "-" + city));
        System.out.println("***");
        for(Map.Entry<String, String> entry : cities.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("***");
        for(String country: cities.keySet()){
            System.out.println(country);
        }
        System.out.println("***");
        for(String city : cities.values()){
            System.out.println(city);
        }
        System.out.println("***");
        for(String city : cities.keySet()){
            System.out.println(city + "-" + cities.get(city));
        }

        cities.remove("England");
        System.out.println(cities);
        cities.clear();
        System.out.println(cities);
    }

    public static void hashSet(){
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Audi");

        System.out.println(cars.contains("BMW"));
        for(String car : cars){
            System.out.println(car);
        }
        cars.forEach(car -> System.out.println(car));

    }

    public static void iterator() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println("---");
        Iterator<String> iter = cars.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        cars.forEach(car -> System.out.println(car));
    }

}
