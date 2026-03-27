package week2.day3.bankApp;

import week2.day3.bankApp.exceptions.InsufficientBalanceException;
import week2.day3.bankApp.exceptions.InvalidAccountName;
import week2.day3.bankApp.exceptions.InvalidAmountException;
import week2.day3.bankApp.exceptions.InvalidPinException;

import java.math.BigDecimal;
import java.util.UUID;

public class Account {
    private String pin;
    private BigDecimal balance = new BigDecimal(0);
    final UUID id;
    String accountName;

    public Account(String accountName, String pin) {
        validateAccountName(accountName);
        this.pin = pin;
        this.id = UUID.randomUUID();
        this.accountName = accountName;
    }

    public BigDecimal checkBalance(String pin) {
        validatePin(pin);
        return balance;
    }

    public void deposit(BigDecimal amount, String pin) {
        validate(amount);
        this.balance = balance.add(amount);
    }

    private void validate(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("Amount Value must be positive");
        }
    }

    public void withdraw(BigDecimal amount, String pin) {
        validatePin(pin);
        validateWithdraw(amount);
        this.balance = balance.subtract(amount);
    }

    public void validatePin(String pin){
        if(!this.pin.equals(pin)){
            throw new InvalidPinException("Invalid Pin");
        }
    }

    private void validateWithdraw(BigDecimal amount) {
        validate(amount);
        if (amount.compareTo(balance) > 0) {
            throw new InsufficientBalanceException("Insufficient funds");
        }
    }

    public void updatePin(String oldPin, String newPin) {
        validatePin(oldPin);
        this.pin = newPin;
    }

    public UUID getAccountNumber(){
        return this.id;
    }

    public void depositFromBank(BigDecimal amount){
        validate(amount);
        this.balance = balance.add(amount);
    }

    private static void validateAccountName(String accountName){
        if(accountName == null || accountName.isEmpty()) throw new InvalidAccountName("Invalid AccountName");
    }
}