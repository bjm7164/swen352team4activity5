package edu.rit.swen352.tdd;

/**
 * MyQueue is a collection that allows adding and removing elements in a first-in-first-out (FIFO) manner.
 *<ul>
 *     * <li>methods:
 *     <ul>
 *         <li>{@code add(element:T)} -- adds an element to the end of the queue</li>
 *         <li>{@code remove()} -- removes and returns the first element in the queue; throws {@link java.util.NoSuchElementException} if empty</li>
 *         <li>{@code peek()} -- returns the first element in the queue without removing it; throws {@link java.util.NoSuchElementException} if empty</li>
 *     </ul>
 *</ul>
 */
public class MyQueue {
    private Object[] elements;
    private int size;
    private int front;
    private int rear;
    private int capacity;

    /**
     * Constructs an empty queue with a default capacity.
     */
    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    public void add(Object element) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        elements[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
    }

    public Object remove() {
        return null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
