package ru.job4j.departmentsorter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;



/**
 * Test for DepartmentSorter class 
 * @author achekhovsky
 *
 */
public class DepartmentSorterTest {
	private String[] departments;

	@Before
	public void setUp() {
		departments = new String[] {
				"K1", "K3/SK1/SSK3", "K2/SK1", "K3", "K2/SK2/SSK1", "K2/SK1/SSK3", "K2/SK2", "K1/SK1/SSK2"};
	}
	
	@Test
	public void whenNaturalOrder() {
		DepartmentSorter ds = new DepartmentSorter();
		String[] expected = new String[] {
				"K1", "K1/SK1/SSK2", "K2", "K2/SK1", "K2/SK1/SSK3", "K2/SK2", "K2/SK2/SSK1", "K3", "K3/SK1/SSK3"};
		assertArrayEquals(ds.sortAndRecover(departments, DepartmentSorter.NATURAL_OREDER), expected);
	}
	
	@Test
	public void whenReverseOrder() {
		DepartmentSorter ds = new DepartmentSorter();
		String[] expected = new String[] {
				"K3", "K3/SK1/SSK3", "K2", "K2/SK2", "K2/SK2/SSK1", "K2/SK1", "K2/SK1/SSK3", "K1", "K1/SK1/SSK2"};
		assertArrayEquals(ds.sortAndRecover(departments, DepartmentSorter.REVERSE_OREDER), expected);
	}
}
