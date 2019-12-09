package com.maxwit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FooTest {
    @Test
    public void addTwoNumbers () {
        Foo f = new Foo();
        int result = f.add(10, 20);
        assertEquals(30, result);
    }
}
