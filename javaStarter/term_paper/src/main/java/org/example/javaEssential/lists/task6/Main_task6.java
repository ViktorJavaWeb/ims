package org.example.javaEssential.lists.task6;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main_task6 {
    private List<String> listNameTeachers = Arrays.asList("Tom", "Jery", "Alex", "Merci");

    public int nameTeacher1(String name) {
        ListIterator<String> iterator = listNameTeachers.listIterator();
        int x = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(name)) {
                return x;
            }
            x++;
        }
        return 0;
    }

    public int nameTeacher2(String name) {
       return listNameTeachers.indexOf(name);
    }
}
