package org.example.javaEssential.inheritance_and_polymorphism.task2;

public class ExcelentPupil implements Pupil {

    private String namePupil;

    public ExcelentPupil(String namePupil) {
        this.namePupil = namePupil;
    }

    public String getNamePupil() {
        return namePupil;
    }

    @Override
    public String study() {
        return "study - 5";
    }

    @Override
    public String read() {
        return "read - 5";
    }

    @Override
    public String write() {
        return "write - 5";
    }

    @Override
    public String relax() {
        return "relax - 5";
    }
}
