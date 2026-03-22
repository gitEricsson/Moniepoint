package snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CheckoutAppTest {

    private CheckoutApp checkoutApp;

    @BeforeEach
    void setUp() {
        checkoutApp = new CheckoutApp();
    }

    @Test
    @DisplayName("Test subtotal calculation for multiple items is correct")
    void testSubtotalCalculationForMultipleItemsIsCorrect() {
        List<Integer> quantities = Arrays.asList(2, 2);
        List<Double> prices = Arrays.asList(2100.00, 550.00);
        assertEquals(5300.00, checkoutApp.calculateSubTotal(quantities, prices));
    }

    @Test
    @DisplayName("Test discount calculation based on percentage is correct")
    void testDiscountCalculationIsCorrect() {
        double subTotal = 5300.00;
        double discountPercentage = 8.0;
        assertEquals(424.00, checkoutApp.calculateDiscount(subTotal, discountPercentage));
    }

    @Test
    @DisplayName("Test value added tax calculation at seven point five percent is correct")
    void testValueAddedTaxCalculationIsCorrect() {
        double subTotal = 5300.00;
        assertEquals(397.50, checkoutApp.calculateValueAddedTax(subTotal));
    }

    @Test
    @DisplayName("Test total bill calculation summing subtotal and tax minus discount is correct")
    void testTotalBillCalculationIsCorrect() {
        double subTotal = 5300.00;
        double discount = 424.00;
        double tax = 397.50;
        assertEquals(5273.50, checkoutApp.calculateBillTotal(subTotal, discount, tax));
    }

    @Test
    @DisplayName("Test balance calculation based on amount paid is correct")
    void testBalanceCalculationIsCorrect() {
        double billTotal = 5273.50;
        double amountPaid = 6000.00;
        assertEquals(726.50, checkoutApp.calculateBalance(billTotal, amountPaid));
    }

    @Test
    @DisplayName("Test subtotal for empty lists returns zero")
    void testSubtotalForEmptyListsReturnsZero() {
        List<Integer> emptyQuantities = new ArrayList<>();
        List<Double> emptyPrices = new ArrayList<>();
        assertEquals(0.0, checkoutApp.calculateSubTotal(emptyQuantities, emptyPrices));
    }

    @Test
    @DisplayName("Test discount calculation with zero percent returns zero")
    void testDiscountCalculationWithZeroPercentReturnsZero() {
        assertEquals(0.0, checkoutApp.calculateDiscount(1000.0, 0.0));
    }
}