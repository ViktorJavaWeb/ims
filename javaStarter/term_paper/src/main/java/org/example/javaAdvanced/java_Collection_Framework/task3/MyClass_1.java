package org.example.javaAdvanced.java_Collection_Framework.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MyClass_1 {
    private LinkedList<Integer> getIntegerList= new LinkedList<>();

    public LinkedList addNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(reader.readLine());
            getIntegerList.add(x);
        }
       return getIntegerList;
    }

    public int getMin(LinkedList el){
        Collections.sort(el);
        return (int) el.get(0);
    }
}