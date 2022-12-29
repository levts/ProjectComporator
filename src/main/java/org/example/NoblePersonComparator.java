package org.example;

import java.util.Comparator;

public class NoblePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() - o2.getSurname().length() == 0) {
            return o1.getAge() - o2.getAge();
        } else {
            return o1.getSurname().length() - o2.getSurname().length();
        }
    }
}
