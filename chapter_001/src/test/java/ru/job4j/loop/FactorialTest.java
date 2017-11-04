package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for Factorial.
 * @author achekhovsky
 * @version $Id$
 */
public class FactorialTest {
    /**
     * Test for Factorial.calc method.
     */
    @Test
    public void ifSixThenSevenHundredTwenty() {
        Factorial fct = new Factorial();
        int result = fct.calc(6);
        assertThat(result, is(720));
    }

    /**
     * Test for Factorial.calc method.
     */
    @Test
    public void ifZeroThenOne() {
        Factorial fct = new Factorial();
        int result = fct.calc(0);
        assertThat(result, is(1));
    }

}