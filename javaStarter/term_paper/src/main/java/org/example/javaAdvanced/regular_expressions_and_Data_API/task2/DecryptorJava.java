package org.example.javaAdvanced.regular_expressions_and_Data_API.task2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecryptorJava {

    private static final String nameFile = "src/main/java/org/example/javaAdvanced/regular_expressions_and_Data_API/task2/test.txt";

    private List<String> list = Arrays.asList("Basy", "Lera");

    public DecryptorJava() {

        Path of = Path.of(nameFile);
        if (!Files.exists(of)) {
            try {
                Files.createFile(of);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nameFile));
            String line;
            String res = "";
            while (reader.ready()) {
                line = reader.readLine();
                System.out.println("line = " + line);
                res += line.replaceAll("Basy", "Java")+"\n";
            }
            FileWriter fileWriter = new FileWriter(nameFile);
            fileWriter.write(res);
            fileWriter.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

