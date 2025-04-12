package edu.rit.swen352.tdd;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyList} component.
 */
class MyListTest {

    /**
     * Test building the object
     */
    @org.junit.jupiter.api.Test
    void testConstructorEmpty()
    {
        MyList<String> myList = new MyList<String>();
        assertNotNull(myList);
    }



}
