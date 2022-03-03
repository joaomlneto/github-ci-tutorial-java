package io.github.joaomlneto.github_ci_tutorial_java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    private final SimpleCalculator calc = new SimpleCalculator();

    @Test
    @DisplayName("Add two numbers")
    public void testAdd() {
        assertEquals(2, calc.add(1, 1));
    }

    @Test
    @DisplayName("Subtract two numbers")
    public void testSub() {
        assertEquals(0, calc.sub(1, 1));
    }

    @Test
    @DisplayName("Multiply two numbers")
    public void testMul() {
        assertEquals(15, calc.mul(3, 5));
    }

    @Test
    @DisplayName("Integer division of two numbers")
    public void testDiv() {
        assertEquals(4, calc.div(8, 2));
    }
}
