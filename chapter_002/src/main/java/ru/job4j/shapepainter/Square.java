package ru.job4j.shapepainter;

/**
 * This class contain method for drawing triangle.
 * @author achekhovsky
 */
public class Square implements Shape {
    private StringBuilder square;
    /**
     * Constructor for this class
     */
    public Square() {
        square = new StringBuilder();
    }

    /**
     * The method for drawing square.
     * @return The square in the string representation
     */
    @Override
    public String pic() {
        square.append("+++");
        square.append(System.lineSeparator());
        square.append("+++");
        square.append(System.lineSeparator());
        square.append("+++");
        return square.toString();
    }
}
