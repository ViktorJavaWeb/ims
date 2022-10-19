package org.example.javaEssential.inheritance_and_polymorphism.task2;

public class BadPupil implements Pupil {
    private String namePupil;

    public BadPupil(String namePupil) {
        this.namePupil = namePupil;
    }

    public String getNamePupil() {
        return namePupil;
    }

    @Override
    public String study() {
        return "study - 3";
    }

    @Override
    public String read() {
        return "read - 3";
    }

    @Override
    public String write() {
        return "write - 3";
    }

    @Override
    public String relax() {
        return "relax - 3";
    }
}
