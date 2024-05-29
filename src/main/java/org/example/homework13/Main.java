package org.example.homework13;

public class Main {

    public static void main(String[] args) {
        var deck = new Deck();
        deck.shuffle();

        var playerOneHand = new BlackJackHand();
        System.out.println("Empty hand: " + playerOneHand);

        playerOneHand.addCard(deck.drawCard());
        playerOneHand.addCard(deck.drawCard());
        playerOneHand.addCard(deck.drawCard());
        System.out.println("Hand with three cards:" + playerOneHand);

        System.out.println("Value: " + playerOneHand.getValue());
        System.out.println("Is blackjack: " + playerOneHand.isBlackJack());
        System.out.println("Is busted: " + playerOneHand.isBusted());
    }
}