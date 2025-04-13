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

    /**
     * Test adding one element to the object
     */
    @org.junit.jupiter.api.Test
    void testAddElement()
    {
        List expected = new ArrayList<String>();
        expected.add("hi");
        expected.add("professor");
        expected.add("Basham");
        expected.add("I love formula one!");

        MyList<String> myList = new MyList<String>("hi", "professor", "Basham");
        assertNotNull(myList);
        assertEquals(expected.size()-1, myList.size());
        myList.add("I love formula one!");
        assertEquals(expected.size(), myList.size());
    }

    /**
     * Test adding one element to the object when the element already exists
     */
    @org.junit.jupiter.api.Test
    void testAddPreexistingElement()
    {
        List expected = new ArrayList<String>();
        expected.add("hi");
        expected.add("professor");
        expected.add("Basham");

        MyList<String> myList = new MyList<String>("hi", "professor", "Basham");
        assertNotNull(myList);
        int initalSize = myList.size();
        assertEquals(expected.size(), initalSize);
        myList.add("hi");
        assertEquals(initalSize, myList.size());
    }

    /**
     * Test removing an element from the list
     */
    @org.junit.jupiter.api.Test
    void testRemoveElement()
    {
        MyList<String> myList = new MyList<String>("hi", "professor", "Basham");
        assertNotNull(myList);
        assertEquals(3, myList.size());
        myList.remove("hi");
        assertEquals(2, myList.size());
    }

    /**
     * Test getting an element that exists
     */
    @org.junit.jupiter.api.Test
    void testGetElementValid()
    {
        MyList<String> myList = new MyList<String>("hi", "professor", "Basham");
        assertNotNull(myList);
        String item = myList.get(0);
        assertEquals("professor", item);
    }



}
