package org.example.homework11;

import java.util.HashMap;
import java.util.Map;

public class LettersCounter {
    public static void main(String[] args) {
        Map<Character, Integer> lettersCount = lettersCount("kkkattttttttte");
        printLetterCount(lettersCount);

    }

    public static Map<Character, Integer> lettersCount(String countedString) {
        Map<Character, Integer> lettersCount = new HashMap<>();
        for (int i = 0; i < countedString.length(); i++) {
            char letter = countedString.charAt(i);
            lettersCount.put(letter, lettersCount.getOrDefault(letter, 0) + 1);
        }
        return lettersCount;
    }

    public static void printLetterCount(Map<Character, Integer> lettersCount) {
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            System.out.println("Char: " + entry.getKey() + ", count value: " + entry.getValue());
        }
    }
}