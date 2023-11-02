package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldGetDayOfTheWeek() {

    int dayNumOne = 1;
    String result1 = Main.getDayOfTheWeek(1);
        Assertions.assertEquals("Monday", result1);

    int dayNumTwo = 2;
    String result2 = Main.getDayOfTheWeek(2);
        Assertions.assertEquals("Tuesday",result2);

    int dayNumSix = 6;
    String result6 = Main.getDayOfTheWeek(6);
        Assertions.assertEquals("Weekend", result6);

    int dayNumEight = 8;
    String result8 = Main.getDayOfTheWeek(8);
        Assertions.assertEquals("There is no such day!", result8);

    }
}