package org.example.javaAdvanced.reflection.task2;

public class ReflectionTest1 {
    private String nameUser = "Tom";
    private String cityUser = "New York";
    public String place;

    public ReflectionTest1(String nameUser) {
        this.nameUser = nameUser;
    }

    public void world() {
        System.out.println("Get up");
    }

}
