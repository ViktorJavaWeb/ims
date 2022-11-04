package org.example.battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ship {

    /*private static int four_ship = 4;
    private static int three_ship = 3;
    private static int two_ship = 2;
    private static int one_ship = 1;*/

    private int deskShip = 0;



    private String nameShip = "";
    private int coordinatesShip_X = 0;
    private int coordinatesShip_Y = 0;

    private String placementsShip = "";

    public Ship() {
    }

    public Ship(int deskShip, int coordinatesShip_X, int coordinatesShip_Y, String placementsShip) {
        this.deskShip = deskShip;
       // this.nameShip = nameShip;
        this.coordinatesShip_X = coordinatesShip_X;
        this.coordinatesShip_Y = coordinatesShip_Y;
        this.placementsShip = placementsShip;
    }

    public String getNameShip() {
        return nameShip;
    }

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public int getCoordinatesShip_X() {
        return coordinatesShip_X;
    }

    public void setCoordinatesShip_X(int coordinatesShip_X) {
        this.coordinatesShip_X = coordinatesShip_X;
    }

    public int getCoordinatesShip_Y() {
        return coordinatesShip_Y;
    }

    public void setCoordinatesShip_Y(int coordinatesShip_Y) {
        this.coordinatesShip_Y = coordinatesShip_Y;
    }

    public String getPlacementsShip() {
        return placementsShip;
    }

    public void setPlacementsShip(String placementsShip) {
        this.placementsShip = placementsShip;
    }

   /* public static int getFour_ship() {
        return four_ship;
    }

    public static int getThree_ship() {
        return three_ship;
    }

    public static int getTwo_ship() {
        return two_ship;
    }

    public static int getOne_ship() {
        return one_ship;
    }*/

    public int getDeskShip() {
        return deskShip;
    }

    public void setDeskShip(int deskShip) {
        this.deskShip = deskShip;
    }

    @Override
    public String toString() {
        return nameShip +
                ", coordinatesShip_X = " + coordinatesShip_X +
                ", coordinatesShip_Y = " + coordinatesShip_Y +
                ", placementsShip = " + placementsShip+
                ", deckShip = " + getDeskShip();
    }
}
