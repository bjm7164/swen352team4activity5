package edu.rit.swen352.tdd;

public class MyBlackjackDealer {

    private int deckSize; // representing deck with size for sake of the assignment
    private int handValue;

    public MyBlackjackDealer()
    {
        deckSize = 52;
        handValue = 0;
    }

    public int getDeckSize() {
        return deckSize;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setDeckSize(int deckSize) {
        this.deckSize = deckSize;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public void hit()
    {
        if (handValue <= 15)
        {
            deckSize--;
        }
    }


}
