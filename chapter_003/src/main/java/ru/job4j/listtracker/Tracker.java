package ru.job4j.listtracker;

import java.util.ArrayList;

/**
 * Class-wrapper for items
 */
public class Tracker {
	private final ArrayList<Item> items = new ArrayList<Item>();

	/**
	 * Adds item to the tracker
	 * @param item - the item to add
	 * @return added item
	 */
	public Item add(Item item) {
		item.setId(Tracker.generateId());
		items.add(item);
		return item;
	}

	/**
	 * Editing the item
	 * @param itm
	 */
	public void updateItem(Item itm) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) != null && items.get(i).getId().equals(itm.getId())) {
				items.set(i, itm);
				break;
			}
		}
	}

	/**
	 * Removing the item
	 * @param itm
	 */
	public void deleteItem(Item itm) {
		items.remove(itm);
	}

	/**
	 * Find item by id
	 * @param id - the id of the item to search
	 * @return If the item has been found then item, else - null
	 */
	public Item findById(String id) {
		Item itm =  null;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) != null && items.get(i).getId().equals(id)) {
				itm = items.get(i);
				break;
			}
		}
		return itm;
	}

	/**
	 * Find items by name
	 * @param name - the name of the items to search
	 * @return The array of items with the specified names
	 */
	public ArrayList<Item> findByName(String name) {
		ArrayList<Item> result = new ArrayList<Item>();
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) != null && items.get(i).getName().equals(name)) {
				result.add(items.get(i));
			}
		}
		result.trimToSize();
		return result;
		
	}

	/**
	 * Returns items array with no empty elements
	 * @return Items array with no empty elements
	 */
	public ArrayList<Item> findAll() {
		return new ArrayList<Item>(items);
	}

	/**
	 * Generation of item id
	 * @return The item id
	 */
	private static String generateId() {
	    String appender = String.valueOf(System.nanoTime());
		return "item_" + appender.substring(appender.length() - 4, appender.length() - 1);
	}

}
