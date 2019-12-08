package com.brunoyam.unit_5.models;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private final String name;
    private final String surname;
    private final LocalDate birthDate;

    public Person(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surname.equals(person.surname) &&
                birthDate.equals(person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate);
    }

    @Override
    public int compareTo(Person o) {
        if (Objects.isNull(o)) return 1;
        if (name.compareTo(o.name) != 0) return name.compareTo(o.name);
        if (surname.compareTo(o.surname) != 0) return surname.compareTo(o.surname);
        if (Objects.nonNull(birthDate)) return birthDate.compareTo(o.birthDate);
        return 0;
    }
}
