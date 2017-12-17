package ru.job4j.collections.listtomap;

import java.util.HashMap;
import java.util.List;

/**
 * Convert list to map
 * @author achekhovsky
 * @version 1.0
 */
public class UserConvert {
	public HashMap<Integer, User> process(List<User> list) {
		HashMap<Integer, User> result = new HashMap<Integer, User>();
		for (User usr : list) {
			result.put(usr.getId(), usr);
		}
		return result;
	}
}
