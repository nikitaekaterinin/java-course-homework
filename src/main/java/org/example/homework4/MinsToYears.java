package org.example.homework4;

public class MinsToYears {
    public static void main(String[] args) {
        printYearsAndDays(1051200);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int years = (int) minutes / 60 / 24 / 365;
            int days = (int) minutes / 60 / 24 % 365;
            System.out.println("Output: " + minutes + " min = " + years + " y and " + days + " d");
        }
    }
}