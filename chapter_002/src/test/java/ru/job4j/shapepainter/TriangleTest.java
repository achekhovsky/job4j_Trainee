package ru.job4j.shapepainter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Triangle class.
 */
public class TriangleTest {

    /**
     * Test for Triangle.pic method
     */
    @Test
    public void whenTrianglePic() {
        Triangle trgl = new Triangle();
        StringBuilder result = new StringBuilder();
        result.append("  +  ");
        result.append(System.lineSeparator());
        result.append(" +++ ");
        result.append(System.lineSeparator());
        result.append("+++++");
        assertThat(result.toString(), is(trgl.pic()));
    }
}
