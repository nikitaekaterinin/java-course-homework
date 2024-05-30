package org.example.homework13.BlackJackTests;

import org.example.homework13.BlackJackHand;
import org.example.homework13.Card;
import org.example.homework13.Rank;
import org.example.homework13.Suit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BlackJackHandTest {

    @Test
    @DisplayName("Check adding and getting cards from hand")
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
    void getValue() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.FIVE));

        assertEquals(5, hand.getValue());
    }

    @Test
    @DisplayName("Check is hand busted")
    void isBusted() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.TEN));
        hand.addCard(new Card(Suit.CLUBS, Rank.QUEEN));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.TWO));

        assertTrue(hand.isBusted());
    }

    @Test
    @DisplayName("Check is blackJack or not")
    void isBlackJack() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        hand.addCard(new Card(Suit.CLUBS, Rank.KING));

        assertEquals(21, hand.getValue());
        assertTrue(hand.isBlackJack());
    }

    @Test
    @DisplayName("Check sum of cards with faces")
    void testSumFaceCards() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.JACK));
        hand.addCard(new Card(Suit.CLUBS, Rank.QUEEN));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.KING));

        assertEquals(30, hand.getValue());
    }

    @Test
    @DisplayName("Check sum of different card types")
    void testSumDiffCards() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        hand.addCard(new Card(Suit.CLUBS, Rank.KING));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.FIVE));

        assertEquals(16, hand.getValue());
    }

    @Test
    @DisplayName("Check sum of all Aces")
    void testAcesSum() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        hand.addCard(new Card(Suit.CLUBS, Rank.ACE));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.ACE));
        hand.addCard(new Card(Suit.SPADES, Rank.ACE));

        assertEquals(14, hand.getValue());
    }

    @Test
    @DisplayName("Check sum of different simple cards")
    void testHandWithNumericCards() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.TWO));
        hand.addCard(new Card(Suit.SPADES, Rank.THREE));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.FOUR));
        hand.addCard(new Card(Suit.CLUBS, Rank.FIVE));

        assertEquals(14, hand.getValue());
    }

    @Test
    @DisplayName("Check the empty hand")
    void testEmptyHand() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.ACE));

        assertEquals(11, hand.getValue());
    }

    @Test
    @DisplayName("Check single ace value")
    void testSingleAce() {
        BlackJackHand hand = new BlackJackHand();

        assertEquals(0, hand.getValue());
    }

    @Test
    @DisplayName("Check Hand toString method")
    void testToString() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.HEARTS, Rank.QUEEN));
        hand.addCard(new Card(Suit.CLUBS, Rank.KING));
        hand.addCard(new Card(Suit.HEARTS, Rank.JACK));
        assertEquals("[QUEEN of HEARTS, KING of CLUBS, JACK of HEARTS]", hand.toString());
    }
}