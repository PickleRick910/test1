package com.testing1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        int result = mathUtils.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = mathUtils.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        int result = mathUtils.multiply(7, 2);
        assertEquals(14, result);
    }

    @Test
    public void testDivideByNonZero() {
        double result = mathUtils.divide(8, 2);
        assertEquals(4.0, result, 0.001); // 3rd argument is delta for double comparison
    }

    @Test
    public void testDivideByZero() {
        double result = mathUtils.divide(8, 0);
        assertEquals(-1.0, result, 0.001);
    }
}
