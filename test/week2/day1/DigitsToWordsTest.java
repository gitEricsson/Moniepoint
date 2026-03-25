package week2.day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DigitsToWordsTest {
    private DigitsToWords digitsToWords;

    @BeforeEach
    void setUp() {
        digitsToWords = new DigitsToWords();
    }

    @Test
    @DisplayName("Test Correct Words return for Digits")
    void testCorrectWordsReturnForDigits() {
        int amount = 99;
        assertEquals("ninety nine", digitsToWords.digitsResult(amount));
    }
}
