package week1.snacks;

import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify");
        String cardNumber = scanner.nextLine();

        CreditCardValidator validator = new CreditCardValidator();
        validator.displayCardInfo(cardNumber);
    }

    public String getCreditCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) return "Visa Cards";
        if (cardNumber.startsWith("5")) return "MasterCard";
        if (cardNumber.startsWith("37")) return "American Express Cards";
        if (cardNumber.startsWith("6")) return "Discover Cards";
        return "Invalid Card Type";
    }

    public boolean isValid(String cardNumber) {
        int length = cardNumber.length();
        if (length < 13) return false;
        if (length > 16) return false;

        int totalSum = sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber);
        return totalSum % 10 == 0;
    }

    public int sumOfDoubleEvenPlace(String cardNumber) {
        int sum = 0;
        for (int i = cardNumber.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            sum += getDigitSum(digit * 2);
        }
        return sum;
    }

    public int getDigitSum(int number) {
        if (number < 10) return number;
        return (number / 10) + (number % 10);
    }

    public int sumOfOddPlace(String cardNumber) {
        int sum = 0;
        for (int i = cardNumber.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(cardNumber.charAt(i));
        }
        return sum;
    }

    public void displayCardInfo(String cardNumber) {
        System.out.println("***************************************");
        System.out.println("**Credit Card Type: " + getCreditCardType(cardNumber));
        System.out.println("**Credit Card Number: " + cardNumber);
        System.out.println("**Credit Card Digit Length: " + cardNumber.length());
        System.out.println("**Credit Card Validity Status: " + (isValid(cardNumber) ? "Valid" : "Invalid"));
        System.out.println("***************************************");
    }
}