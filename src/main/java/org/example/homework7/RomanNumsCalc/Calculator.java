package org.example.homework7.RomanNumsCalc;

public class Calculator {

    public int calculate(RomanNumber num1, RomanNumber num2, String operation) {
        int first = num1.getIntValue();
        int second = num2.getIntValue();

        int result = 0;

        switch (operation) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
            default:
                System.out.println("Invalid operation.");
        }
        return result;
    }
}