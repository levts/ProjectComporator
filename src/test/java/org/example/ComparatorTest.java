package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ComparatorTest {
    NoblePersonComparator noblePersonComparator = new NoblePersonComparator();

    @Test
    public void checkDashComparator(){
        Person person1 = new Person("Alex", "Khia", 30);
        Person person2 = new Person("Alex", "Khia-Wazowski", 30);
        Person person3 = new Person("Alex", "Khia-Wazowski-Manroa", 30);
        Person person4 = new Person("Alex", "Khia-Wazowski-Manroa-Genry", 30);
        ArrayList<Person> sortedArrayList = new ArrayList<>(4);
        sortedArrayList.add(person1);
        sortedArrayList.add(person2);
        sortedArrayList.add(person3);
        sortedArrayList.add(person4);
        ArrayList<Person> personArrayList = new ArrayList<>(4);
        personArrayList.add(person3);
        personArrayList.add(person2);
        personArrayList.add(person4);
        personArrayList.add(person1);
        personArrayList.sort(noblePersonComparator);
        Assertions.assertArrayEquals(personArrayList.toArray(),sortedArrayList.toArray());
    }
    @Test
    public void checkSpaceComparator(){
        Person person1 = new Person("Alex", "Khia", 30);
        Person person2 = new Person("Alex", "Khia Wazowski", 30);
        Person person3 = new Person("Alex", "Khia Wazowski Manroa", 30);
        Person person4 = new Person("Alex", "Khia Wazowski Manroa Genry", 30);
        ArrayList<Person> sortedArrayList = new ArrayList<>(4);
        sortedArrayList.add(person1);
        sortedArrayList.add(person2);
        sortedArrayList.add(person3);
        sortedArrayList.add(person4);
        ArrayList<Person> personArrayList = new ArrayList<>(4);
        personArrayList.add(person3);
        personArrayList.add(person2);
        personArrayList.add(person4);
        personArrayList.add(person1);
        personArrayList.sort(noblePersonComparator);
        Assertions.assertArrayEquals(personArrayList.toArray(),sortedArrayList.toArray());
    }

    @Test
    public void checkAgeComparator(){
        Person person1 = new Person("Alex", "Khia", 23);
        Person person2 = new Person("Alex", "Khia", 24);
        Person person3 = new Person("Alex", "Khia", 25);
        Person person4 = new Person("Alex", "Khia", 26);
        ArrayList<Person> sortedArrayList = new ArrayList<>(4);
        sortedArrayList.add(person1);
        sortedArrayList.add(person2);
        sortedArrayList.add(person3);
        sortedArrayList.add(person4);
        ArrayList<Person> personArrayList = new ArrayList<>(4);
        personArrayList.add(person3);
        personArrayList.add(person2);
        personArrayList.add(person4);
        personArrayList.add(person1);
        personArrayList.sort(noblePersonComparator);
        Assertions.assertArrayEquals(personArrayList.toArray(),sortedArrayList.toArray());
    }
}
