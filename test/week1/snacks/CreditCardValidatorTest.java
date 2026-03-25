package week1.snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week1.snacks.CreditCardValidator;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest {
    private CreditCardValidator creditCardValidator;

    @BeforeEach
    void setUp() {
        creditCardValidator = new CreditCardValidator();
    }

    @Test
    @DisplayName("Test credit card number starting with four is identified as Visa")
    void testCreditCardNumberStartingWithFourIsVisa() {
        String cardNumber = "4388576018410707";
        assertEquals("Visa Cards", creditCardValidator.getCreditCardType(cardNumber));
    }

    @Test
    @DisplayName("Test credit card number starting with five is identified as MasterCard")
    void testCreditCardNumberStartingWithFiveIsMasterCard() {
        String cardNumber = "5399831619690403";
        assertEquals("MasterCard", creditCardValidator.getCreditCardType(cardNumber));
    }

    @Test
    @DisplayName("Test credit card number starting with thirty seven is identified as American Express")
    void testCreditCardNumberStartingWithThirtySevenIsAmericanExpress() {
        String cardNumber = "378282246310005";
        assertEquals("American Express Cards", creditCardValidator.getCreditCardType(cardNumber));
    }

    @Test
    @DisplayName("Test credit card number starting with six is identified as Discover")
    void testCreditCardNumberStartingWithSixIsDiscover() {
        String cardNumber = "6011000000000004";
        assertEquals("Discover Cards", creditCardValidator.getCreditCardType(cardNumber));
    }

    @Test
    @DisplayName("Test unknown starting digits return invalid card type")
    void testUnknownStartingDigitsReturnInvalidCardType() {
        String cardNumber = "9999831619690403";
        assertEquals("Invalid Card Type", creditCardValidator.getCreditCardType(cardNumber));
    }

    @Test
    @DisplayName("Test valid Luhn check returns true for validity status")
    void testValidLuhnCheckReturnsTrue() {
        String cardNumber = "4388576018410707";
        assertTrue(creditCardValidator.isValid(cardNumber));
    }

    @Test
    @DisplayName("Test invalid Luhn check returns false for validity status")
    void testInvalidLuhnCheckReturnsFalse() {
        String cardNumber = "4388576018402626";
        assertFalse(creditCardValidator.isValid(cardNumber));
    }

    @Test
    @DisplayName("Test card number shorter than thirteen digits is invalid")
    void testCardNumberShorterThanThirteenDigitsIsInvalid() {
        String cardNumber = "123456789012";
        assertFalse(creditCardValidator.isValid(cardNumber));
    }

    @Test
    @DisplayName("Test card number longer than sixteen digits is invalid")
    void testCardNumberLongerThanSixteenDigitsIsInvalid() {
        String cardNumber = "12345678901234567";
        assertFalse(creditCardValidator.isValid(cardNumber));
    }

    @Test
    @DisplayName("Test getDigitSum returns single digit for doubled numbers")
    void testGetDigitSumReturnsSingleDigitForDoubledNumbers() {
        assertEquals(7, creditCardValidator.getDigitSum(16));
        assertEquals(1, creditCardValidator.getDigitSum(10));
        assertEquals(4, creditCardValidator.getDigitSum(4));
    }
}

