package ru.job4j.chessboard;

public class ImpossibleMoveException extends RuntimeException {
    String msg;
    ImpossibleMoveException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return String.format("ImpossibleMoveException: Figure can't be moved to %s", msg);
    }
}
