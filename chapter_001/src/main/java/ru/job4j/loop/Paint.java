package ru.job4j.loop;

/**
 * This class renders a piramid using objects string.
 * @author achekhovsky
 * @version 1.0
 */
public class Paint {
    /**
     * Method renders a piramid using objects string.
     * @param height - height of the piramid
     * @return chessboard in the string representation
     */
    public String piramid(int height) {
        StringBuilder stringChristmasTree = new StringBuilder();
        for (int h = 0; h < height; h++) {
            for (int i = 1; i < height * 2; i++) {
                stringChristmasTree.append(((i >= height - h) && (i <= height + h)) ? "^" : " ");
            }
            stringChristmasTree.append(System.lineSeparator());
        }
        return stringChristmasTree.toString();
    }
}
