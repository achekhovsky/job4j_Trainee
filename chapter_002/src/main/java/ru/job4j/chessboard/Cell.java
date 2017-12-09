package ru.job4j.chessboard;

/**
 * This class describes the chessboard cell
 * @author achekhovsky
 */
public class Cell {
    public final int x;
    public final int y;

    /**
     * Constructor
     * @param x coordinate
     * @param y coordinate
     */
    Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the Cell
     * @return string representation
     */
    @Override
    public String toString() {
        return String.format("[%s, %s]", String.valueOf(this.x), String.valueOf(this.y));
    }

    /**
     * Indicates whether some other object is "equal to" this one
     * @param o the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cell cell = (Cell) o;

        if (x != cell.x) {
            return false;
        }
        return y == cell.y;
    }

    /**
     * Returns a hash code value for the cell
     * @return hash code
     */
    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
