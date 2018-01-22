package ru.job4j.lettingcoins;

import java.nio.IntBuffer;

public class LettingCoins {
	private final int[] coins = new int[] {1, 2, 5, 10};
	
	public int[] changes(int money, int price) {
		
		int letting = money - price;
		IntBuffer result = IntBuffer.allocate(countCoins(letting));
		
		for (int i = coins.length - 1; i >= 0; i--) {
			while (letting - coins[i] >= 0) {
				letting -= coins[i];
				result.put(coins[i]);
			}
		}
		
		return result.array();
	}
	
	private int countCoins(int sum) {
		int value = 0;
		
		for (int i = coins.length - 1; i > 0; i--) {
			value += sum / coins[i];
			sum = sum % coins[i];
		}
		
		return value;
	}

}
