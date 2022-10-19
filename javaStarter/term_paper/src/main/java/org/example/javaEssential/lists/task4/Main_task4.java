package org.example.javaEssential.lists.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main_task4 {
    List<Integer> listInt = Arrays.asList(1, 3, 4, 5, 6, 7);
    ListIterator<Integer> iterator = listInt.listIterator();

    public void listIntToOne(int x) {
        listInt.forEach(y -> System.out.print(y + " "));
        System.out.println("\n");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + x + " ");
        }
    }
}
