package ru.job4j.array;

/**
 * This class contains a method which sorts the array.
 * @author achekhovsky
 * @version 1.0
 */
public class BubbleSort {
    /**
     * Method which sorts the array bubble way.
     * @param arrayForTurn - input array
     * @return sorted array
     */
    public int[] sort(int[] arrayForTurn) {
        for (int i = 0; i < arrayForTurn.length - 1; i++) {
            if (arrayForTurn[i] > arrayForTurn[i + 1]) {
                int replace = arrayForTurn[i];
                arrayForTurn[i] = arrayForTurn[i + 1];
                arrayForTurn[i + 1] = replace;
                arrayForTurn = sort(arrayForTurn);
                break;
            }
        }
        return arrayForTurn;
    }
}
