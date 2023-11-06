package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldCheckIfNumberIsEven() {

        boolean result = Main.checkIfNumberIsEven(10);
        assertTrue(result);

    }
    @Test
    void shouldCheckIfNumberIsNotEven(){

        boolean result2 = Main.checkIfNumberIsEven(9);
        assertFalse(result2);

    }
}