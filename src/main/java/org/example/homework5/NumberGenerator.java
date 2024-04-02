package org.example.homework5;

import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {

        Random random = new Random();

        int count = 0;
        int sum = 0;

        boolean[] generatedNumbers = new boolean[101];

        while (true) {

            int randomNumber = random.nextInt(101);

            if (!generatedNumbers[randomNumber]) {
                generatedNumbers[randomNumber] = true;
                sum += randomNumber;
                count++;
                System.out.println(randomNumber);
            } else {
                break;
            }

        }

        System.out.println("The total count of unique numbers is: " + count);
        System.out.println("The total sum of found numbers is: " + sum);
    }
}