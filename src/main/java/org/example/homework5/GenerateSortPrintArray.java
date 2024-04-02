package org.example.homework5;

import java.util.Random;

public class GenerateSortPrintArray {
    public static void main(String[] args) {
        int[] numbers = getIntegers(10);
        System.out.println("Here is your randomized unsorted array: \n");
        printArray(numbers);
        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println("\nHere is your sorted array:\n");
        printArray(sortedNumbers);

    }

    private static int[] getIntegers(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    private static void printArray(int[] numbers) {
        int element = 0;
        for (int i : numbers) {
            element++;
            System.out.println("Element " + element + " contents: " + i);
        }

    }

    private static int[] sortIntegers(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        return numbers;
    }

}