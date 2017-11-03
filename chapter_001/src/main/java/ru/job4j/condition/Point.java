package ru.job4j.condition;

/**
 * This class describes a point in the 2D coordinate system.
 * @author achekhovsky
 * @version 1.0
 */
public class Point {
    //axis X
    private int x;
    //axis Y
    private int y;

    /**
     * Class constructor
     * @param x - axis X value
     * @param y - axis Y value
     */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The method return axis X.
     * @return axis X value
     */
    public int getX() {
        return this.x;
    }

    /**
     * The method return axis Y.
     * @return axis Y value
     */
    public int getY() {
        return this.y;
    }

    /**
     * The method determines whether the point(x, y) of the function y(x) = a * x + b.
     * @param a - the first parameter of the function
     * @param b - the second parameter of the function
     * @return true if the point belongs to the function and false if not belong
     */
    public boolean is(int a, int b) {
        return this.y == a * this.x + b ? true : false;
    }
}
