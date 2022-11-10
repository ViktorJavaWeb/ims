package org.example.javaAdvanced;

import org.example.javaAdvanced.reflection.task2.ReflectionTest1;
import org.example.javaAdvanced.reflection.task3.ReflectionTest2;
import org.example.javaAdvanced.reflection.task4.Animal;
import org.example.javaAdvanced.reflection.task4.Cat;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main_Advanced {
    public static void main(String[] args) throws IOException {

        /*================iterator_and_Comparator================*/

        /*Задача № 2*/

      /*  List<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        System.out.println("\n================================================\n");


        /*================java_Collection_Framework================*/

        /*Задача № 2*/

      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ind = 5;
        String[] ars = new String[ind];
        for (int i = 0; i < ind; i++) {
            ars[i] = reader.readLine();
        }
        new DoubleValues(ars);*/

        System.out.println("\n================================================\n");

        /*Задача № 3*/

        /*MyClass_1 myClass_1 = new MyClass_1();
        LinkedList linkedList = myClass_1.addNumber();
        myClass_1.getMin(linkedList);
        System.out.println(myClass_1.getMin(linkedList));*/


        System.out.println("\n================================================\n");


        /*Задача № 4*/

        /*new MyClass_2().findFamily("Merlin");
        new MyClass_2().findCity("Київ");
        new MyClass_2().findCity("Суми");*/

        System.out.println("\n================================================\n");

        /*Задача № 5*/

        //new MyClass_2_5();

        System.out.println("\n================================================\n");

        /*================IO_and_Strings================*/

        /*Задача № 2,4 */

       /* String nameFile = org.example.javaAdvanced.io_and_Strings.task2_4.MyClass.nameFile;
        new MyClass().readFile(nameFile);
        new MyClass().writeFile("Vasy", "Lena");
        new MyClass().readFile(nameFile);*/

        System.out.println("\n================================================\n");

        /*Задача № 3*/

        //new MyClass_task3("We use both first and third-party cookies to personalise web content used");


        System.out.println("\n================================================\n");



        /*================Regular_expressions_and_Data_API================*/

        /*Задача № 2*/

        //new DecryptorJava();

        System.out.println("\n================================================\n");

        /*Задача № 3*/

        //new MyClassData("30.11.1977");

        System.out.println("\n================================================\n");

        /*Задача № 4*/

        /*DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("DaemonThread");
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("daemonThread.getId() = " + daemonThread.getId());
        System.out.println("daemonThread.getName() = " + daemonThread.getName());
        System.out.println("daemonThread.getPriority() = " + daemonThread.getPriority());
        System.out.println("daemonThread.getThreadGroup() = " + daemonThread.getThreadGroup());
        System.out.println("daemonThread.getStackTrace() = " + daemonThread.getStackTrace());
*/

        System.out.println("\n================================================\n");


        /*================Reflection================*/

        /*Задача № 2*/
        /* ReflectionTest1 reflectionTest1 = new ReflectionTest1("Tomy");

        try {
            Class<?> tClass = Class.forName("org.example.javaAdvanced.reflection.task2.ReflectionTest1");

            System.out.println(tClass.getSimpleName());
            Field[] fields = tClass.getDeclaredFields();
            int i = 0;
            for (Field field : fields) {
                System.out.printf("all access modifiers field %s - %s\n", ++i, field.getName());
            }
            System.out.println("=====================");
            i = 0;
            for (Field field : fields) {
                Field field1 = tClass.getDeclaredField(field.getName());
                field1.setAccessible(true);
                System.out.println("access modifiers field:  " + field1.getModifiers());

                try {

                    String text = field1.get(reflectionTest1).toString();

                    System.out.println("text = " + text);
                } catch (NullPointerException e) {
                    System.out.println("e = " + e.getMessage());
                } catch (IllegalAccessException e) {
                    System.out.println("e = " + e.getMessage());
                }


            }
            System.out.println("=====================");


            i = 0;
            Field[] fields2 = tClass.getFields();
            for (Field field : fields2) {
                System.out.printf("public field %s - %s \n", ++i, field.getName());
            }

            i = 0;
            Method[] methods = tClass.getDeclaredMethods();

            for (Method method : methods) {
                System.out.printf("all access modifiers method %s - %s \n", ++i, method.getName() + "()");
            }

            i = 0;
            Method[] methods2 = tClass.getMethods();
            for (Method method : methods2) {
                System.out.printf("public method %s - %s \n", ++i, method.getName() + "()");
            }


        } catch (ClassNotFoundException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }*/


        System.out.println("\n================================================\n");

        /*Задача № 3*/

     /*   ReflectionTest2 reflectionTest2 = new ReflectionTest2("Jury", "Kiev", 23);

        try {
            Class tClassTest = Class.forName("org.example.javaAdvanced.reflection.task3.ReflectionTest2");


            System.out.println("name class reflectionTest2 = " + tClassTest.getSimpleName() + "\n");

            Constructor[] constructors = tClassTest.getConstructors();
            for (Object cons : constructors) {
                System.out.println("constructor class - " + cons.toString());

            }
            System.out.println();

            Field[] fields = tClassTest.getDeclaredFields();
            Method[] methods = tClassTest.getDeclaredMethods();

            for (Field field : fields) {
                System.out.println("field = " + field.getName());
                System.out.println("accesses modifier field = " + field.getModifiers());

                System.out.println("---------------------------------");
            }


            for (Method method : methods) {
                System.out.println("method = " + method.getName());
                System.out.println("accesses modifier method = " + method.getModifiers());

                System.out.println("---------------------------------");
            }


        } catch (ClassNotFoundException e) {
            System.out.println("e = " + e.getMessage());
        }*/


        System.out.println("\n================================================\n");

        /*Задача № 4*/


        new Cat().setMyClass("Sony","Fish",2);

        System.out.println("\n================================================\n");

    }
}
