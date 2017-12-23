package ru.job4j.collections.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * The class contains methods for sorting a List<User>
 * @author achekhovsky
 */
public class SortUser {
	/**
	 *	Convert List to Set
	 * @param users - List for conversion to set
	 * @return TreeSet<User>
	 */
	public Set<User> sort(List<User> users) {
		Set<User> usersTree = new TreeSet<User>();
		usersTree.addAll(users);

		return usersTree;
	}
}
