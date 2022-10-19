package org.example.javaEssential.exceptions.task5;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y, String arithmetic) {
        this.x = x;
        this.y = y;
        switch (arithmetic) {
            case "add":
                addNumber();
                break;
            case "sub":
                subNumber();
                break;
            case "mul":
                mulNumber();
                break;
            case "div":
                divNumber();
                break;
            default:
                System.out.println("Not an arithmetic operation in list");
        }
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    private void addNumber() {
        System.out.println("add = " + (this.getX() + this.getY()));
    }

    private void subNumber() {
        System.out.println("sub = " + (this.getX() - this.getY()));
    }

    private void mulNumber() {
        System.out.println("mul = " + (this.getX() * this.getY()));
    }

    private void divNumber() {
        try {
            System.out.println("div = " + this.getX() / this.getY());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
