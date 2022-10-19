package org.example.javaAdvanced.java_Collection_Framework.task2;

import java.util.Arrays;

public class DoubleValues {
    public DoubleValues(String... args) {
        for (String s : args) {
            System.out.println(s + "," + s + " ");
        }
        System.out.println("====vertion 2=======");
        for (String s : args) {
            System.out.println(s + "\n" + s);
        }
    }
}
