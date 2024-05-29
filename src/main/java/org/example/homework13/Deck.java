package org.example.homework13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        fillDeckWithCards();
    }

    private void fillDeckWithCards() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public Card drawCard() {
        return cards.removeFirst();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int size() {
        return cards.size();
    }
}