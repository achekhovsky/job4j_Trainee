package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for RotateArray.
 */
public class ArrayDuplicateTest {
    @Test
    public void whenArrayWithDuplicatesThenArrayWhitoutDuplicates() {
        ArrayDuplicate ad = new ArrayDuplicate();
        assertThat(ad.remove(new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"}),
                is(new String[]{"Привет", "Мир", "Супер"}));
    }
}