package com.maxwit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void sum () {
        Calculator cal = new Calculator();
        assertEquals(33, cal.add(11, 22));
    }
}