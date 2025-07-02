package demo.calculator_v2;

package org.example;

import org.junit.Before;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void divide() {
        double result = calculator.divide(10, 2);
        assertEquals(5, result, 0);
    }

    @Test
    public void testSum() {
        double[] arr = {1, 2, 3, 4, 5};
        double result = calculator.sum(arr);
        assertEquals(15, result, 0);
    }

    @Test
    public void testSumEmptyArray() {
        double[] arr = {};
        double result = calculator.sum(arr);
        assertEquals(0, result, 0);
    }

    @Test
    public void testSubtract() {
        double [] arr = {10, 2, 3};
        double result = calculator.subtract(arr);
        assertEquals(5, result, 0);
    }

    @Test
    public void testMultiplication() {
        double[] arr = {2, 3, 4};
        double result = calculator.Multiplication(arr);
        assertEquals(24, result, 0);
    }

    @Test
    public void testDivideByZero() {
        double result = calculator.divide(10, 0);
        assertEquals(Double.MIN_VALUE, result, 0);
    }

    @Test
    public void testSquareRoot() {
        double result = calculator.squareRoot(16);
        assertEquals(4, result, 0);
    }

    @Test
    public void testSquareRootNegativeNumber() {
        double result = calculator.squareRoot(-16);
        assertEquals(Double.MIN_VALUE, result, 0);
    }

    @Test
    public void testModuloTwoNumber() {
        double result = calculator.moduloOfTwoNum(10, 3);
        assertEquals(1, result, 0);
    }

    @Test
    public void testModuloTwoNumberNegative() {
        double result = calculator.moduloOfTwoNum(-10, 3);
        assertEquals(-1, result, 0);
    }

    @Test
    public void testModuloTwoNumberByZero() {
        double result = calculator.moduloOfTwoNum(10,0);
        assertEquals(Double.MIN_VALUE, result, 0);
    }

    @Test
    public void testAverage() {
        double [] arr = {1, 2, 3, 4, 5};
        double result = calculator.Average(arr);
        assertEquals(3, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageEmptyArray() {
        double [] arr = {};
        calculator.Average(arr);
    }

    @Test
    public void testFactorial() {
        int result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialZero() {
        int result = calculator.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialNegative() {
        int result = calculator.factorial(-5);
        assertEquals(0, result);
    }

    @Test
    public void testSumSingleNumber() {
        double [] arr = {7};
        double result = calculator.sum(arr);
        assertEquals(7, result, 0);
    }

    @Test
    public void testDivideFractionalResult() {
        double result = calculator.divide(5,3);
        assertEquals(1.6666666666667, result, 0.0001);
    }

    @Test
    public void testSquareRootOfLargeNumber() {
        double result = calculator.squareRoot(10000);
        assertEquals(100, result, 0);
    }

    @Test
    public void testModuloTwoNumberBothZero() {
        double result = calculator.moduloOfTwoNum(0, 0);
        assertEquals(Double.MIN_VALUE, result, 0);
    }

    @Test
    public void testAverageNegativeNumbers() {
        double [] arr = {-1, -2, -3, -4, -5};
        double result = calculator.Average(arr);
        assertEquals(-3, result, 0);
    }

    @Test
    public void testFactorialLargeNegativeNumber() {
        int result = calculator.factorial(-10);
        assertEquals(0, result);
    }

    @Test
    public void testFactorialLargePositiveNumber() {
        int result = calculator.factorial(20);
        assertEquals(243290299, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageArrayWithNaN() {
        double[] arr = {1,2,3, Double.NaN, 5};
        calculator.Average(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeNonInteger() {
        int result = calculator.factorial(-5);
    }

    @Test
    public void testSubtractSingleNumber() {
        double[] arr = {5};
        double result = calculator.subtract(arr);
        assertEquals(5, result, 0);
    }

    @Test
    public void testMultiplicationEmptyArray() {
        double[] arr = {};
        double result = calculator.Multiplication(arr);
        assertEquals(0, result, 0);
    }

    @Test
    public void testDivideNegativeNumbers() {
        double result = calculator.divide(-10, -2);
        assertEquals(5, result, 0);
    }

    @Test
    public void testSquareRootOfZero() {
        double result = calculator.squareRoot(0);
        assertEquals(0, result, 0);
    }

    @Test
    public void testSquareRootOfOne() {
        double result = calculator.squareRoot(1);
        assertEquals(1, result, 0);
    }

    @Test
    public void testModuloTwoNumberEqual()  {
        double result = calculator.moduloOfTwoNum(5,5);
        assertEquals(0, result, 0);
    }

    @Test
    public void testModuloTwoNumberBothNegative() {
        double result = calculator.moduloOfTwoNum(-7, -3);
        assertEquals(-1, result, 0);
    }

    @Test
    public void testModuloTwoNumberEqualNegative() {
        double result = calculator.moduloOfTwoNum(-6, -6);
        assertEquals(0, result, 0);
    }

    @Test
    public void testFactorialLargeNumber() {
        int result = calculator.factorial(10);
        assertEquals(3628800, result);
    }

    @Test
    public void testFactorialNegativeOddNumber() {
        int result = calculator.factorial(-7);
        assertEquals(0, result);
    }
}