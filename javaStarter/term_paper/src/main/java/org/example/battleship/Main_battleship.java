package org.example.battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_battleship {
    public static void main(String[] args) {

        try {
            new Places();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
