package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Test for Calculator.
 * @author achekhovsky
 * @version $Id$
 */
public class CalculatorTest {
    /**
     * Test for Calculator.add method.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test for Calculator.subtract method.
     */
    @Test
    public void whenSubtractTwoAndOneThenOne() throws Exception {
        Calculator calc = new Calculator();
        calc.subtract(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Test for Calculator.div method.
     */
    @Test
    public void whenDivNineAndTreeThenTree() throws Exception {
        Calculator calc = new Calculator();
        calc.div(9D, 3D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
    /**
     * Test for Calculator.multiple method.
     */
    @Test
    public void whenMultipleTreeAndTwoThenSix() throws Exception {
        Calculator calc = new Calculator();
        calc.multiple(3D, 2D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }

}