package org.example.battleship2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
    private String namePlayer = "";

    public Player(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public void playerTurn() {

    }

    public int[] shotPlayer() {

        int[] coordinatesShot = null;
        int x = 0;
        int y = 0;
        boolean bl = true;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (bl) {
            try {
                System.out.println("Введіть для пострілу координату по X:");
                x = Integer.parseInt(reader.readLine());
                System.out.println("Введіть для пострілу координату по Y:");
                y = Integer.parseInt(reader.readLine());
                if (CoordinateСheckAndDesk.checkCoordinate_XorY(x) & CoordinateСheckAndDesk.checkCoordinate_XorY(y)) {
                    coordinatesShot = new int[]{x, y};
                }
            } catch (IOException e) {
                bl = false;
                System.out.println("incorrectly X or Y");
            }

        }
        return coordinatesShot;
    }


}
