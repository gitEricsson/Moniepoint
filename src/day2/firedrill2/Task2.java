package day2.firedrill2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third integer: ");
        int thirdNumber = input.nextInt();
        System.out.print("Enter fourth integer: ");
        int fourthNumber = input.nextInt();
        System.out.print("Enter fifth integer: ");
        int fifthNumber = input.nextInt();
        System.out.print("Enter sixth integer: ");
        int sixthNumber = input.nextInt();
        System.out.print("Enter seventh integer: ");
        int seventhNumber = input.nextInt();
        System.out.print("Enter eighth integer: ");
        int eighthNumber = input.nextInt();
        System.out.print("Enter ninth integer: ");
        int ninthNumber = input.nextInt();
        System.out.print("Enter tenth integer: ");
        int tenthNumber = input.nextInt();

        int sumOfNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber + seventhNumber + eighthNumber + ninthNumber + tenthNumber;
        int averageOfNumbers = sumOfNumbers / 10;
    
        System.out.printf("The Average of the 10 integers is %d%n", averageOfNumbers);
    }
}