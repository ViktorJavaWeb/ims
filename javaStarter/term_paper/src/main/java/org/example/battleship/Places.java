package org.example.battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Places {

    String enemyField;
    String myField;
    private int horizon = 10;
    private int vertical = 10;


    public List<Ship> list_four_ship = new ArrayList<>();
    public List<Ship> list_three_ship = new ArrayList<>();
    public List<Ship> list_two_ship = new ArrayList<>();
    public List<Ship> list_one_ship = new ArrayList<>();

    public List<ArrayList<Ship>> listShips = new ArrayList<>();

    public Places() {
        listShips.add((ArrayList<Ship>) list_four_ship);
        listShips.add((ArrayList<Ship>) list_three_ship);
        listShips.add((ArrayList<Ship>) list_two_ship);
        listShips.add((ArrayList<Ship>) list_one_ship);

        try {
            addShips(1, 1, 1, 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("\n    ");
        for (int s = 1; s <= horizon; s++) {
            System.out.print("| X" + s + " ");
        }

        System.out.println();

        for (int y = 1; y <= vertical; y++) {

            for (int k = 0; k < horizon * 3; k++) {
                System.out.print("- ");
            }
            System.out.println();
            System.out.print("Y" + y + "  ");

            for (int x = 1; x <= horizon + 1; x++) {
                if (placementOfShips(x, y)) {
                    System.out.print("| W  ");
                } else {
                    System.out.print("|    ");
                }
            }
            System.out.println();
        }


    }

    void enemyField() {

    }

    void myField() {

    }

    public boolean placementOfShips(int x, int y) {
        for (ArrayList<Ship> sp : listShips) {
            for (int i = 0; i < sp.size(); i++) {

                int m = sp.get(i).getCoordinatesShip_X();
                int l = sp.get(i).getCoordinatesShip_Y();
                int deskShip = sp.get(i).getDeskShip();
                String placementsShip = sp.get(i).getPlacementsShip();


                if (placementsShip.equals("h")) {
                    if ((x < m + deskShip) & x >= m & y == l) {
                        return true;
                    }
                } else if (placementsShip.equals("v")) {
                    if ((y < l + deskShip) & y >= l & x == m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void addShips(int countFour, int countThree, int countTwo, int countOne) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean bl = false;

        String[] listShip = new String[]{"four_desk_ship", "three_desk_ship", "two_desk_ship", "one_desk_ship"};

        int[] countShips = new int[]{countFour, countThree, countTwo, countOne};

        for (int i = 0; i < countShips.length; i++) {
            int p = 0;
            for (int j = 1; j <= countShips[i]; j++) {
                bl = false;
                while (!bl) {
                    System.out.printf("add 'everything: %s and remains: %s count %s' X and Y and placementsShip \n", countShips[i], countShips[i] - j, listShip[i]);

                    int desk = 0;
                    int x = 0;
                    int y = 0;
                    String placementsShip = "'";
                    try {
                        System.out.printf("Введіть кількість палуб в %s:\n", listShip[i]);
                        desk = Integer.parseInt(reader.readLine());
                        System.out.println("Введіть 'X' координату:");
                        x = Integer.parseInt(reader.readLine());
                        System.out.println("Введіть 'Y' координату:");
                        y = Integer.parseInt(reader.readLine());
                        System.out.println("Введіть розміщення по горизонталі 'h'  по вертикалі 'v':");
                        placementsShip = reader.readLine();
                    } catch (Exception e) {
                        //System.out.printf("something incorrectly try again\n");
                        bl = false;
                    }
                    if (!foundDouble(desk, x, y, placementsShip) & verifyDesk(desk, listShip[i]) & verifyX(x) & verifyY(y) & verifyPlacementsShip(placementsShip)) {
                        list_four_ship.add(new Ship(desk, x, y, placementsShip));
                        bl = true;
                    } else {
                        System.out.printf("something incorrectly try again\n");
                        bl = false;
                    }
                }
            }
        }

    }

    private boolean verifyX(int x) {
        if (x > 0 & x <= 10) {
            return true;
        } else {
            System.out.println("incorrectly 'X'");
            return false;
        }

    }

    private boolean verifyY(int y) {
        if (y > 0 & y <= 10) {
            return true;
        } else {
            System.out.println("incorrectly 'Y'");
            return false;
        }
    }

    private boolean verifyDesk(int desk, String deskShip) {

        switch (deskShip) {
            case "four_desk_ship":
                if (desk == 4) {
                    break;
                } else {
                    return false;
                }

            case "three_desk_ship":
                if (desk == 3) {
                    desk = 3;
                    break;
                } else {
                    return false;
                }
            case "two_desk_ship":
                if (desk == 2) {
                    desk = 2;
                    break;
                } else {
                    return false;
                }
            case "one_desk_ship":
                if (desk == 1) {
                    desk = 1;
                    break;
                } else {
                    return false;
                }
            default:
                System.out.println("incorrectly 'deskShip'");
                return false;
        }
        return true;
    }

    private boolean verifyPlacementsShip(String placementsShip) {
        if (placementsShip.equals("h")) {
            return true;
        } else if (placementsShip.equals("v")) {
            return true;
        } else {
            System.out.println("incorrectly 'placementsShip'");
            return false;
        }
    }

    private boolean foundDouble(int deskShip, int x, int y, String placements) {
        if (placements.equals("h")) {
        } else if (placements.equals("v")) {
        } else {
            return true;
        }
        if (x + deskShip > 10 & placements.equals("h")) return true;
        if (y + deskShip > 10 & placements.equals("v")) return true;

        for (ArrayList<Ship> elem : listShips) {
            for (int i = 0; i < elem.size(); i++) {
                int desk = elem.get(i).getDeskShip();
                int v = elem.get(i).getCoordinatesShip_X();
                int w = elem.get(i).getCoordinatesShip_Y();
                String placementsShip = elem.get(i).getPlacementsShip();

                if ((x == v & y == w)) {
                    return true;
                }

                int rX = placements.equals("h") ? x : y;
                int rV = placementsShip.equals("h") ? v : w;

                for (int j = rX; j < rX + deskShip; j++) {
                    int[] arrX;
                    if (placements.equals("h")) {
                        arrX = new int[]{j, y};
                    } else {
                        arrX = new int[]{x, j};
                    }
                    for (int k = rV; k < rV + desk; k++) {
                        int[] arrV;
                        if (placementsShip.equals("h")) {
                            arrV = new int[]{k, w};
                        } else {
                            arrV = new int[]{v, k};
                        }

                        if (Arrays.equals(arrX, arrV)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

