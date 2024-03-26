package org.example.homework3;

public class DivisionOperation {
    public static void main(String[] args) {
        int dividend = 150;
        int divisor = 20;
        int integerPart = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The integer part after division is: " + integerPart);
        System.out.println("The remainder after division is: " + remainder);
    }
}
