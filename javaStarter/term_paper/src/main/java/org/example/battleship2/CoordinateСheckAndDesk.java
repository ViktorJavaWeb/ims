package org.example.battleship2;

public class CoordinateСheckAndDesk {


    public static boolean checkCoordinate_XorY(int m) {

        try {
            if (0 < m & m < 10) {
                return true;
            } else {
                System.out.println("incorrectly 'X or Y'");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean verifyPlacementsShip(String placementsShip) {
        if (placementsShip.equals("h")) {
            return true;
        } else if (placementsShip.equals("v")) {
            return true;
        } else {
            System.out.println("incorrectly 'placementsShip'");
            return false;
        }
    }

    public static boolean verifyDesk(int desk, String deskShip) {

        switch (deskShip) {
            case "four_desk_ship":
                if (desk == 4) {
                    break;
                } else {
                    System.out.println("incorrectly 'deskShip'");
                    return false;
                }

            case "three_desk_ship":
                if (desk == 3) {
                    desk = 3;
                    break;
                } else {
                    System.out.println("incorrectly 'deskShip'");
                    return false;
                }
            case "two_desk_ship":
                if (desk == 2) {
                    desk = 2;
                    break;
                } else {
                    System.out.println("incorrectly 'deskShip'");
                    return false;
                }
            case "one_desk_ship":
                if (desk == 1) {
                    desk = 1;
                    break;
                } else {
                    System.out.println("incorrectly 'deskShip'");
                    return false;
                }
            default:
                System.out.println("incorrectly 'deskShip'");
                return false;
        }
        return true;
    }

    public static boolean verifyCoordinate(int desk, int x, int y, String placementsShip) {
        if (!checkCoordinate_XorY(x) &
                !checkCoordinate_XorY(y) &
                !verifyPlacementsShip(placementsShip
                )) {
            System.out.println("incorrectly 'placementsShip'");
            return false;
        }


        return true;
    }

}
