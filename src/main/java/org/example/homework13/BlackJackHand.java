package org.example.homework13;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand {

    private List<Card> cards;

    public BlackJackHand() {
        cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getValue() {
        int value = 0;
        int numberOfAces = 0;

        for (Card card : cards) {
            switch (card.getRank()) {
                case TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN -> value += card.getRank().ordinal() + 2;
                case JACK, QUEEN, KING -> value += 10;
                case ACE -> {
                    value += 11;
                    numberOfAces++;
                }
            }
        }

        while (value > 21 && numberOfAces > 0) {
            value -= 10;
            numberOfAces--;
        }
        return value;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackJack() {
        return getValue() == 21 && cards.size() == 2;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}