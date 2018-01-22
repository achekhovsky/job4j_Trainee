package ru.job4j.arrayssorter;

public class ArraysSorter {
	
	public int[] createSortedArryas(int[] firstSortedArray, int[] secondSortedArray) {
		
		int firstIndex = 0;
		int secondIndex = 0;
		
		int maxLength = firstSortedArray.length + secondSortedArray.length;
		int[] result = new int[maxLength];
		
		for (int i = 0; i < maxLength; i++) {
			if (secondIndex > secondSortedArray.length - 1
				|| (firstIndex <= firstSortedArray.length - 1
					&& firstSortedArray[firstIndex] < secondSortedArray[secondIndex])) {
				result[i] = firstSortedArray[firstIndex];
				firstIndex++;
			} else {
				result[i] = secondSortedArray[secondIndex];
				secondIndex++;
			} 
		}
		return result;
	}
}
