package org.example.homework4;

public class LeapYear {
    public static void main(String[] args) {
        int yearValue = 2024;
        System.out.println(yearValue + ": Is it a leap year?" + "\nAnswer: " + isLeapYear(yearValue));

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Year value is invalid");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}