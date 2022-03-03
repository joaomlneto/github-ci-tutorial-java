package io.github.joaomlneto.github_ci_tutorial_java;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleCalculatorTests {
    private SimpleCalculator calc;

    @BeforeClass
    public void init() {
        this.calc = new SimpleCalculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(1, 1), 2);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(calc.sub(1, 1), 0);
    }

    @Test
    public void testMul() {
        Assert.assertEquals(calc.mul(3, 5), 15);
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(calc.add(8, 2), 4);
    }
}
