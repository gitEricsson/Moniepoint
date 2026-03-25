package week1.day1.java;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

        int firstNumberTripled = firstNumber * 3;
        int secondNumberDoubled = secondNumber * 2;

        if (firstNumberTripled % secondNumberDoubled == 0) System.out.println("Yes, it is a multiple");
        if (firstNumberTripled % secondNumberDoubled != 0) System.out.println("No, it is not a multiple");
    }
}