package org.example.javaEssential.inheritance_and_polymorphism.task3;

public class Ship extends Vehicle{
    private int countVoyager;
    private String port;

    public Ship(int countVoyager, String port) {
        super();
        this.countVoyager = countVoyager;
        this.port = port;
    }

    public int getCountVoyager() {
        return countVoyager;
    }

    public void setCountVoyager(int countVoyager) {
        this.countVoyager = countVoyager;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
