package ru.job4j.collections;

import java.util.Collection;
import java.util.Random;

public class AddDeleteTimer {
	public static final String CHARS_FOR_STRING = "QWERTYUIASDFGH123456";
	public static final int MAX_LENGHT = 10;
	
	private String generateString() {
		StringBuilder strB = new StringBuilder();
		Random random = new Random();
		
		int strLenght = random.nextInt(MAX_LENGHT);
		for (int i = 0; i < strLenght; i++) {
			strB.append(CHARS_FOR_STRING.charAt(random.nextInt(CHARS_FOR_STRING.length())));
		}
		
		return strB.toString();
	}
	
	public long add(Collection<String> collection, int amount) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < amount; i++) {
			collection.add(this.generateString());
		}
		return System.currentTimeMillis() - startTime;
	}
	
	public long delete(Collection<String> collection, int amount) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < amount; i++) {
			if (collection.iterator().hasNext()) {
				collection.remove(collection.iterator().next());
			} else {
				break;
			}
			
		}
		return System.currentTimeMillis() - startTime;
	}


}
