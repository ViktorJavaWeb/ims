package org.example.javaAdvanced.java_Collection_Framework.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MyClass_2_5 {
    public MyClass_2_5() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.equals("end")){
            list.add(line);
            line = reader.readLine();
        }
        list.forEach(System.out::println);
    }
}
