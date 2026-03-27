package week2.day3.bankApp;

import week2.day3.bankApp.exceptions.AccountNotFoundException;
import week2.day3.bankApp.exceptions.ImpossibleAction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {
    String bankName;
    List<Account> accountList;

    public Bank(String bankName) {
        this.bankName = bankName;
        accountList = new ArrayList<>();
    }

    public UUID createAccount(String accountName, String pin) {
        Account newAccount = new Account(accountName, pin);
        accountList.add(newAccount);
        return newAccount.getAccountNumber();
    }

    public Account getAccountById(UUID accountNumber) throws AccountNotFoundException {
        for (Account account : accountList)  {if (account.id.equals(accountNumber))  return account;}
        throw new AccountNotFoundException("Account does not exist");
    }

    public BigDecimal checkAccountBalance(UUID accountNumber, String pin) {
        Account account = getAccountById(accountNumber);
        return account.checkBalance(pin);
    }

    public void deposit (UUID accountNumber, BigDecimal amount) {
        Account account = getAccountById(accountNumber);
        account.depositFromBank(amount);
    }

    public void transfer(UUID senderAccountNumber, UUID receiverAccountNumber, BigDecimal amount, String pin) {
        validateTransferAccountNumbers(senderAccountNumber, receiverAccountNumber);

        Account senderAccount = getAccountById(senderAccountNumber);
        Account receiverAccount = getAccountById(receiverAccountNumber);

        senderAccount.withdraw(amount, pin);
        receiverAccount.depositFromBank(amount);

    }

    private static void validateTransferAccountNumbers(UUID senderAccountNumber, UUID receiverAccountNumber){
        if (senderAccountNumber.equals(receiverAccountNumber)) throw new ImpossibleAction("Money can't be transferred to oneself");
    }
}
