package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for Turn.
 */
public class BubbleSortTest {
    /**
     * Test for BubbleSort.sort method
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        assertThat(bs.sort(new int[]{1, 5, 4, 2, 3, 6, 7, 8, 0, 2}), is(new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8}));
    }
    /**
     * Test for BubbleSort.sort method
     */
    @Test
    public void whenSortArrayWithElevenElementsThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        assertThat(bs.sort(new int[]{1, 2, 3, 4, 11, 6, 7, 8, 0, 5, 9}), is(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11}));
    }
    /**
     * Test for BubbleSort.sort method
     */
    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        assertThat(bs.sort(new int[]{1, 5, 4, 2, 3}), is(new int[]{1, 2, 3, 4, 5}));
    }
}