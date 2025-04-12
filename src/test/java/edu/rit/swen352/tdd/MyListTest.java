package edu.rit.swen352.tdd;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyList} component.
 */
class MyListTest {

    /**
     * Test building the object
     */
    @org.junit.jupiter.api.Test
    void testConstructor()
    {
        MyList<String> myList = new MyList<String>();
        assertNotNull(myList);
    }

    /**
     * Test building the object with a parameter
     */
    @org.junit.jupiter.api.Test
    void testConstructorPopulated()
    {
        List test = new ArrayList<String>();
        test.add("hi");
        test.add("professor");
        test.add("Basham");

        MyList<String> myList = new MyList<String>("hi", "professor", "Basham");
        assertNotNull(myList);
        assertEquals(test.size(), myList.size());
    }



}
