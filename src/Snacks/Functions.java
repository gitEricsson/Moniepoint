package Snacks;

public class Functions {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        if (result < 0) return -result;
        return result;
    }

    public float divide(int dividend, int divisor) {
        if (divisor == 0) return 0;
        return (float) dividend / divisor;
    }

    public int factorOf(int number) {
        int count = 0;
        int absoluteNumber = (number < 0) ? -number : number;
        for (int i = 1; i <= absoluteNumber; i++) {
            if (absoluteNumber % i == 0) count++;
        }
        return count;
    }

    public boolean isSquare(int number) {
        if (number < 0) return false;
        for (int i = 0; i * i <= number; i++) {
            if (i * i == number) return true;
        }
        return false;
    }

    public boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public long factorialOf(int number) {
        if (number < 0) return 0;
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public long squareOf(int number) {
        return (long) number * number;
    }
}