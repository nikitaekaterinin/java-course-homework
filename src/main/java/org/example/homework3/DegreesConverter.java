package org.example.homework3;

public class DegreesConverter {
    public static void main(String[] args) {
        double degrInCelsius = 20.5;
        double degrInKelvin = degrInCelsius + 273.15;
        double degrInFar =  (degrInCelsius * 9 / 5) + 32;

        System.out.println("The temperature in Celsius: " + degrInCelsius + " degrees.");
        System.out.println("The temperature in Kelvin: " + degrInKelvin + " degrees.");
        System.out.println("The temperature in  Fahrenheit: " + degrInFar + " degrees.");
    }
}
