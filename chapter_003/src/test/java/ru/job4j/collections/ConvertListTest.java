package ru.job4j.collections;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Test for ConvertList
 * @author achekhovsky
 */
public class ConvertListTest {
	/**
	 * Test for ConverList.toList method
	 */
	@Test
	public void ifArrayThenList() {
		ConvertList cl = new ConvertList();
		int[][] ar = new int[][]{{1, 2, 3}, {3, 2}, {6}};
		List<Integer> actual = cl.toList(ar);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(3);
		expected.add(2);
		expected.add(6);
		assertEquals(expected, actual);
	}
	/**
	 * Test for ConverList.toArray method
	 */
	@Test
	public void ifListWithSizeFiveThenArrayWithTreeRows() {
		ConvertList cl = new ConvertList();
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2); 
		lst.add(3);
		lst.add(4);
		lst.add(5);
		int[][] expected = new int[][] {{1, 2}, {3, 4}, {5, 0}};
		assertArrayEquals(expected, cl.toArray(lst, 3));
	}

}
