package ru.ac.uniyar.testingcourse;

import org.junit.jupiter.api.Test;
import ru.ac.uniyar.testingcourse.src.main.java.main.Counter;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    @Test
    public void testConstructor() {
        Counter ctr = new Counter();
        assertEquals(0, ctr.getValue());
    }

    @Test
    public void testReset() {
        Counter ctr = new Counter();
        ctr.reset();
        assertEquals(0, ctr.getValue());
    }

}
