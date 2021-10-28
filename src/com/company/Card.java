package com.company;
import java.util.ArrayList;

public class Card {
    private final String suit;
    private final int value;
    private final ArrayList<String> suits = new ArrayList<>();

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
        createSuits();
    }

    private void createSuits() {
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Spades");
        suits.add("Clubs");
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    // The lower the number the stronger is the card
    private int getSuitStrength() {
        return suits.indexOf(getSuit());
    }

    public Boolean beats(Card card) {
        Boolean beat = null;
        int suitStrength = getSuitStrength();
        int otherSuitStrength = card.getSuitStrength();

        if (suitStrength == otherSuitStrength) {
            if (getValue() > card.getValue()) {
                beat = true;
            } else if (card.getValue() > getValue()) {
                beat = false;
            }
        } else beat = suitStrength < otherSuitStrength;

        return beat;
    }

    public String beatsToString(Card card2) {
        String result;
        if (beats(card2) == null) {
            result = "Cards are equal";
        } else if (beats(card2)) {
            result = suit + " " + value + " beats " + card2.getSuit() + " " + card2.getValue();
        } else {
            result = suit + " " + value + " loses to " + card2.getSuit() + " " + card2.getValue();
        }

        return result;
    }

}
