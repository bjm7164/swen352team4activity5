package edu.rit.swen352.tdd;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyOptional} component.
 */
class MyOptionalTest {

    /**
     * Test the constructor.
     */
    @org.junit.jupiter.api.Test
    void testConstructor() {
        MyOptional<String> optional = MyOptional.empty();
        assertNotNull(optional);
    }

    /**
     * Test the empty() method.
     */
    @org.junit.jupiter.api.Test
    void testEmpty() {
        MyOptional<String> optional = MyOptional.empty();
        assertNotNull(optional);
    }

    /**
     * Test the of() method.
     */
    @org.junit.jupiter.api.Test
    void testOf() {
        MyOptional<String> optional = MyOptional.of("Hello");
        assertEquals("Hello", optional.get());
        assertThrows(NullPointerException.class, () -> MyOptional.of(null));
    }

    /**
     * Test the ofNullable() method.
     */
    @org.junit.jupiter.api.Test
    void testOfNullable() {
        MyOptional<String> optional = MyOptional.ofNullable("Hello");
        assertEquals("Hello", optional.get());
        MyOptional<String> emptyOptional = MyOptional.ofNullable(null);
        assertNotNull(emptyOptional);
    }

    /**
     * Test the isPresent() method.
     */
    @org.junit.jupiter.api.Test
    void testIsPresent() {
        MyOptional<String> optional = MyOptional.of("Hello");
        assertTrue(optional.isPresent());
        MyOptional<String> emptyOptional = MyOptional.empty();
        assertFalse(emptyOptional.isPresent());
    }

    /**
     * Test the get() method.
     */
    @org.junit.jupiter.api.Test
    void testGet() {
        MyOptional<String> optional = MyOptional.of("Hello");
        assertEquals("Hello", optional.get());
        MyOptional<String> emptyOptional = MyOptional.empty();
        assertThrows(java.util.NoSuchElementException.class, emptyOptional::get);
    }

    /**
     * Test the map() method.
     */
    @org.junit.jupiter.api.Test
    void testMap() {
        MyOptional<String> optional = MyOptional.of("Hello");
        MyOptional<Integer> mappedOptional = optional.map(String::length);
        assertEquals(5, mappedOptional.get());
    }

}
