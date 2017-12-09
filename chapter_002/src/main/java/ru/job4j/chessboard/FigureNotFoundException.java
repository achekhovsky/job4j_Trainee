package ru.job4j.chessboard;

public class FigureNotFoundException extends RuntimeException {
    String msg;
    FigureNotFoundException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return String.format("FigureNotFoundException: Figure not found in the cell - %s", msg);
    }
}
