package week2.day3.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week2.day3.bankApp.exceptions.ImpossibleAction;
import week2.day3.bankApp.exceptions.InsufficientBalanceException;
import week2.day3.bankApp.exceptions.InvalidAccountName;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private Bank bank;
    private String account1Name;
    private String account2Name;

    @BeforeEach
    public void setup() {
        String bankName = "Ericsson Bank";
        bank = new Bank(bankName);
        account1Name = "Ericsson Raphael";
        account2Name = "I AM";
    }

    @Test
    @DisplayName("Test new account is successfully created")
    public void newAccount_isInAccountListTest(){
        UUID id = bank.createAccount(account1Name, "1234");
        assertEquals(account1Name, bank.getAccountById(id).accountName);
    }

    @Test
    @DisplayName("Test empty string can't be provided as user name")
    public void emptyStringAsAccountName_throwsExceptionTest(){
        assertThrows(InvalidAccountName.class, ()-> bank.createAccount("", "1234"));
    }

    @Test
    @DisplayName("Account Balance for newly created account is 0")
    public void newAccount_accountBalanceIsZeroTest(){
        String pin = "1234";
        UUID id = bank.createAccount(account1Name, pin);
        assertEquals(BigDecimal.ZERO, bank.checkAccountBalance(id, pin));
    }

    @Test
    @DisplayName("Test money is deposited in to new account")
    public void newAccount_deposit5k_5kBalanceTest(){
        String pin = "1234";
        UUID id = bank.createAccount(account1Name, pin);
        assertEquals(BigDecimal.ZERO, bank.checkAccountBalance(id, pin));
        bank.deposit(id, BigDecimal.valueOf(5_000));
        assertEquals(BigDecimal.valueOf(5_000), bank.checkAccountBalance(id, pin));
    }

    @Test
    @DisplayName("Test money can't be sent to oneself")
    public void receiversIdIsSender_throwExceptionTest(){
        String pin = "1234";
        UUID id = bank.createAccount(account1Name, pin);
        bank.deposit(id, BigDecimal.valueOf(8_000));
        assertThrows(ImpossibleAction.class, () -> bank.transfer(id, id, BigDecimal.valueOf(6_000), pin));
    }


@Test
@DisplayName("Test transfer valid amount less than senders balance increases senders balance and reduces receivers balance")
public void newAccount_deposit10k_transfer5k_senderBalance5k_receiverBalanceIncreaseBy5kTest(){
    String pin = "1234";
    UUID id1 = bank.createAccount(account1Name, pin);
    UUID id2 = bank.createAccount(account2Name, pin);
    BigDecimal account2BalanceInitial = bank.checkAccountBalance(id2, pin);

    bank.deposit(id1, BigDecimal.valueOf(10_000));

    bank.transfer(id1, id2, BigDecimal.valueOf(5_000), pin);
    BigDecimal account2BalanceFinal = bank.checkAccountBalance(id2, pin);
    assertEquals(account2BalanceInitial.add(BigDecimal.valueOf(5_000)), account2BalanceFinal);
    assertEquals(BigDecimal.valueOf(5_000), bank.checkAccountBalance(id1, pin));
}

@Test
@DisplayName("Test transfer amount greater than senders balance throws Exception")
public void newAccount_deposit10k_transfer11k_throwExceptionTest(){
    String pin = "1234";
    UUID id1 = bank.createAccount(account1Name, pin);
    UUID id2 = bank.createAccount(account2Name, pin);

    bank.deposit(id1, BigDecimal.valueOf(10_000));
    bank.deposit(id2, BigDecimal.valueOf(5_000));

    assertThrows(InsufficientBalanceException.class, () -> bank.transfer(id1, id2, BigDecimal.valueOf(11_000), pin));
    BigDecimal account1Balance = bank.checkAccountBalance(id1, pin);
    BigDecimal account2Balance = bank.checkAccountBalance(id2, pin);

    assertEquals(BigDecimal.valueOf(10_000), account1Balance);
    assertEquals(BigDecimal.valueOf(5_000), account2Balance);
}
}
