package org.example.javaEssential.abstraction.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class XMLHandler extends AbstractHandler {

    private String nameFile;

    public XMLHandler(String nameFile) {
        this.nameFile = nameFile;
    }

    @Override
    public void open() {
        if (Files.exists(Path.of(nameFile))){
            System.out.println("Goog");
        }else {
            System.out.println("Bad open");
        };

    }

    @Override
    public void create() {
        if (!Files.exists(Path.of(nameFile))) {
            try {
                Files.createFile(Path.of(nameFile));
                System.out.println("Створений файл - " + nameFile);
            } catch (IOException e) {
                System.out.println("IOException = " + e.getMessage());
            }
        } else {
            System.out.println("Bad create мабуть вже є :)!!");
        }
    }

    @Override
    public void change() {

    }

    @Override
    public void save() {

    }
}
