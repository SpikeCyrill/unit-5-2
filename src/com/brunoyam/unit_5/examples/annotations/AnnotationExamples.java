package com.brunoyam.unit_5.examples.annotations;

import com.brunoyam.unit_5.examples.Example;
import com.brunoyam.unit_5.examples.annotations.annotations.RunBeforeUse;
import com.brunoyam.unit_5.models.annotated.AnnotatedClass;
import com.brunoyam.unit_5.models.annotated.NotAnnotatedClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationExamples implements Example {

    @Override
    public void run() {
        System.out.println();
        System.out.print("Annotated says: ");
        checkAndRun(new AnnotatedClass("annotated"));
        System.out.print("Not annotated says: ");
        checkAndRun(new NotAnnotatedClass("not annotated"));
    }

    private void checkAndRun(Object obj) {
        Class clazz = obj.getClass();

        if (clazz.isAnnotationPresent(RunBeforeUse.class)) {
            RunBeforeUse annotation = (RunBeforeUse) clazz.getAnnotation(RunBeforeUse.class);
            String methodName = annotation.methodName();

            try {
                Method method = clazz.getMethod(methodName);
                method.invoke(obj);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}
