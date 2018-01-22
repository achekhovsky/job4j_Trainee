package ru.job4j.departmentsorter;

import java.util.Arrays;
import java.util.Comparator;
/**
 * Departments sorter. 
 * @author achekhovsky
 *
 */
public class DepartmentSorter {
	public static final int NATURAL_OREDER = 1;
	public static final int REVERSE_OREDER = -1;

	/**
	 * Sorting departments and adding missing items
	 * @param unreduced - departments for sort and adding
	 * @param orderType - sorting type
	 * @return Sorted array of departments with additional items
	 */
	public String[] sortAndRecover(String[] unreduced, int orderType) {
		String department =  "";
		int count = 0;
		Arrays.sort(unreduced, this.getComparator(orderType));
		String[] result = new String[unreduced.length + this.calculateAdditionalSize(unreduced)];
		for (int i = 0; i < unreduced.length; i++) {
			if (unreduced[i].split("/").length == 1) {
				department = unreduced[i].split("/")[0];
				result[i + count] = unreduced[i];
			} else {
				if (department.equals(unreduced[i].split("/")[0])) {
					result[i + count] = unreduced[i];
				} else {
					department = unreduced[i].split("/")[0];
					result[i + count++] = department;
					result[i + count] = unreduced[i];
				}
			}
		}
		return result;
	}

	/**
	 * Counting the number of items to add
	 * @param departments - departments array
	 * @return count of items
	 */
	private int calculateAdditionalSize(String[] departments) {
		int size = 0;
		String dep = "";
		for (String department : departments) {
			if (department.split("/").length == 1) {
				dep = department.split("/")[0];
			} else {
				if (!dep.equals(department.split("/")[0])) {
					dep = department.split("/")[0];
					size++;
				}
			}
		}
		return size;
	}

	/**
	 * Obtaining a comparator for sorting an array of departments
	 * @param orderType - sorting type
	 * @return comparator
	 */
	private Comparator<String> getComparator(int orderType) {
		return (new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				char[] firstArg = o1.toCharArray();
				char[] secondArg = o2.toCharArray();
				int result = 0;
				for (int i = 0; i < firstArg.length; i++) {
					if (i < secondArg.length && result == 0) {
						result = firstArg[i] - secondArg[i];
					} else  {
						break;
					}
				}
				return orderType * result;
		    } }).thenComparing(new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.split("/").length - arg1.split("/").length;
			} });
	}
	 	
}
