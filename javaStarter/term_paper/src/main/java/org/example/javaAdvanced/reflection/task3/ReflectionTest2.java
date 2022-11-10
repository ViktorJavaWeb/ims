package org.example.javaAdvanced.reflection.task3;

public class ReflectionTest2 {
    private String nameUser;
    public String cityUser;
    public int ageUser;

    public ReflectionTest2() {
    }

    public ReflectionTest2(String nameUser, String cityUser, int ageUser) {
        this.nameUser = nameUser;
        this.cityUser = cityUser;
        this.ageUser = ageUser;
    }

    public void newMethod() {
        System.out.println("Hello user!!!!!!!");
    }
}
