package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex", "Wazowski", 30));
        personList.add(new Person("Lev", "Khmizowski", 22));
        personList.add(new Person("Olga", "Kapazova", 20));
        personList.add(new Person("Petya", "Zoolog", 16));
        personList.add(new Person("Vasyan", "Krisha", 17));
        personList.add(new Person("Igor", "Sravnivate", 20));
        System.out.println(personList);
        Predicate<Person> predicate = (Person p) -> ((p.getAge() < 18));
        personList.removeIf(predicate);
        System.out.println(personList);
    }
}