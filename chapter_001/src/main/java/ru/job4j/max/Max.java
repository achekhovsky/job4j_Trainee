package ru.job4j.max;

/**
 * A class with methods for arithmetic operations.
 * @author achekhovsky
 * @version 1.0
 */
public class Max {
    /**
     * The method compares two values and return maximum.
     * @param first - the first value
     * @param second - the second value
     * @return maximum value
     */
    public int findMax(int first, int second) {
        return first > second ? first : second;
    }
}
