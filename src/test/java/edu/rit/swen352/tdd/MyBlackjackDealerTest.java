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

}
