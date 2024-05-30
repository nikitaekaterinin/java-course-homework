package org.example.homework13.StringUtilsTests;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTests {
    @Test
    @Tag("1st")
    @DisplayName("Check string correctness")
    void checkEmail() {
        String sample = "Liverpool";

        assertTrue(StringUtils.isNoneEmpty(sample));
        assertTrue(StringUtils.contains(sample, 'i'));
        assertTrue(StringUtils.endsWith(sample, "ool"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Andy", "Anna", "Albul"})
    @Tag("2nd")
    @DisplayName("Check that the name start with A")
    void checkUserNames(String str) {
        assertTrue(StringUtils.startsWithIgnoreCase(str, "A"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"lol", "kek", "pop"})
    @Tag("3rd")
    @DisplayName("Check is the palindrome string")
    void checkIsPalindrome(String str) {
        String revertedSting = StringUtils.reverse(str);

        assertEquals(str, revertedSting);
    }

    @Test
    @Tag("4th")
    @DisplayName("Check creation of new word after replace char")
    void checkNewWord() {
        String example = "mama";
        String expected = StringUtils.replaceChars(example, 'm', 'p');

        assertEquals("papa", expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Snake", "Table", "Plant", "Chair"})
    @Tag("5th")
    @DisplayName("Check that all strings contains 5 chars")
    void checkCharsAmount(String str) {
        int length = StringUtils.length(str);

        assertEquals(5, length);
    }

    @Test
    @Tag("6th")
    @DisplayName("Check removing symbols from string")
    void checkRemovingChar() {
        String example = "HelloHello";
        String expected = StringUtils.remove(example, "l");

        assertTrue(StringUtils.containsNone(expected, 'l'));
    }

    @Test
    @Tag("7th")
    @DisplayName("Check spaces are removed.")
    void checkCharsAmount() {
        String sample = "L o n d o n";
        String trimmed = StringUtils.deleteWhitespace(sample);

        assertEquals("London", trimmed);
    }

    @Test
    @Tag("8th")
    @DisplayName("Check abbreviate method.")
    void testAbbreviate() {
        String input = "The quick brown fox jumps over the lazy dog";
        String expected = "The quick...";
        String actual = StringUtils.abbreviate(input, 12);

        assertEquals(expected, actual);
    }

    @Test
    @Tag("9th")
    @DisplayName("Check mobile number contains only digits")
    void checkDigits() {
        String number = "098348953";
        boolean result = StringUtils.isNumeric(number);

        assertTrue(result);
    }

    @Test
    @Tag("10th")
    @DisplayName("Check swap case")
    void swapCase() {
        String sample = "hELLO wORLD";
        String swapped = StringUtils.swapCase(sample);

        assertEquals("Hello World", swapped);
    }
}