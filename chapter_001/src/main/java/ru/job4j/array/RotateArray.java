package ru.job4j.array;

/**
 * This class contains a method which turns any array (square, rectangular, jagged) 90 degrees clockwise.
 * @author achekhovsky
 * @version 1.0
 */
public class RotateArray {
    /**
     * This method which turns any array (square, rectangular, jagged) 90 degrees clockwise.
     * When you turn "ragged" array, it is padded to a rectangular "0".
     * @param arrayForSort - the array which you want to rotate
     * @return array which rotated 90 degrees
     *
     */
    public int[][] rotate(int[][] arrayForSort) {
        int maxLength = 0;
        for (int[] line : arrayForSort) {
            if (maxLength < line.length) {
                maxLength = line.length;
            }
        }
        int[][] buffer = new int[maxLength][arrayForSort.length];
        for (int i = 0; i < arrayForSort.length; i++) {
            for (int j = 0; j < arrayForSort[i].length; j++) {
                buffer[j][buffer[j].length - 1 - i] = arrayForSort[i][j];
            }
        }
        return buffer;
    }
}
