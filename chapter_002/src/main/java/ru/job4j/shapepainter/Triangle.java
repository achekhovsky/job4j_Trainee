package ru.job4j.shapepainter;

/**
 * This class contain method for drawing triangle.
 * @author achekhovsky
 */
public class Triangle implements Shape {
    private StringBuilder triangle;

    /**
     * Constructor for this class
     */
    public Triangle() {
        triangle = new StringBuilder();
    }

    /**
     * The method for drawing triangle.
     * @return The triangle in the string representation
     */
    @Override
    public String pic() {
        triangle.append("  +  ");
        triangle.append(System.lineSeparator());
        triangle.append(" +++ ");
        triangle.append(System.lineSeparator());
        triangle.append("+++++");
        return triangle.toString();
    }
}
