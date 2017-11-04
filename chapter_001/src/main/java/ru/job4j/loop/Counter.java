package ru.job4j.loop;

import static java.util.stream.IntStream.*;

/**
 * A class with method for the method for calculating the sum of even numbers.
 * @author achekhovsky
 * @version 1.0
 */
public class Counter {
    /**
     * The method for calculating the sum of even numbers.
     * @param start the beginning of the range
     * @param finish the range of the range
     * @return
     */
    public int add(int start, int finish) {
        return rangeClosed(start, finish).filter((v) -> v % 2 == 0).sum();
    }
}
