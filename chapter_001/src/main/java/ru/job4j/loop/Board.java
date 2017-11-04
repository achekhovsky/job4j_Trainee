package ru.job4j.loop;

/**
 * This class renders a chessboard using objects string.
 * @author achekhovsky
 * @version 1.0
 */
public class Board {

    /**
     * Method renders a chessboard using objects string.
     * @param width - width of the chessboard
     * @param height - height of the chessboard
     * @return chessboard in the string representation
     */
    public String paint(int width, int height) {
        StringBuilder stringBoard = new StringBuilder();
        String[] boardElements = {"X", " "};
        for (int h = 1; h <= height; h++) {
            for (int w = 1; w <= width; w++) {
                stringBoard.append(boardElements[(h + w) % 2]);
            }
            stringBoard.append(System.lineSeparator());
        }
        return stringBoard.toString();
    }
}
