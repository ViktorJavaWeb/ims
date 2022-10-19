package org.example.javaEssential.inheritance_and_polymorphism.task6;

public class Printer {
    public void print(String value){
        if(this.getClass() == Printer.class){
            System.out.println(value);
        }else {
            System.out.println((char) 27 + "[32m" + value);
        }
    }
}
