package ru.job4j.chessboard;

/**
 * Abstract class which describes the chess figure behavior
 */
public interface FigureBehavior {
    /**
     * This method move the figure on the specified cell
     * @param dest - destination cell
     * @return The array which stores the sequence of cells which the figure passed
     * @throws ImpossibleMoveException Indicate that the figure try moved not on the algorithm
     */
    public Cell[] way(Cell dest) throws ImpossibleMoveException;
    /**
     * Create a clone of the figure on the specified cell
     * @param dest specified cell
     * @return New figure on the specified cell
     */
    public Figure clone(Cell dest);
}
