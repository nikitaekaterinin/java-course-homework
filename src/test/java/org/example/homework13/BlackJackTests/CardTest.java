package org.example.homework13.BlackJackTests;

import org.example.homework13.Card;
import org.example.homework13.Rank;
import org.example.homework13.Suit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {

    @Test
    @DisplayName("Check getting card suit")
    @Tag("CardClassTest")
    void getSuit() {
        Card card = new Card(Suit.HEARTS, Rank.QUEEN);

        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    @DisplayName("Check getting card rank")
    @Tag("CardClassTest")
    void getRank() {
        Card card = new Card(Suit.HEARTS, Rank.QUEEN);

        assertEquals(Rank.QUEEN, card.getRank());
    }

    @Test
    @DisplayName("Check Card class toString method")
    @Tag("CardClassTest")
    void testToString() {
        Card card = new Card(Suit.HEARTS, Rank.KING);

        assertEquals("KING of HEARTS", card.toString());
    }
}