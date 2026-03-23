package week2.day1;

import snacks.CreditCardValidator;

import java.util.Scanner;

public class DigitsToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Amount in digits");
        int amount = scanner.nextInt();

        DigitsToWords digitsToWords = new DigitsToWords();
        digitsToWords.digitsResult(amount);
    }

    public String digitsResult(int amount) {

    }
}
