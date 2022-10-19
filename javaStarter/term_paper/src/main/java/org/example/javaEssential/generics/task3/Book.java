package org.example.javaEssential.generics.task3;

public class Book {

    private static int index =1;
    private int numberBook;
    private String nameBook;

    public Book(String nameBook) {
        this.numberBook = index++;
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return
                "\n\tindex = " + numberBook +
                "\n\tnameBook = " + nameBook;
    }
}