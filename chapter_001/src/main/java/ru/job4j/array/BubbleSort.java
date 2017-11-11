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
        boolean flag = false;
        for (int i = arrayForTurn.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayForTurn[j] > arrayForTurn[j + 1]) {
                    int buf = arrayForTurn[j];
                    arrayForTurn[j] = arrayForTurn[j + 1];
                    arrayForTurn[j + 1] = buf;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return arrayForTurn;
    }
}
