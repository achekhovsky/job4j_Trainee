package ru.job4j.chessboard;

import java.util.Arrays;

/**
 * This class describes the chessboard
 * @author achekhovsky
 */
public class Board {
    private Figure[][] figures;

    /**
     * Default constructor
     */
    Board() {
        figures = new Figure[8][8];
    }

    /**
     * This method add figure on the chessboard
     * @param f - the figure
     */
    public void addFigure(Figure f) {
        this.figures[f.position.x][f.position.y] = f;
    }

    /**
     * This method move the figure (if it is in the specified cell) to the specified cell on
     * the chessboard
     * @param source form coordinate
     * @param dest to coordinate
     * @return true if success or false otherwise
     * @throws ImpossibleMoveException Indicate that the figure try moved not on the algorithm
     * @throws OccupiedWayException Indicate if on the way encountered a barrier
     * @throws FigureNotFoundException Indicate if figure not found
     */
    public boolean move(Cell source, Cell dest)
            throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        Figure f = this.figures[source.x][source.y];
        boolean success = false;
        try {
            if (f == null) {
                throw new FigureNotFoundException(source.toString());
            }
            for (Cell cell : f.way(dest)) {
                if (cell != null && this.figures[cell.x][cell.y] != null) {
                    throw new OccupiedWayException(dest.toString());
                }
            }
            success = true;
            this.figures[dest.x][dest.y] = f.clone(dest);
            this.figures[source.x][source.y] = null;
        } catch (FigureNotFoundException | OccupiedWayException | ImpossibleMoveException ex) {
            System.out.print(ex);
        }
        return success;
    }
}
