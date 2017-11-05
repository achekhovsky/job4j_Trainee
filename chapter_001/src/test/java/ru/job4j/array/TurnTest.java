package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for Turn.
 */
public class TurnTest {

    /**
     * Test for Turn.back method
     */
    @Test
    public void ifOneTwoFreeThenFreeTwoOne() {
        Turn trn = new Turn();
        int[] result = trn.back(new int[] {1, 2, 3});
        assertThat(result, is(new int[] {3, 2, 1}));
    }

    /**
     * Test for Turn.back method
     */
    @Test
    public void ifTwoSixFreeFourThenFourFreeSixTwo() {
        Turn trn = new Turn();
        int[] result = trn.back(new int[] {2, 6, 3, 4});
        assertThat(result, is(new int[] {4, 3, 6, 2}));
    }

}