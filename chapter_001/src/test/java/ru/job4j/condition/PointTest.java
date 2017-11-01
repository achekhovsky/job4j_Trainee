package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Test for Point.
 * @author achekhovsky
 * @version $Id$
 */
public class PointTest {

    /**
     * Test for Point.is method.
     */
    @Test
    public void whenAisThreeBisTwoXisOneYisFiveThenTrue() {
        Point pnt = new Point(1, 5);
        boolean result = pnt.is(3, 2);
        assertThat(result, is(true));
    }

}