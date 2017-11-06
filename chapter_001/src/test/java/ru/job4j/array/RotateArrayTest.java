package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for RotateArray.
 */
public class RotateArrayTest {

    /**
     * Test for RotateArray.rotate method
     */
    @Test
    public void whenRotateTwoByTwo() {
        RotateArray ra = new RotateArray();
        int[][] result = ra.rotate(new int[][]{{1, 2}, {3, 4}});
        assertThat(result, is(new int[][]{{3, 1}, {4, 2}}));
    }

    /**
     * Test for RotateArray.rotate method
     */
    @Test
    public void whenRotateTreeByTree() {
        RotateArray ra = new RotateArray();
        int[][] result = ra.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        assertThat(result, is(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}));
    }

}