package Snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionsTest {
    private Functions functions;

    @BeforeEach
    public void setup(){
        functions = new Functions();
    }

    @Test
    @DisplayName("Test isEven Function Operation")
    public void testIsEvenFunction(){
        boolean trueResult = functions.isEven(2);
        assertTrue(result);

        boolean falseResult = functions.isEven(3);
        assertFalse(result);
    }

    @Test
    @DisplayName("Test isEven Input Validation")
    public void testIsEvenIntegerValidation(){
        assertThrows(IllegalArgumentException.class, () -> {functions.isEven(3.4);
        });
    }

    @Test
    @DisplayName("Test isPrimeNumber Function Operation")
    public void testIsPrimeNumberFunction() {
        assertTrue(functions.isPrimeNumber(7));
        assertFalse(functions.isPrimeNumber(4));
    }

    @Test
    @DisplayName("Test subtract Function Operation")
    public void testSubtractFunction() {
        assertEquals(4, functions.subtract(3, 7));
        assertEquals(4, functions.subtract(7, 3));
    }

    @Test
    @DisplayName("Test divide Function Operation")
    public void testDivideFunction() {
        assertEquals(2.5, functions.divide(5, 2));
        assertEquals(0, functions.divide(5, 0));
    }

    @Test
    @DisplayName("Test factorOf Function Operation")
    public void testFactorOfFunction() {
        assertEquals(4, functions.factorOf(10));
        assertEquals(2, functions.factorOf(7));
    }

    @Test
    @DisplayName("Test isSquare Function Operation")
    public void testIsSquareFunction() {
        assertTrue(functions.isSquare(25));
        assertFalse(functions.isSquare(26));
    }

    @Test
    @DisplayName("Test isPalindrome Function Operation")
    public void testIsPalindromeFunction() {
        assertTrue(functions.isPalindrome(54145));
        assertFalse(functions.isPalindrome(12345));
    }

    @Test
    @DisplayName("Test factorialOf Function Operation")
    public void testFactorialOfFunction() {
        assertEquals(120, functions.factorialOf(5));
        assertEquals(1, functions.factorialOf(0));
    }

    @Test
    @DisplayName("Test squareOf Function Operation")
    public void testSquareOfFunction() {
        assertEquals(25, functions.squareOf(5));
        assertEquals(100, functions.squareOf(-10));
    }
}
