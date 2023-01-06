package org.example;

import java.util.Comparator;

public class NoblePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        String[] first = p1.getSurname().split(" ");
        String[] second = p2.getSurname().split(" ");
        if (first.length == second.length) {
            return p1.getAge() - p2.getAge();
        } else {
            return first.length - second.length;
        }
    }
}
