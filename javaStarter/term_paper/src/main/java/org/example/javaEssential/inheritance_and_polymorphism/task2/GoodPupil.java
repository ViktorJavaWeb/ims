package org.example.javaEssential.inheritance_and_polymorphism.task2;

public class GoodPupil implements Pupil {
    private String namePupil;

    public GoodPupil(String namePupil) {
        this.namePupil = namePupil;
    }

    public String getNamePupil() {
        return namePupil;
    }

    @Override
    public String study() {
        return "study - 4";
    }

    @Override
    public String read() {
        return "read - 4";
    }

    @Override
    public String write() {
        return "write - 4";
    }

    @Override
    public String relax() {
        return "relax - 4";
    }
}
