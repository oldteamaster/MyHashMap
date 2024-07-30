package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("Zero", 0);
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put("Eight", 8);
        map.put("Nine", 9);
        map.put("Ten", 10);
        map.put("Eleven", 11);
        map.put("Twelve", 12);
        map.put("Thirteen", 13);
        map.put("Fourteen", 14);
        map.put("Fifteen", 15);
        map.put("Sixteen", 16);
        map.put("Seventeen", 17);
        map.put("Eighteen", 18);
        map.put("Nineteen", 19);
        map.put("Twenty", 20);

        map.put("Ten", 2001);
        System.out.println("map.get(\"Ten\") = " + map.get("Ten"));
        System.out.println("map.get(\"Twenty\") = " + map.get("Twenty"));
        System.out.println("map.size() = " + map.size());
        map.remove("Twelve");
        System.out.println("map.size() = " + map.size());
        map.remove("Eighteen");
        System.out.println("map.size() = " + map.size());
        map.remove("Nineteen");
        System.out.println("map.size() = " + map.size());
        System.out.println("map.get(\"Twelve\") = " + map.get("Twelve"));

        map.clear();
        System.out.println("map.size() = " + map.size());
    }
}
