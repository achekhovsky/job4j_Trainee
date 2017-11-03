package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;


/**
 * Test for Point.
 * @author achekhovsky
 * @version $Id$
 */
public class TriangleTest {

    /**
     * Test for Triangle.area method.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }

    /**
     * Test for Triangle.distance method.
     */
    @Test
    public void whenDistanceDiffPointsThen10() {
        Point left = new Point(0, 0);
        Point right = new Point(0, 10);
        Triangle triangle = new Triangle(null, null, null);
        double rsl = triangle.distance(left, right);
        assertThat(rsl, closeTo(10, 0.01));
    }

}