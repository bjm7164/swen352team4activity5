package edu.rit.swen352.tdd;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyQueue} component.
 */
public class MyQueueTest {

    /**
     * Test the constructor.
     */
    @org.junit.jupiter.api.Test
    void testConstructor() {
        assertThrows(IllegalArgumentException.class, () -> {
            MyQueue queue = new MyQueue(-10);
        });
    }

    /**
     * Test the add method.
     */
    @org.junit.jupiter.api.Test
    void testAdd() {
        MyQueue queue = new MyQueue(2);
        queue.add("A");
        queue.add("B");
       assertThrows(IllegalStateException.class, () -> {
            queue.add("C");
        });
    }

}
