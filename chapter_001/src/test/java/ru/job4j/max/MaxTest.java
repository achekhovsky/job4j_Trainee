package ru.job4j.max;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Test for Max.
 * @author achekhovsky
 * @version $Id$
 */
public class MaxTest {

    /**
     * Test for Max.findMax (whith two arg) method.
     */
    @Test
    public void whenFirstLessSecond() {
        Max m = new Max();
        int result = m.findMax(3, 4);
        assertThat(result, is(4));
    }

    /**
     * Test for Max.findMax (whith three arg) method.
     */
    @Test
    public void whenTirdIsMax() {
        Max m = new Max();
        int result = m.findMax(3, 1, 6);
        assertThat(result, is(6));
    }

}