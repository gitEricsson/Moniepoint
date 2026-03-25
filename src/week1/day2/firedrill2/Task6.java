package week1.day2.firedrill2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfEvenNumbers = 0;
        int countOfEvenNumbers = 0; 

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        if(firstNumber % 2 == 0) {
            sumOfEvenNumbers += firstNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();
        if(secondNumber % 2 == 0) {
            sumOfEvenNumbers += secondNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter third integer: ");
        int thirdNumber = input.nextInt();
        if(thirdNumber % 2 == 0) {
            sumOfEvenNumbers += thirdNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter fourth integer: ");
        int fourthNumber = input.nextInt();
        if(fourthNumber % 2 == 0) {
            sumOfEvenNumbers += fourthNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter fifth integer: ");
        int fifthNumber = input.nextInt();
        if(fifthNumber % 2 == 0) {
            sumOfEvenNumbers += fifthNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter sixth integer: ");
        int sixthNumber = input.nextInt();
        if(sixthNumber % 2 == 0) {
            sumOfEvenNumbers += sixthNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter seventh integer: ");
        int seventhNumber = input.nextInt();
        if(seventhNumber % 2 == 0) {
            sumOfEvenNumbers += seventhNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter eighth integer: ");
        int eighthNumber = input.nextInt();
        if(eighthNumber % 2 == 0) {
            sumOfEvenNumbers += eighthNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter ninth integer: ");
        int ninthNumber = input.nextInt();
        if(ninthNumber % 2 == 0) {
            sumOfEvenNumbers += ninthNumber;
            countOfEvenNumbers++;
        }

        System.out.print("Enter tenth integer: ");
        int tenthNumber = input.nextInt();
        if(tenthNumber % 2 == 0) sumOfEvenNumbers += tenthNumber;

        int averageOfEvenNumbers = sumOfEvenNumbers / countOfEvenNumbers;

        System.out.printf("The Average of the Even numbers is %d%n", averageOfEvenNumbers);
    }
}