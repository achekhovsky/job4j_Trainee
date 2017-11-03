package ru.job4j.condition;

/**
 * The class describes triangle.
 * @author achekhovsky
 * @version 1.0
 */
public class Triangle {
    //First point
    private Point a;
    //Second point
    private Point b;
    //Third point
    private Point c;

    /**
     * Class constructor
     * @param a - first point
     * @param b - second point
     * @param c - third point
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * The method calculates the distance between two points.
     * @param left - left point
     * @param right - right point
     * @return distance between two points
     */
    public double distance(Point left, Point right) {
        return Math.sqrt(Math.pow((right.getX() - left.getX()), 2) + Math.pow((right.getY() - left.getY()), 2));
    }

    /**
     * The method calculates the half perimeter of the triangle.
     * @param ab - the length of the side ab
     * @param ac - the length of the side ac
     * @param bc - the length of the side bc
     * @return the half perimeter of the triangle.
     */
    public double halfPeriod(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * The method calculates the area of the triangle.
     * @return the area of the triangle or -1 if the triangle not exist.
     */
    public double area() {
        double rsl = -1;
        if (this.exist()) {
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.halfPeriod(ab, ac, bc);

            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * The method determines the possibility of constructing a triangle.
     * @return true if three points don't place on the same line, else return false.
     */
    private boolean exist() {
        return !(this.a.getX() == this.b.getX() && this.a.getX() == this.c.getX())
                && !(this.a.getY() == this.b.getY() && this.a.getY() == this.c.getY());
    }

}
