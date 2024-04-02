package org.example.homework5;

public class EvenDigitsSum {
    public static void main(String[] args) {
        int sum = getEvenDigitSum(542);
        System.out.println(sum);
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0)
                sum += digit;
                number /= 10;
        }

        return sum;
    }
}