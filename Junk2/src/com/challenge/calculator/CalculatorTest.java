package com.challenge.calculator;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        Assert.assertEquals(BigDecimal.valueOf(7), new Calculator("1 + 2 * 3").calculate());
        Assert.assertEquals(BigDecimal.valueOf(6), new Calculator("1 + 2 + 3").calculate());
        Assert.assertEquals(BigDecimal.valueOf(2), new Calculator("1 - 2 + 3").calculate());
        Assert.assertEquals(BigDecimal.valueOf(5), new Calculator("4 / 2 + 3").calculate());
        Assert.assertEquals(BigDecimal.valueOf(5), new Calculator("3 + 4 / 2").calculate());
        Assert.assertEquals(BigDecimal.valueOf(5), new Calculator("9 / 3 + 4 / 2").calculate());
        Assert.assertEquals(BigDecimal.valueOf(3.5), new Calculator("3.0 / 2 + 4 / 2").calculate());
        Assert.assertEquals(BigDecimal.valueOf(3006000.00), new Calculator("300.0 * 200.0 + 5000 * 600").calculate());
    }

}
