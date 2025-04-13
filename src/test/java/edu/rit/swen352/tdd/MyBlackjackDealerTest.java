package edu.rit.swen352.tdd;

import static org.junit.jupiter.api.Assertions.*;

public class MyBlackjackDealerTest {

    /**
     * Test constructor makes an object
     */
    @org.junit.jupiter.api.Test
    void testConstructor()
    {
        MyBlackjackDealer dealer = new MyBlackjackDealer();
        assertNotNull(dealer);
    }

    /**
     * Test hit when dealer should hit
     */
    @org.junit.jupiter.api.Test
    void testHitAction()
    {
        MyBlackjackDealer dealer = new MyBlackjackDealer();
        assertNotNull(dealer);

        dealer.setHandValue(11);
        dealer.hit();
        assertTrue(dealer.getDeckSize() < 52);
    }

    /**
     * Test hit when dealer should stay
     */
    @org.junit.jupiter.api.Test
    void testHitPassive()
    {
        MyBlackjackDealer dealer = new MyBlackjackDealer();
        assertNotNull(dealer);

        dealer.setHandValue(18);
        dealer.hit();
        assertEquals(52, dealer.getDeckSize());
    }

    /**
     * Test dealing a card out of the deck
     */
    @org.junit.jupiter.api.Test
    void testDealCard()
    {
        MyBlackjackDealer dealer = new MyBlackjackDealer();
        assertNotNull(dealer);

        dealer.dealCard();
        assertEquals(51, dealer.getDeckSize());
    }

    /**
     * Test dealing a hand to a player
     */
    @org.junit.jupiter.api.Test
    void testDealHandOnePlayer()
    {
        MyBlackjackDealer dealer = new MyBlackjackDealer();
        assertNotNull(dealer);

        dealer.dealHand(1);
        assertEquals(48, dealer.getDeckSize());
    }

    /**
     * Test dealing a hand to no players
     */
    @org.junit.jupiter.api.Test
    void testDealHandNoPlayers()
    {
        MyBlackjackDealer dealer = new MyBlackjackDealer();
        assertNotNull(dealer);

        dealer.dealHand(0);
        assertEquals(52, dealer.getDeckSize());
    }

}
