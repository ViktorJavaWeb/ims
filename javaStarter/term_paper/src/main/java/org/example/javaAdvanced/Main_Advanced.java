package org.example.javaAdvanced;

import org.example.javaAdvanced.java_Collection_Framework.task2.DoubleValues;
import org.example.javaAdvanced.java_Collection_Framework.task3.MyClass_1;
import org.example.javaAdvanced.java_Collection_Framework.task4.MyClass_2;
import org.example.javaAdvanced.java_Collection_Framework.task5.MyClass_2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main_Advanced {
    public static void main(String[] args) throws IOException {

        /*================iterator_and_Comparator================*/

        /*Задача № 2*/

        List<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n================================================\n");


        /*================java_Collection_Framework================*/

        /*Задача № 2*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ind = 5;
        String[] ars = new String[ind];
        for (int i = 0; i < ind; i++) {
            ars[i] = reader.readLine();
        }
        new DoubleValues(ars);

        System.out.println("\n================================================\n");

        /*Задача № 3*/

        MyClass_1 myClass_1 = new MyClass_1();
        LinkedList linkedList = myClass_1.addNumber();
        myClass_1.getMin(linkedList);
        System.out.println(myClass_1.getMin(linkedList));


        System.out.println("\n================================================\n");


        /*Задача № 4*/
        new MyClass_2().findFamily("Merlin");
        new MyClass_2().findCity("Київ");
        new MyClass_2().findCity("Суми");

        System.out.println("\n================================================\n");

        /*Задача № 5*/

        new MyClass_2_5();

        System.out.println("\n================================================\n");

        /*================java_Collection_Framework================*/

        /*================java_Collection_Framework================*/


        /*================java_Collection_Framework================*/

        /*================java_Collection_Framework================*/

    }
}
