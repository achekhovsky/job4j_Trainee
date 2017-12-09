package ru.job4j.chessboard;

import org.junit.Test;

import java.io.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for Board class
 * @author achekhovsky
 */
public class BoardTest {
    /**
     * Test for Board.move method
     */
    @Test
    public void ifWrongWayThenImpossibleMoveException() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(ba);
        System.setOut(out);
        Board brd = new Board();
        brd.addFigure(new Elephant(new Cell(1, 0), FigureColor.White));
        brd.move(new Cell(1, 0), new Cell(2, 2));
        assertThat(ba.toString(), is("ImpossibleMoveException: Figure can't be moved to [2, 2]"));
    }
    /**
     * Test for Board.move method
     */
    @Test
    public void ifFigureOnTheWayThenOccupiedWayException() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(ba);
        System.setOut(out);
        Board brd = new Board();
        brd.addFigure(new Elephant(new Cell(1, 0), FigureColor.White));
        brd.addFigure(new Elephant(new Cell(3, 2), FigureColor.Black));
        brd.move(new Cell(1, 0), new Cell(4, 3));
        assertThat(ba.toString(), is("OccupiedWayException: Figure can't be moved to [4, 3]"));
    }
    /**
     * Test for Board.move method
     */
    @Test
    public void ifFigureIsAbsentThenFigureNotFoundException() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(ba);
        System.setOut(out);
        Board brd = new Board();
        brd.move(new Cell(1, 0), new Cell(4, 3));
        assertThat(ba.toString(), is("FigureNotFoundException: Figure not found in the cell - [1, 0]"));
    }
}