package org.example.homework10.LambdaSplit;

import java.util.Arrays;

public class LambdaSplit {
    public static void main(String[] args) {
        splitAndPrint("Too cool for school");
    }

    public static void splitAndPrint(String sentence) {
        Arrays.stream((sentence.split(" ")))
                .forEach(n -> System.out.println(n));
    }
}