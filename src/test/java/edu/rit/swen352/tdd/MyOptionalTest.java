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
        assertNotNull(emptyOptional.get());
    }

}
