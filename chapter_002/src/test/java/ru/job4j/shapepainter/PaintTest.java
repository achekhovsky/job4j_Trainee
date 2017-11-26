package ru.job4j.shapepainter;

import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for Paint class.
 */
public class PaintTest {
    /**
     * Test for Paint.draw method
     */
    @Test
    public void whenDrawSquare() {
        ByteArrayOutputStream out  = new ByteArrayOutputStream();
        PrintStream ps =  new PrintStream(out);
        System.setOut(ps);
        new Paint().draw(new Triangle());
        StringBuilder result = new StringBuilder();
        result.append("  +  ");
        result.append(System.lineSeparator());
        result.append(" +++ ");
        result.append(System.lineSeparator());
        result.append("+++++");
        result.append(System.lineSeparator());
        assertThat(result.toString(), is(out.toString()));

    }

}