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
        assertNull(optional.get());
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
    }

}
