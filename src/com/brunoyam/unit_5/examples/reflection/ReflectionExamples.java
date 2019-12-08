package com.brunoyam.unit_5.examples.reflection;

import com.brunoyam.unit_5.examples.Example;
import com.brunoyam.unit_5.models.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;

public class ReflectionExamples implements Example {

    @Override
    public void run() {
        System.out.println();
        System.out.println("Reflection");
        explorePerson(new Person("Dmitry", "Fedorov", LocalDate.of(1993, 3, 24)));
    }

    private void explorePerson(Person person) {
        System.out.println(person.toString());

        Class clazz = person.getClass();

        Constructor[] constructors = clazz.getConstructors();
        Method[] methods = clazz.getMethods();
        Field[] fields = clazz.getDeclaredFields();

        System.out.println();
        System.out.println("Constructors");
        Arrays.asList(constructors).forEach(System.out::println);
        System.out.println();
        System.out.println("Methods");
        Arrays.asList(methods).forEach(System.out::println);
        System.out.println();
        System.out.println("Fields");
        Arrays.asList(fields).forEach(System.out::println);

        try {
            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "Dodon");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println(person.toString());

    }
}
