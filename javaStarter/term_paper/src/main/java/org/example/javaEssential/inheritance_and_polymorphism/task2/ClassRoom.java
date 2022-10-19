package org.example.javaEssential.inheritance_and_polymorphism.task2;


import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    public List<Pupil> listPupil = new ArrayList<>();

    public ClassRoom(Pupil[] nas) {

        for (int i = 0; i < nas.length; i++) {
            listPupil.add(nas[i]);
        }
        this.listPupil = listPupil;
    }
}
