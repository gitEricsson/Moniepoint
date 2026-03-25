package week1.day1.java;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third integer: ");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        int product = firstNumber * secondNumber * thirdNumber;

        int smallest = firstNumber;
        if (secondNumber < smallest) smallest = secondNumber;
        if (thirdNumber < smallest) smallest = thirdNumber;

        int largest = firstNumber;
        if (secondNumber > largest) largest = secondNumber;
        if (thirdNumber > largest) largest = thirdNumber;

        System.out.printf("Smallest: %d, Largest: %d%n", smallest, largest);
        System.out.printf("Sum: %d, Average: %d, Product: %d%n", sum, average, product);
    }
}