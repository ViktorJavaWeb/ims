package org.example.javaEssential.inheritance_and_polymorphism.task3;

public class Plane extends Vehicle{
    private int height;
    private int countVoyager;

      public Plane(int height, int countVoyager) {
        super();
        this.height = height;
        this.countVoyager = countVoyager;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCountVoyager() {
        return countVoyager;
    }

    public void setCountVoyager(int countVoyager) {
        this.countVoyager = countVoyager;
    }
}
