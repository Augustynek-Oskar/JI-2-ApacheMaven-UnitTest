package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void shouldAddOnePlusTwo() {
        int result = Main.add(1,2);
        Assertions.assertEquals(3,result);
    }

    @Test
    void shouldSubtractTwoFromFour() {
        int result = Main.subtract(4,2);
        Assertions.assertEquals(2,result);
    }

    @Test
    void shouldMultiplyTwoWithThree() {
        int result = Main.multiply(2,3);
        Assertions.assertEquals(6,result);
    }

    @Test
    void shouldDivideFourByTwo() {
        float result = Main.divide(4,2);
        Assertions.assertEquals(2,result);
    }
}