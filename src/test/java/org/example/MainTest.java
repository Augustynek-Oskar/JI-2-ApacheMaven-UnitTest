package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void shouldAddOnePlusTwo() {
        int result = Main.add(1,2);
        Assertions.assertEquals(3,result);
    }
}