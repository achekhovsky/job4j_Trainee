package ru.job4j.lettingcoins;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestForLettingCoins {
	@Test
	public void whenLettingTwentyTwo() {
		LettingCoins lc = new LettingCoins();
		assertArrayEquals(lc.changes(50, 28), new int[] {10, 10, 2});
	}

}
