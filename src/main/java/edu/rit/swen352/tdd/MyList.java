package edu.rit.swen352.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * MyList is a flexible-sized sequence of elements with no gaps.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor: with varargs of initial elements</li>
 *   <li>add: add an element to the list; no-op if the element is already in the list (by reference)</li>
 *   <li>remove: remove an element by reference</li>
 *   <li>get: returns the element at a specific index;
 *     throw {@link java.util.NoSuchElementException} if the index is outside the size of the list</li>
 *   <li>isEmpty: queries if the list is empty</li>
 *   <li>size: queries how many elements in the list</li>
 *   <li>forEach: iterates over each element and executes the {@link java.util.function.Consumer} parameter</li>
 * </ul>
 *
 * @param <T> the type of elements in the list.
 */
public class MyList<T> {
    private List<T> elements;

    public MyList(T... initals)
    {
        elements = new ArrayList<>();

        for (T item : initals)
        {
            elements.add(item);
        }
    }

    public int size()
    {
        return elements.size();
    }

    public void add(T element)
    {
        if (!elements.contains(element))
        {
            elements.add(element);
        }
    }

    public void remove(T element)
    {
        elements.remove(element);
    }
}
