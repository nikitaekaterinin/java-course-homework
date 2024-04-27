package org.example.homework7.RomanNumsCalc;

public class RomanNumbersCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        RomanNumber num1 = RomanNumber.L;
        RomanNumber num2 = RomanNumber.V;

        String operation = "-";
        int result = calculator.calculate(num1, num2, operation);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

    }
}