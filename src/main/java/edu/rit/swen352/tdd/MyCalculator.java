package edu.rit.swen352.tdd;

/**
 * MyCalculator is a four function integer calculator for performing basic arithmetic.
 *
 * <p>
 * Features:
 * <ul>
 *   <li>constructor: initialize the calculator with a result field</li>
 *   <li>add: return the sum of 2 provided integers</li>
 *   <li>subtract: return the difference of 2 provided integers</li>
 *   <li>multiply: return the product of 2 provided integers</li>
 *   <li>divide: return the quotient of 2 provided integers</li>
 *   <li>getResult: returns the result of the most recent operation</li>
 * </ul>
 */
public class MyCalculator {
    private int result;

    public MyCalculator() {
        this.result = 0;
    }

    public int add(int x, int y) {
        this.result = x + y;
        return this.result;
    }

    public int subtract(int x, int y) {
        this.result = x - y;
        return this.result;
    }

    public int multiply(int x, int y) {
        this.result = x * y;
        return this.result;
    }

    public int getResult() {
        return this.result;
    }
}
