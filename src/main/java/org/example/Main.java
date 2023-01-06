package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex", "Wazowski Korsakov", 30));
        personList.add(new Person("Lev", "Fon Graf Khmizowski", 22));
        personList.add(new Person("Olga", "Kapazova", 20));
        personList.add(new Person("Igor", "Sravnivate Genialis", 20));
        System.out.println(personList);
        Comparator<Person> nobleComparator = (p1, p2) -> {
            String[] first = p1.getSurname().split(" ");
            String[] second = p2.getSurname().split(" ");
            if (first.length == second.length) {
                return p1.getAge() - p2.getAge();
            } else {
                return first.length - second.length;
            }
        };
        personList.sort(nobleComparator);
        System.out.println(personList);
    }
}