package edu.rit.swen352.tdd;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test suite for the {@link MyQueue} component.
 */
public class MyQueueTest {

    /**
     * Test the constructor.
     */
    @org.junit.jupiter.api.Test
    void testConstructor() {
        MyQueue queue = new MyQueue(-10);
        assertTrue(queue.isEmpty());
    }

}
