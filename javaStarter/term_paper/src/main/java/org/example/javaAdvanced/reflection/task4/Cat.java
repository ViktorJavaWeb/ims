package org.example.javaAdvanced.reflection.task4;

import java.lang.reflect.Field;

public class Cat {
    private Animal animal = new Animal("Tom", "Dog", 4);

    private Class tClass = null;

    public Cat() {
        try {
            this.tClass = Class.forName("org.example.javaAdvanced.reflection.task4.Animal");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setMyClass(String name, String king, int hand) {
        Field[] fields = tClass.getDeclaredFields();

        try {

            for (Field field : fields) {
                System.out.println("name field = " + field.getName());
                field.setAccessible(true);
                System.out.println("field text = " + field.get(animal));
                System.out.println("------------------------------------------");
            }

            fields[0].setAccessible(true);

            fields[0].set(animal, name);
            fields[1].setAccessible(true);
            fields[1].set(animal, king);
            fields[2].setAccessible(true);
            fields[2].set(animal, hand);

            for (Field field : fields) {
                System.out.println("name field = " + field.getName());
                field.setAccessible(true);
                System.out.println("new field text = " + field.get(animal));
                System.out.println("------------------------------------------");
            }



        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }

    }


}
