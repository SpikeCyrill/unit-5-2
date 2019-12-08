package com.brunoyam.unit_5;

import com.brunoyam.unit_5.examples.annotations.AnnotationExamples;
import com.brunoyam.unit_5.examples.lambda.LambdaExamples;
import com.brunoyam.unit_5.examples.reflection.ReflectionExamples;
import com.brunoyam.unit_5.examples.stearms.StreamExamples;

public class Application {

    public static void main(String[] args) {
        new LambdaExamples().run();
        new ReflectionExamples().run();
        new AnnotationExamples().run();
        new StreamExamples().run();
    }

}
