package com.brunoyam.unit_5.examples.lambda;

import com.brunoyam.unit_5.examples.AbstractExampleWithList;
import com.brunoyam.unit_5.examples.Example;
import com.brunoyam.unit_5.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExamples extends AbstractExampleWithList implements Example {

    @Override
    public void run() {
        System.out.println("Old school");
        sortPrint();

        System.out.println();
        System.out.println("Progressive");
        sortPrintLambda();
    }

    private void sortPrint() {
        ArrayList<Person> persons = new ArrayList<>(personsListFactory.getCollection());

        Comparator<Person> customComparator = new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getName().length() + person.getSurname().length() - t1.getName().length() - t1.getSurname().length();
            }
        };

        Collections.sort(persons, customComparator);

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    private void sortPrintLambda() {
        ArrayList<Person> persons = new ArrayList<>(personsListFactory.getCollection());

        Collections.sort(persons, (person, t1) -> person.getName().length() + person.getSurname().length() - t1.getName().length() - t1.getSurname().length());
        persons.forEach(System.out::println);
    }

}
