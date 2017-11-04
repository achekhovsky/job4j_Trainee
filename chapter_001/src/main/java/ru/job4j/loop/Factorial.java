package ru.job4j.loop;

/**
 * A class with method for calculating factorial.
 * @author achekhovsky
 * @version 1.0
 */
public class Factorial {

    /**
     * The method for calculating factorial.
     * @param n - the number to calculate the factorial
     * @return n factorial
     */
    public int calc(int n) {
        int result = 1;
        if (n > 0) {
            result = n * calc(n - 1);
        }
        return result;
    }
}
