package org.example.homework6;

import java.util.Scanner;

public class MyMethods {
    public static double readDouble(Scanner scanner) {
        try {
            String userValue = scanner.nextLine();
            return Double.parseDouble(userValue);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input. Please, try again and enter a correct number:");
            return readDouble(scanner);
        }
    }

    public static String getAndValidateOperation(Scanner scanner) {
        try {
            String operation = scanner.nextLine();
            if (operation.isEmpty() || operation.contains(" ")) {
                throw new MyException("Error: Operation cannot be empty or contain spaces. Try again:");
            }
            if (!operation.matches("[-+*/%]")) {
                throw new MyException("Error: Incorrect input. Please, try again and select one of the following: (+, -, *, /).");
            }
            return operation;
        } catch (MyException e) {
            System.out.println(e.getMessage());
            return getAndValidateOperation(scanner);
        }
    }

    public static void calculations(double first, double second, String operation) {
        if (operation.equals("+")) {
            System.out.println("Result: " + (first + second));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + (first - second));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + (first * second));
        } else if (operation.equals("/")) {
            if (second == 0) {
                System.out.println("Error: Division by zero.");
            } else {
                System.out.println("Result: " + (first / second));
            }
        }
    }

    public static String userAnswer(Scanner scanner) {
        try {
            String answer = scanner.nextLine();
            if (answer.isEmpty() || !answer.matches("(yes|no)") || answer.contains(" ")) {
                throw new MyException("Error: Incorrect input. Please select yes or no: ");
            }
            return answer;
        } catch (MyException i) {
            System.out.println(i.getMessage());
            return userAnswer(scanner);
        }
    }
}