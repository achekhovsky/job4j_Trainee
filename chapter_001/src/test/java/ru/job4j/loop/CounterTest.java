package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for Max.
 * @author achekhovsky
 * @version $Id$
 */
public class CounterTest {

    /**
     * Test for Counter.add method.
     */
    @Test
    public void ifRangeFromTwoToEightThenTwenty() {
        Counter cnt = new Counter();
        int result = cnt.add(2, 8);
        assertThat(result, is(20));
    }
}