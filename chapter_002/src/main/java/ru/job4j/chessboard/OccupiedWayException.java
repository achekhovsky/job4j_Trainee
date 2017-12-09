package ru.job4j.chessboard;

public class OccupiedWayException extends RuntimeException {
    String msg;
    OccupiedWayException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return String.format("OccupiedWayException: Figure can't be moved to %s", msg);
    }
}
