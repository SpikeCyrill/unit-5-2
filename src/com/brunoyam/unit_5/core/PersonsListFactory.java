package com.brunoyam.unit_5.core;

import com.brunoyam.unit_5.models.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonsListFactory implements Factory<Person> {
    @Override
    public Collection<Person> getCollection() {
        List<Person> persons = new ArrayList();
        persons.add(new Person("Olesya", "Fedorova", LocalDate.of(1995, 8, 13)));
        persons.add(new Person("Dmitry", "Fedorov", LocalDate.of(1993, 3, 24)));
        persons.add(new Person("Svetlana", "Vivina", LocalDate.of(1998, 10, 2)));
        persons.add(new Person("Olesya", "Fedorova", LocalDate.of(1988, 5, 30)));
        persons.add(new Person("Dmitry", "Romov", LocalDate.of(1990, 9, 11)));
        return persons;
    }
}
