package ru.job4j.shapepainter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for Square class.
 */
public class SquareTest {
    /**
     * Test for Square.pic method
     */
    @Test
    public void whenSquarePic() {
        Square trgl = new Square();
        StringBuilder result = new StringBuilder();
        result.append("+++");
        result.append(System.lineSeparator());
        result.append("+++");
        result.append(System.lineSeparator());
        result.append("+++");
        assertThat(result.toString(), is(trgl.pic()));
    }

}