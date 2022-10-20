package org.example.javaAdvanced.io_and_Strings.task2_4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MyClass {
    public static final String nameFile = "src/main/java/org/example/javaAdvanced/io_and_Strings/task2/test.txt";

    public MyClass() {
        try {
            Path of = Path.of(nameFile);
            if (!Files.exists(of)) {
                System.out.println("Create file!!");
                Files.createFile(of);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void readFile(String nameFile) throws IOException {
        Path path = Path.of(nameFile);
        List<String> list = Files.readAllLines(path);
        list.forEach(System.out::println);
    }

    public void writeFile(String... arg) throws IOException {
        FileWriter writer = new FileWriter(nameFile);

        for (String s : arg) {
            writer.write(s + " ");
            writer.flush();
        }

    }

}
