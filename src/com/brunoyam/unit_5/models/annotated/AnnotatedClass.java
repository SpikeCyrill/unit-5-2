package com.brunoyam.unit_5.models.annotated;

import com.brunoyam.unit_5.examples.annotations.annotations.RunBeforeUse;

@RunBeforeUse(methodName = "beforeRun")
public class AnnotatedClass {

    private final String name;

    public AnnotatedClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void beforeRun() {
        System.out.println("Run before " + name);
    }

}
