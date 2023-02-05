package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex", "Khia-Wazowski", 30));
        personList.add(new Person("Lev", "Fon-Graf-Khmizowski", 22));
        personList.add(new Person("Olga", "Kapazova", 20));
        personList.add(new Person("Igor", "Stradivale Sravnivate", 20));
        System.out.println(personList);
        personList.sort(new NoblePersonComparator());
        System.out.println(personList);
    }
}