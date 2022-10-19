package org.example.javaEssential.abstraction.task5;

public class ConverterTemperature {
    public static double celsToKelvin(double countGradus) {
        return countGradus + 273.15;
    }

    public static double celsToFaring(double countGradus) {

        return countGradus * 1.8 + 32;
    }
}
