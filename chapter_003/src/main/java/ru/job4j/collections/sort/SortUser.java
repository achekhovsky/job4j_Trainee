package ru.job4j.collections.sort;

import java.util.Comparator;
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

	/**
	 * Sort users by name length
	 * @param users - unsorted users
	 * @return sorted users
	 */
	public List<User> sortNameLength(List<User> users) {
		users.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return Integer.compare(o1.getName().length(), o2.getName().length());
			}
		});
		return users;
	}

	/**
	 * Sort users by all fields
	 * @param users - unsorted users
	 * @return sorted users
	 */
	public List<User> sortByAllFields(List<User> users) {
		users.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName()) == 0
						? Integer.compare(o1.getAge(), o2.getAge())
						: o1.getName().compareTo(o2.getName());
			}
		});
		return users;
	}
}
