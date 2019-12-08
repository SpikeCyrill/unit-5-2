package com.brunoyam.unit_5.models.annotated;

public class NotAnnotatedClass {

    private final String name;

    public NotAnnotatedClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void beforeRun() {
        System.out.println("Run before " + name);
    }
}
