package week4.day1.exceptions;

public class InvalidDivisor extends RuntimeException {
    public InvalidDivisor(String message) {
        super(message);
    }
}
