package ru.job4j.chessboard;

/**
 * Abstract class which describes the chess figure
 */
public abstract class Figure implements FigureBehavior {
    public final FigureColor color;
    public final Cell position;
    /**
     * This constructor initialize the figure on the specified cell and with specified color
     * @param cell - The cell on which figure is initialize
     * @param fc - The color of the figure
     */
    Figure(Cell cell, FigureColor fc) {
        this.position = cell;
        this.color = fc;
    }

    /**
     * Returns a string representation of the Figure
     * @return string representation
     */
    @Override
    public String toString() {
        return String.format("%s(%s)", "F", this.color.getShortName());
    }
}
