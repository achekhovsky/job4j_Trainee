package ru.job4j.chessboard;

/**
 * This class describes behavior chess figure "Elephant"
 * @author achekhovsky
 */
public class Elephant extends Figure {

    /**
     * This constructor initialize the figure on the specified cell and with specified color
     * @param cell - The cell on which figure is initialize
     * @param fc - The color of the figure
     */
    Elephant(Cell cell, FigureColor fc) {
        super(cell, FigureColor.White);
    }

    /**
     * This method move the figure on the specified cell
     * @param dest - destination cell
     * @return The array which stores the sequence of cells which the figure passed
     * @throws ImpossibleMoveException Indicate that the figure try moved not on the algorithm
     */
    @Override
    public Cell[] way(Cell dest) throws  ImpossibleMoveException {
        Cell[] way;
        if ((this.position.x % 2 == this.position.y % 2) && (dest.x % 2 == dest.y % 2)
                ||
                (this.position.x % 2 != this.position.y % 2) && (dest.x % 2 != dest.y % 2)) {
                int signX = (dest.x - this.position.x) / Math.abs(dest.x - this.position.x);
                int signY = (dest.y - this.position.y) / Math.abs(dest.y - this.position.y);
                way = new Cell[Math.abs(dest.x - this.position.x)];
                for (int i = 1; this.position.x + ((i - 1) * signX) != dest.x; i++) {
                    way[i - 1] = new Cell(this.position.x + (i * signX), this.position.y + (i * signY));
                }
        } else {
            throw new ImpossibleMoveException(dest.toString());
        }
        if (way[way.length - 1].x == dest.x && way[way.length - 1].y == dest.y) {
            return way;
        } else {
            throw new ImpossibleMoveException(dest.toString());
        }
    }

    /**
     * Create a clone of the figure on the specified cell
     * @param dest specified cell
     * @return New figure on the specified cell
     */
    @Override
    public Figure clone(Cell dest) {
        return new Elephant(dest, this.color);
    }
}
