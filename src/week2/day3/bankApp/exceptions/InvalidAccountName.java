package week2.day3.bankApp.exceptions;

public class InvalidAccountName extends RuntimeException {
    public InvalidAccountName(String message) {
        super(message);
    }
}
