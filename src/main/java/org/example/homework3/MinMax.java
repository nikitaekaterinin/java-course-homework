package org.example.homework3;

public class MinMax {
    public static void main(String[] args) {
        int a = 77;
        int b = 676;

        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;

        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);
    }
}
