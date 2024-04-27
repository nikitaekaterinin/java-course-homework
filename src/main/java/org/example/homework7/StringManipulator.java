package org.example.homework7;

import java.util.Arrays;

public class StringManipulator {
    public static void main(String[] args) {
        String initialString = "abcd4efabc123deabcdaaa";
        char[] charsToRemove = {'a', 'd', '3'};

        String modifiedString = removeCharacters(initialString, charsToRemove);
        System.out.println("Initial string: " + initialString);
        System.out.println("Characters to remove: " + Arrays.toString(charsToRemove));
        System.out.println("Modified string: " + modifiedString);

    }

    public static String removeCharacters(String initialString, char[] charsToRemove) {
        StringBuilder sb = new StringBuilder();

        outerLoop:
        for (int i = 0; i < initialString.length(); i++) {
            char currentChar = initialString.charAt(i);
            for (int j = 0; j < charsToRemove.length; j++) {
                if (currentChar == charsToRemove[j]) {
                    continue outerLoop;
                }
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }
}