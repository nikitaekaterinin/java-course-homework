package org.example.homework13.BlackJackTests;

import org.example.homework13.Deck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DeckTest {

    @Test
    @DisplayName("Check creation of new Deck")
    @Tag("DeckClassTest")
    void testDeckInitialization() {
        Deck deck = new Deck();

        assertEquals(52, deck.size());
    }

    @Test
    @DisplayName("Check drawing a single card from deck")
    @Tag("DeckClassTest")
    void drawCard() {
        Deck deck = new Deck();
        int deckSize = deck.size();
        deck.drawCard();

        assertEquals(deckSize - 1, deck.size());
    }

    @Test
    @DisplayName("Check deck shuffling")
    @Tag("DeckClassTest")
    void shuffle() {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        deck1.shuffle();
        boolean diff = false;
        for (int i = 0; i < 52; i++) {
            if (!deck1.drawCard().equals(deck2.drawCard())) {
                diff = true;
                break;
            }
        }

        assertTrue(diff, "Deck hasn't been shuffled");
    }


    @Test
    @DisplayName("Check deck size after removing cards")
    @Tag("DeckClassTest")
    void size() {
        Deck deck = new Deck();
        deck.drawCard();
        deck.drawCard();
        deck.drawCard();
        deck.drawCard();

        assertEquals(48, deck.size());
    }
}