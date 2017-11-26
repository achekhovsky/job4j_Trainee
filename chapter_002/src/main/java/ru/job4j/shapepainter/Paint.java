package ru.job4j.shapepainter;

/**
 * This main class in this package.
 * @author achekhovsky
 */
public class Paint {

    public static void main(String[] args) {
        new Paint().init();
    }

    public void init() {
        this.draw(new Square());
        this.draw(new Triangle());
    }

    /**
     * The method which return to the"standard" output stream various shapes
     * in the string representation.
     * @param shape
     */
    public void draw(Shape shape) {
        System.out.println(shape.pic());
    }
}
