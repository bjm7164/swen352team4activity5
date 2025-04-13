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

    @Test
    @DisplayName("Constructor with capacity parameter")
    void stackConstructorWithParam() {
        MyStack<Integer> myStack = new MyStack<>(5);
        assertEquals(5, myStack.getCapacity());
    }

    @Test
    @DisplayName("Push item onto stack")
    void pushTest() {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(123);
        assertEquals(0, myStack.getTop());
    }
}
