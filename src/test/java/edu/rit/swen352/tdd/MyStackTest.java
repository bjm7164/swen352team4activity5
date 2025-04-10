package edu.rit.swen352.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the {@link MyStack} component.
 */
class MyStackTest {
    @Test
    @DisplayName("Constructor, no parameters")
    void stackConstructorNoParams() {
        MyStack<Integer> myStack = new MyStack<>();
        assertEquals(16, myStack.getCapacity());
    }
}
