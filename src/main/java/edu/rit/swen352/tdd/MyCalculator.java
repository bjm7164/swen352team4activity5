package edu.rit.swen352.tdd;

/**
 * MyCalculator is a four function integer calculator for performing basic arithmetic.
 *
 * <p>
 * Features:
 * <ul>
 *   <li>constructor: initialize the calculator with a result field</li>
 *   <li>add: compute the sum of 2 provided integers</li>
 *   <li>subtract: compute the difference of 2 provided integers</li>
 *   <li>multiply: compute the product of 2 provided integers</li>
 *   <li>divide: compute the quotient of 2 provided integers</li>
 *   <li>getResult: returns the result of the most recent operation</li>
 * </ul>
 */
public class MyCalculator {
    private int result;

    public MyCalculator() {
        this.result = 0;
    }

    public void add(int x, int y) {
        this.result = x + y;
    }

    public void subtract(int x, int y) {
        this.result = x - y;
    }

    public void multiply(int x, int y) {
        this.result = x * y;
    }

    public void divide(int x, int y) {
        this.result = x / y;
    }

    public int getResult() {
        return this.result;
    }
}
