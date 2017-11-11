package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for FindSubStr.
 * @author achekhovsky
 * @version $Id$
 */
public class FindSubStrTest {
    /**
     * Test for FindSubStr.contains method.
     */
    @Test
    public void whenContainSubstringLeftThenTrue() {
        FindSubStr find = new FindSubStr();
        assertThat(find.contains("left", "left"), is(true));
    }
    /**
     * Test for FindSubStr.contains method.
     */
    @Test
    public void whenContainSubstringEftThenTrue() {
        FindSubStr find = new FindSubStr();
        assertThat(find.contains("left", "eft"), is(true));
    }
    /**
     * Test for FindSubStr.contains method.
     */
    @Test
    public void whenDontContainSubstringThenFalse() {
        FindSubStr find = new FindSubStr();
        assertThat(find.contains("left", "eftl"), is(false));
    }
}