package ru.job4j.arrayssorter;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class ArraysSorterTest {

	@Test
	public void whenCombainTwoSortedArraysThenOneSorted() {
		ArraysSorter as = new ArraysSorter();
		int[] result = as.createSortedArryas(new int[]{1, 3}, new int[]{0, 2, 3, 5});

		assertArrayEquals(result, new int[] {0, 1, 2, 3, 3, 5});
	}
}
