package week2.day3.bankApp;

import org.junit.jupiter.api.DisplayName;
import week2.day3.bankApp.exceptions.InsufficientBalanceException;
import week2.day3.bankApp.exceptions.InvalidAmountException;
import week2.day3.bankApp.exceptions.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;
    private String pin;
    private BigDecimal deposit;

    @BeforeEach
    public void setUp() {
        pin = "1111";
        account = new Account("EricssonRaphael", pin);
        deposit = BigDecimal.valueOf(5_000);
    }
    @Test
    @DisplayName("Test newly created Account is Empty")
    public void newAccountBalance_isEmptyTest() {
        assertEquals(BigDecimal.ZERO, account.checkBalance(pin));
    }

    @Test
    @DisplayName("Test balance check on new account is updated on deposit")
    public void newAccountDeposit_balanceCheckTest() {
        account.deposit(deposit, pin);
        assertEquals(deposit, account.checkBalance(pin));
    }

    @Test
    @DisplayName("Test balance update on new account on double deposit update ")
    public void newAccountDoubleDeposit_balanceUpdateCheckOnTest() {
        assertEquals(BigDecimal.ZERO, account.checkBalance(pin));
        account.deposit(deposit, pin);
        account.deposit(deposit, pin);
        assertEquals(BigDecimal.valueOf(10_000), account.checkBalance(pin));
    }

    @Test
    @DisplayName("Test error handling on negative amount deposit")
    public void negativeAmountDeposit_throwsExceptionTest(){
        assertEquals(BigDecimal.ZERO, account.checkBalance(pin));
        assertThrows(InvalidAmountException.class, ()-> account.deposit(BigDecimal.valueOf(-1000), pin));
        assertEquals(BigDecimal.ZERO, account.checkBalance(pin));
    }

    @Test
    @DisplayName("Test accurate balance value on deposit and withdrawal")
    public void deposit5k_withdraw2k_balanceIs3kTest() {
        account.deposit(deposit, pin);
        assertEquals(deposit, account.checkBalance(pin));
        account.withdraw(BigDecimal.valueOf(2_000), pin);
        assertEquals(BigDecimal.valueOf(3_000), account.checkBalance(pin));
    }

    @Test
    @DisplayName("Test error handling for withdrawing with wrong pin")
    public void withdrawWithWrongPin_throwsExceptionTest(){
        account.deposit(deposit, pin);
        assertEquals(deposit, account.checkBalance(pin));
        assertThrows(InvalidPinException.class, ()-> account.withdraw(BigDecimal.valueOf(2_000), "Incorrect Pin"));
        assertEquals(deposit, account.checkBalance(pin));
    }

    @Test
    @DisplayName("Test withdrawing amount greater than balance throws error")
    public void deposit5k_withdraw10k_throwsExceptionTest() {
        account.deposit(deposit, pin);
        assertEquals(deposit, account.checkBalance(pin));
        assertThrows(InsufficientBalanceException.class, ()-> account.withdraw(BigDecimal.valueOf(10_000), pin));
        assertEquals(deposit, account.checkBalance(pin));
    }

    @Test
    @DisplayName("Test error handling for withdrawing negative amount")
    public void deposit5k_withdrawNegativeAmount_throwsExceptionTest() {
        account.deposit(deposit, pin);
        assertEquals(deposit, account.checkBalance(pin));
        assertThrows(InvalidAmountException.class, ()-> account.withdraw(BigDecimal.valueOf(-1_000), pin));
        assertEquals(deposit, account.checkBalance(pin));
    }

    @Test
    @DisplayName("Test pin updates")
    public void changePin_checkBalanceWithNewPin() {
        String newPin = "4321";
        account.updatePin(pin, newPin);
        assertEquals(BigDecimal.ZERO, account.checkBalance(newPin));
    }

    @Test
    @DisplayName("Test pin updates throws Exception when action is done with old pin")
    public void changePin_checkBalanceWithOldPin() {
        String newPin = "4321";
        account.updatePin(pin, newPin);

        assertThrows(InvalidPinException.class, ()-> account.checkBalance(pin));
        assertEquals(BigDecimal.ZERO, account.checkBalance(newPin));
    }


}