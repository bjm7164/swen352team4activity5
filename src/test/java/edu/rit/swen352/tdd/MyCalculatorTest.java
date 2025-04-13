package edu.rit.swen352.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyCalculatorTest {
    @Test
    @DisplayName("Construct a new calculator")
    void constructorTest() {
        MyCalculator calculator = new MyCalculator();
        Assertions.assertEquals(0, calculator.getResult());
    }

    @Test
    @DisplayName("Adding 2 numbers")
    void addTest() {
        MyCalculator calculator = new MyCalculator();
        calculator.add(1, 2);
        Assertions.assertEquals(3, calculator.getResult());
    }

    @Test
    @DisplayName("Subtract 2 numbers")
    void subtractTest() {
        MyCalculator calculator = new MyCalculator();
        calculator.subtract(3, 2);
        Assertions.assertEquals(1, calculator.getResult());
    }

    @Test
    @DisplayName("Multiply 2 numbers")
    void multiplyTest() {
        MyCalculator calculator = new MyCalculator();
        calculator.multiply(3, 2);
        Assertions.assertEquals(6, calculator.getResult());
    }

    @Test
    @DisplayName("Divide 2 numbers")
    void divideTest() {
        MyCalculator calculator = new MyCalculator();
        calculator.divide(10, 2);
        Assertions.assertEquals(5, calculator.getResult());
    }
}
