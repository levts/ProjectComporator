package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex", "Wazowski", 30));
        personList.add(new Person("Lev", "Khmizowski", 22));
        personList.add(new Person("Olga", "Kapazova", 20));
        personList.add(new Person("Igor", "Sravnivate", 20));
        System.out.println(personList);
        NoblePersonComparatorInterface nobleComparator = (Person o1, Person o2)->{
            if (o1.getSurname().length() - o2.getSurname().length() == 0) {
                return o1.getAge() - o2.getAge();
            } else {
                return o1.getSurname().length() - o2.getSurname().length();
            }
        };
        Collections.sort(personList, nobleComparator);
        System.out.println(personList);
    }
}