package week4.day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week4.day1.exceptions.InvalidDivisor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionTest {
@Test
@DisplayName("Test the positive divisor divides the positive dividend and returns a positive integer value")
public void testPositiveDivision() {
    int dividend = 4;
    int divisor = 3;

    assertEquals(1, Division.divide(dividend, divisor));
}

@Test
@DisplayName("Test the positive divisor divides the negative dividend and returns a negative integer value")
public void testDivision() {
    int dividend = -4;
    int divisor = 3;

    assertEquals(-1, Division.divide(dividend, divisor));
}

@Test
@DisplayName("Test error is thrown when negative divisor divides the dividend")
public void testDivisionThrows() {
    int dividend = 4;
    int divisor = -3;

    assertThrows(InvalidDivisor.class, ()-> Division.divide(dividend, divisor));
}
}
