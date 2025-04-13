package edu.rit.swen352.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

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
        assertEquals(123, myStack.peek());
    }

    @Test
    @DisplayName("Push item onto full stack")
    void pushOntoFullStack() {
        MyStack<Integer> myStack = new MyStack<>(2);
        myStack.push(1);
        myStack.push(2);
        assertThrows(IllegalStateException.class, () -> myStack.push(3));
        assertEquals(2, myStack.peek());
    }

    @Test
    @DisplayName("Pop item from stack")
    void popTest() {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(123);
        Object element = myStack.pop();
        assertEquals(123, element);
    }

    @Test
    @DisplayName("Pop item from empty stack")
    void popFromEmptyStack() {
        MyStack<Integer> myStack = new MyStack<>();
        assertThrows(NoSuchElementException.class, () -> myStack.pop());
        assertEquals(-1, myStack.getTop());
    }
}
