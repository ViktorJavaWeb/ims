package org.example.battleship;

public class Place {
    private int horizon = 10;
    private int vertical = 10;

    public Place() {
        System.out.print("  ");
        for (int s = 1; s <= horizon; s++) {
            System.out.print("| X" + s + " ");
        }
        System.out.println();

        for (int i = 1; i <= vertical; i++) {

            for (int k = 0; k < horizon * 2; k++) {
                System.out.print("- ");
            }
            System.out.println();
            System.out.print("Y" + i);

            for (int j = 0; j < horizon; j++) {
                System.out.print("| . ");

            }
            System.out.println();
        }
    }
}
