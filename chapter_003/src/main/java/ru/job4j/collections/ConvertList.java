package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * The class contain methods for convert from the array to the list and conversely
 * @author achekhovsky
 * @version 1.0
 */
public class ConvertList {
	
	/**
	 * Convert array to list
	 * @param array - converted array
	 * @return The list
	 */
	public List<Integer> toList(int[][] array) {
		ArrayList<Integer> lst = new ArrayList<Integer>(array.length * array[0].length);	
		for (int[] innerArray : array) {
			for (int inner : innerArray) {
				lst.add(inner);
			}
		}
		return lst;
	}
	
		
	/**
	 * Convert list to array 
	 * @param lst - converted list
	 * @param rows - count rows in the array
	 * @return The array
	 */
	public int[][] toArray(List<Integer> lst, int rows) {
		int rowLenght = lst.size();
		while (rowLenght % rows != 0) {
			rowLenght++;
		}
		rowLenght /= rows;
		int[][] result = new int[rows][rowLenght];
		int tr = 0;
		int td = 0;
		for (int val : lst) {
			if (td < rowLenght) {
				td++;				
			} else {
				td = 1;
				tr++;
			}
			result[tr][td - 1] = val;
		}
		return result;
	}
}
