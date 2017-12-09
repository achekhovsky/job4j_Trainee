package ru.job4j.chessboard;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for the Elephant class
 */
public class ElephantTest {
    /**
     * Test for the Elephant.move method
     */
    @Test
    public void ifMoveAtOneZeroToFourThreeThenLastCellFourThree() {
        Figure elephant = new Elephant(new Cell(1, 0), FigureColor.White);
        Cell[] resultWay = new Cell[0];
        try {
            resultWay = elephant.way(new Cell(4, 3));
        } catch (ImpossibleMoveException e) {
            System.out.print(e);
        }
        Cell[] expectedWay = {new Cell(2, 1), new Cell(3, 2), new Cell(4, 3)};
        assertArrayEquals(resultWay, expectedWay);
    }
}