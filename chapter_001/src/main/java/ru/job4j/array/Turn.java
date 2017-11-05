package ru.job4j.array;

/**
 * This class contain method which reverses the array.
 * @author achekhovsky
 * @version 1.0
 */
public class Turn {
    /**
     * This method reverses array.
     * @param arrayToRaplace - array to replace elements
     * @return array with reverses elements
     */
    public int[] back(int[] arrayToRaplace) {
        for (int i = 0; i < arrayToRaplace.length / 2; i++) {
            int replace = arrayToRaplace[i];
            arrayToRaplace[i] = arrayToRaplace[arrayToRaplace.length - 1 - i];
            arrayToRaplace[arrayToRaplace.length - 1 - i] = replace;
        }
        return arrayToRaplace;
    }
}
