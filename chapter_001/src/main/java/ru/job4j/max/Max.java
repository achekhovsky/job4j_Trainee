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

    /**
     * The method compares tree values and return maximum.
     * @param first - the first value
     * @param second - the second value
     * @param third - the third value
     * @return maximum value
     */
    public int findMax(int first, int second, int third) {
        return this.findMax(first, second) > third ? this.findMax(first, second) : third;
    }

}
