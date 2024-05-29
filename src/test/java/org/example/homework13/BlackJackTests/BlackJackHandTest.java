package org.example.homework13.BlackJackTests;

import org.example.homework13.BlackJackHand;
import org.example.homework13.Card;
import org.example.homework13.Rank;
import org.example.homework13.Suit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BlackJackHandTest {

    @Test
    @DisplayName("Check adding and getting cards from hand")
    @Tag("HandClassTest")
    void getCards() {
        BlackJackHand hand = new BlackJackHand();
        Card card1 = new Card(Suit.HEARTS, Rank.ACE);
        Card card2 = new Card(Suit.CLUBS, Rank.KING);
        hand.addCard(card1);
        hand.addCard(card2);
        List<Card> cards = hand.getCards();

        assertEquals(2, cards.size());
        assertTrue(cards.contains(card1));
        assertTrue(cards.contains(card2));
    }

    @Test
    @DisplayName("Check getting card value")
    @Tag("HandClassTest")
    void getValue() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.FIVE));

        assertEquals(5, hand.getValue());
    }

    @Test
    @DisplayName("Check is hand busted")
    @Tag("HandClassTest")
    void isBusted() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.TEN));
        hand.addCard(new Card(Suit.CLUBS, Rank.QUEEN));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.TWO));

        assertTrue(hand.isBusted());
    }

    @Test
    @DisplayName("Check is blackJack or not")
    @Tag("HandClassTest")
    void isBlackJack() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        hand.addCard(new Card(Suit.CLUBS, Rank.KING));

        assertEquals(21, hand.getValue());
        assertTrue(hand.isBlackJack());
    }

    @Test
    @DisplayName("Check correct sum of cards calculation")
    @Tag("HandClassTest")
        void checkCardsSum() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.JACK));
        hand.addCard(new Card(Suit.CLUBS, Rank.QUEEN));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.KING));

        assertEquals(30, hand.getValue());
    }

    @Test
    @DisplayName("Check Hand toString method")
    @Tag("HandClassTest")
    void testToString() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.QUEEN));

        assertEquals("[QUEEN of HEARTS]", hand.toString());
    }
}