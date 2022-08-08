package com.reshmyhome;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void addTwoNumbers() {
        int a = 10;
        int b = 20;
        int expectedResult = 30;
        assertEquals(a + b, expectedResult);
    }
}
