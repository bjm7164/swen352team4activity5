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
     * Test constructor makes an object
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
     * Test constructor makes an object
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

}
