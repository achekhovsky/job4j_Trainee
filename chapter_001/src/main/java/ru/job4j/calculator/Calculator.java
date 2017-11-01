package ru.job4j.calculator;

/**
 * A class with methods for arithmetic operations.
 * @author achekhovsky
 * @version 1.0
 */
public class Calculator {

    //Field which is assigned the calculation results.
    private double result;

    /**
     * The method calculates the sum of the two values.
     * The result is given to the field 'result'.
     * @param first - the first value
     * @param second - the second value
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * The method calculates the difference between the two values.
     * The result is given to the field 'result'.
     * @param first - the first value
     * @param second - the second value
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * The method calculates the quotient of the two values.
     * The quotient is given to the field 'result'.
     * @param first - the dividend
     * @param second - the divisor
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * The method calculates the product  of the two values.
     * The product  is given to the field 'result'.
     * @param first - the multiplicand
     * @param second - the multiplier
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * The method returns the result of the calculation.
     * @return - the result of the calculation.
     */
    public double getResult() {
        return this.result;
    }
}
