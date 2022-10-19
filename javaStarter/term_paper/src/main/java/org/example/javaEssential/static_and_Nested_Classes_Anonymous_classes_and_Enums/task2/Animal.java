package org.example.javaEssential.static_and_Nested_Classes_Anonymous_classes_and_Enums.task2;

public enum Animal {
    FOX(3),
    DOG(5),
    CAT(2),
    BIRD(1);

    private int age;
    Animal(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + "\nAge = " + age;
    }
}
