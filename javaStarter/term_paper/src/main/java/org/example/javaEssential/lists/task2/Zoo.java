package org.example.javaEssential.lists.task2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<String> getListPet() {
        return listPet;
    }

    private List<String> listPet = new ArrayList<>();
    public List<String> addPet(int index, String pet){
       try {
           listPet.add(index,pet);
       }catch (IndexOutOfBoundsException e){
           System.out.println("Помилка в індексі - " + e.getMessage());
       }
        return listPet;
    }
}
