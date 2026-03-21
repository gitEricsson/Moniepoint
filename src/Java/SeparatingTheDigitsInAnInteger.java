package Java;

import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5-digit integer: ");
        int number = input.nextInt();

        int firstDigit = number / 10000;
        int secondDigit = (number / 1000) % 10;
        int thirdDigit = (number / 100) % 10;
        int fourthDigit = (number / 10) % 10;
        int fifthDigit = number % 10;

        System.out.printf("%d   %d   %d   %d   %d%n", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
    }
}