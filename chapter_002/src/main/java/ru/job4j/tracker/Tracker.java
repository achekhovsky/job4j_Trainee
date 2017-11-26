package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Class-wrapper for items
 */
public class Tracker {
	private final Item[] items = new Item[100];
	private int position = 0;

	/**
	 * Adds item to the tracker
	 * @param item - the item to add
	 * @return added item
	 */
	public Item add(Item item) {
		item.setId(Tracker.generateId());
		items[this.position++] = item;
		return item;
	}

	/**
	 * Editing the item
	 * @param itm
	 */
	public void updateItem(Item itm) {
		for (int i = 0; i < this.findAll().length; i++) {
			if (items[i] != null && items[i].getId().equals(itm.getId())) {
				items[i] = itm;
				break;
			}
		}
	}

	/**
	 * Removing the item
	 * @param itm
	 */
	public void deleteItem(Item itm) {
		for (int i = 0; i < this.findAll().length; i++) {
			if (items[i].getId().equals(itm.getId())) {
				System.arraycopy(items, i + 1, items, i, items.length - 1 - i);
				position--;
			}
		}
	}

	/**
	 * Find item by id
	 * @param id - the id of the item to search
	 * @return If the item has been found then item, else - null
	 */
	public Item findById(String id) {
		for (Item itm : items) {
			if (itm != null && itm.getId().equals(id)) {
				return itm;
			}
		}
		return null;
	}

	/**
	 * Find items by name
	 * @param name - the name of the items to search
	 * @return The array of items with the specified names
	 */
	public Item[] findByName(String name) {
		int posit = 0;
		Item[] result = new Item[100];
		for (Item itm : items) {
			if (itm != null && itm.getName().equals(name)) {
				result[posit++] = itm;
			}
		}
		return Arrays.copyOfRange(result, 0, posit);
		
	}

	/**
	 * Returns items array with no empty elements
	 * @return Items array with no empty elements
	 */
	public Item[] findAll() {
		return Arrays.copyOfRange(items, 0, position);
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
