package org.example.battleship2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Place {
    private int horizon = 10;
    private int vertical = 10;


    private List<Ship> list_four_ship = new ArrayList<>();
    private List<Ship> list_three_ship = new ArrayList<>();
    private List<Ship> list_two_ship = new ArrayList<>();
    private List<Ship> list_one_ship = new ArrayList<>();
    private List<ArrayList<Ship>> listShips = new ArrayList<>();

    private int[] countShips = new int[4];


   /* private String four_desk_ship;
    private String three_desk_ship;
    private String two_desk_ship;
    private String one_desk_ship;*/

    private String[] listNameShip = new String[]{"four_desk_ship", "three_desk_ship", "two_desk_ship", "one_desk_ship"};


    public Place() {
        listShips.add((ArrayList<Ship>) list_four_ship);
        listShips.add((ArrayList<Ship>) list_three_ship);
        listShips.add((ArrayList<Ship>) list_two_ship);
        listShips.add((ArrayList<Ship>) list_one_ship);


        addCountShips(1, 1, 1, 1);


    }

    private boolean checkCountShip(int x) {
        return 0 < x & x <= 4;
    }

    public void addCountShips(int countFour, int countThree, int countTwo, int countOne) {
        boolean bl = true;
        while (bl) {
            if (checkCountShip(countFour) &
                    checkCountShip(countThree) &
                    checkCountShip(countTwo) &
                    checkCountShip(countOne)
            ) {
                countShips = new int[]{countFour, countThree, countTwo, countOne};
                bl = false;
            } else {
                System.out.println("incorrectly addCountShips");
                bl = true;
            }
        }
    }


    //List listShips
    public void addPlace() {

        System.out.print("   ");
        for (int i = 1; i <= horizon; i++) {
            System.out.print("| X" + i + " ");
        }
        System.out.println();
        for (int i = 1; i <= vertical; i++) {
            for (int j = 0; j < horizon * 5; j++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.print("Y" + i + " ");
            for (int j = 0; j < horizon; j++) {
                if (true) {
                    System.out.print("| :  ");
                } else {
                    System.out.print("| .  ");
                }

            }
            System.out.println();
        }
    }

    public void addShipsOfPlace() {
    }

    public void placingShips() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean bl = true;
        int desk = 0;
        int x = 0;
        int y = 0;
        String placementsShip = "";

        for (int i = 0; i < countShips.length; i++) {
            for (int j = 0; j < countShips[i]; j++) {
                bl = true;
                while (bl) {
                    try {
                        System.out.printf("Введіть кількість палуб в %s:\n", listNameShip[i]);
                        desk = Integer.parseInt(reader.readLine());
                        System.out.println("Введіть 'X' координату:");
                        x = Integer.parseInt(reader.readLine());
                        System.out.println("Введіть 'Y' координату:");
                        y = Integer.parseInt(reader.readLine());
                        System.out.println("Введіть розміщення по горизонталі 'h'  по вертикалі 'v':");
                        placementsShip = reader.readLine();

                        if (CoordinateСheckAndDesk.verifyDesk(desk, listNameShip[i]) &
                                CoordinateСheckAndDesk.verifyCoordinate(desk, x, y, placementsShip)) {
                            listShips.get(i).add(new Ship(4, x, y, "h"));
                            bl = false;
                        } else {
                            System.out.println("something incorrectly try again\n");
                        }
                    } catch (Exception e) {
                        System.out.println("something incorrectly try again\n");
                        bl = true;
                    }

                }

            }
        }
    }
}
