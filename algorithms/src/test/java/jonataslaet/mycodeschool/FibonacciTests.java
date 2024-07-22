package jonataslaet.mycodeschool;

import com.github.jonataslaet.mycodeschool.Fibonacci;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTests {

    private final BigDecimal expectedElementAtPosition0 = new BigDecimal("0");
    private final BigDecimal expectedElementAtPosition1 = new BigDecimal("1");
    private final BigDecimal expectedElementAtPosition2 = new BigDecimal("1");
    private final BigDecimal expectedElementAtPosition3 = new BigDecimal("2");
    private final BigDecimal expectedElementAtPosition38 = new BigDecimal("39088169");
    private final BigDecimal expectedElementAtPosition39 = new BigDecimal("63245986");
    private final BigDecimal expectedElementAtPosition40 = new BigDecimal("102334155");
    private final BigDecimal expectedElementAtPosition41 = new BigDecimal("165580141");
    private final BigDecimal expectedElementAtPosition42 = new BigDecimal("267914296");
    private final BigDecimal expectedElementAtPosition43 = new BigDecimal("433494437");

    @Test
    public void testFibonacciWithDynamicProgramming() {
        assertEquals(expectedElementAtPosition0, Fibonacci.f(0, new HashMap<>()));
        assertEquals(expectedElementAtPosition1, Fibonacci.f(1, new HashMap<>()));
        assertEquals(expectedElementAtPosition2, Fibonacci.f(2, new HashMap<>()));
        assertEquals(expectedElementAtPosition3, Fibonacci.f(3, new HashMap<>()));
        assertEquals(expectedElementAtPosition38, Fibonacci.f(38, new HashMap<>()));
        assertEquals(expectedElementAtPosition39, Fibonacci.f(39, new HashMap<>()));
        assertEquals(expectedElementAtPosition40, Fibonacci.f(40, new HashMap<>()));
        assertEquals(expectedElementAtPosition41, Fibonacci.f(41, new HashMap<>()));
        assertEquals(expectedElementAtPosition42, Fibonacci.f(42, new HashMap<>()));
        assertEquals(expectedElementAtPosition43, Fibonacci.f(43, new HashMap<>()));
    }

    @Test
    public void testFibonacciWithoutDynamicProgramming() {
        assertEquals(expectedElementAtPosition0, Fibonacci.f(0));
        assertEquals(expectedElementAtPosition1, Fibonacci.f(1));
        assertEquals(expectedElementAtPosition2, Fibonacci.f(2));
        assertEquals(expectedElementAtPosition3, Fibonacci.f(3));
        assertEquals(expectedElementAtPosition38, Fibonacci.f(38));
        assertEquals(expectedElementAtPosition39, Fibonacci.f(39));
        assertEquals(expectedElementAtPosition40, Fibonacci.f(40));
        assertEquals(expectedElementAtPosition41, Fibonacci.f(41));
        assertEquals(expectedElementAtPosition42, Fibonacci.f(42));
        assertEquals(expectedElementAtPosition43, Fibonacci.f(43));
    }
}
