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
}
