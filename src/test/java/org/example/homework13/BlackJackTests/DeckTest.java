package org.example.homework13.BlackJackTests;

import org.example.homework13.Deck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class DeckTest {

    @Test
    @DisplayName("Check creation of new Deck")
    void testDeckInitialization() {
        Deck deck = new Deck();

        assertEquals(52, deck.size());
    }

    @Test
    @DisplayName("Check drawing a single card from deck")
    void drawCard() {
        Deck deck = new Deck();
        int deckSize = deck.size();
        deck.drawCard();

        assertEquals(deckSize - 1, deck.size());
    }

    @Test
    @DisplayName("Check deck shuffling")
    void shuffle() {
        Deck deck = new Deck();
        int originalDeckSize = deck.size();

        deck.shuffle();

        List<Integer> originalIndices = IntStream.range(0, originalDeckSize)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> shuffledIndices = IntStream.range(0, originalDeckSize)
                .boxed()
                .map(i -> i + originalDeckSize)
                .collect(Collectors.toList());

        assertEquals(originalDeckSize, deck.size());
        assertEquals(originalDeckSize, shuffledIndices.size());
        assertNotEquals(originalIndices, shuffledIndices);
    }

    @Test
    @DisplayName("Check deck size after removing cards")
    void size() {
        Deck deck = new Deck();
        deck.drawCard();
        deck.drawCard();
        deck.drawCard();
        deck.drawCard();

        assertEquals(48, deck.size());
    }
}