package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void checkIfUserIsAdult() {

        boolean result = Main.checkIfUserIsAdult(17);

        assertFalse(result);

        boolean result2 = Main.checkIfUserIsAdult(18);

        assertTrue(result2);

    }
}