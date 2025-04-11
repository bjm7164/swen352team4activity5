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
        String value = "Hello, World!";
        MyOptional<String> optional = new MyOptional<>();
        assertEquals(value, optional.get());
    }

}
