package org.example.homework6;

import java.util.Scanner;

public class BasicInteractiveCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            double firstNum = MyMethods.readDouble(sc);

            System.out.println("Enter an operation (+, -, *, /): ");
            String operation = MyMethods.getAndValidateOperation(sc);

            System.out.println("Enter another number: ");
            double secondNum = MyMethods.readDouble(sc);

            MyMethods.calculations(firstNum, secondNum, operation);

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String choice = MyMethods.userAnswer(sc);

            if (choice.equals("no")) {
                System.out.println("Exiting the calculator.");
                sc.close();
                break;
            }
        }
    }
}