package org.example.javaEssential.generics.task2;

import java.util.ArrayList;
import java.util.List;

public class MyList <T>{

    List<T> tList = new ArrayList<>();

    public MyList() {
    }

    public void addMyListElement(Object element){

        tList.add((T) element);
    }
    public T getMyListElement(int index){
        return tList.get(index);
    }
    public int sizeMyList(){
        return tList.size();
    }
}
