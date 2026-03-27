package week2.day3.bankApp.exceptions;

public class ImpossibleAction extends RuntimeException {
    public ImpossibleAction(String message) {
        super(message);
    }
}
