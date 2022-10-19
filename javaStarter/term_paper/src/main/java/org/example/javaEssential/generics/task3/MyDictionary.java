package org.example.javaEssential.generics.task3;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary {
    private Book book;

    List<Book> list = new ArrayList<>();

    public List<Book> getList() {
        return list;
    }

    public void addBook(Book book){
        list.add(book);
    }

    public Book getElementMyDictionsry(int ind){
        return list.get(ind);
    }
}


