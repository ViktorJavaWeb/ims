package org.example.battleship2;

import java.util.ArrayList;

public class Ship {

    private int deskShip = 0;

    private String nameShip = "";
    private int coordinatesShip_X = 0;
    private int coordinatesShip_Y = 0;
    private String placementsShip = "";


    public Ship(int deskShip, int coordinatesShip_X, int coordinatesShip_Y, String placementsShip) {
        this.deskShip = deskShip;
        this.coordinatesShip_X = coordinatesShip_X;
        this.coordinatesShip_Y = coordinatesShip_Y;
        this.placementsShip = placementsShip;
    }
}
