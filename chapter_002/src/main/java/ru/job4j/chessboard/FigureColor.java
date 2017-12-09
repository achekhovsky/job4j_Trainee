package ru.job4j.chessboard;

public enum  FigureColor {
    White("W"), Black("B");

    private String shortName;

    FigureColor(String sn) {
        shortName = sn;
    }

    public String getShortName() {
        return shortName;
    }
}
