package org.example;

import java.util.Comparator;

public interface NoblePersonComparatorInterface extends Comparator<Person> {
    int compare(Person p1, Person p2);
}
