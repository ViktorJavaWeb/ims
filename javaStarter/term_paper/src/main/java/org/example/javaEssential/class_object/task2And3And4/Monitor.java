package org.example.javaEssential.class_object.task2And3And4;

import java.util.Objects;

public class Monitor extends Device{

    private int resolutionX;
    private int resolutionY;

    public Monitor(int resolutionX, int resolutionY, String manufacturer, float price, String serialNumber) {
        super(manufacturer,price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer =" + getManufacturer() +
                ", price =" + getPrice() +
                ", serialNumber =" + getSerialNumber()+
                ", X =" + resolutionX +
                ", Y =" + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }
}
