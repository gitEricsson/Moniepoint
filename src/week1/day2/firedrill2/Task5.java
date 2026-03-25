package week1.day2.firedrill2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfEvenNumbers = 0;

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        if(firstNumber % 2 == 0) sumOfEvenNumbers += firstNumber;

        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();
        if(secondNumber % 2 == 0) sumOfEvenNumbers += secondNumber;

        System.out.print("Enter third integer: ");
        int thirdNumber = input.nextInt();
        if(thirdNumber % 2 == 0) sumOfEvenNumbers += thirdNumber;

        System.out.print("Enter fourth integer: ");
        int fourthNumber = input.nextInt();
        if(fourthNumber % 2 == 0) sumOfEvenNumbers += fourthNumber;

        System.out.print("Enter fifth integer: ");
        int fifthNumber = input.nextInt();
        if(fifthNumber % 2 == 0) sumOfEvenNumbers += fifthNumber;

        System.out.print("Enter sixth integer: ");
        int sixthNumber = input.nextInt();
        if(sixthNumber % 2 == 0) sumOfEvenNumbers += sixthNumber;

        System.out.print("Enter seventh integer: ");
        int seventhNumber = input.nextInt();
        if(seventhNumber % 2 == 0) sumOfEvenNumbers += seventhNumber;

        System.out.print("Enter eighth integer: ");
        int eighthNumber = input.nextInt();
        if(eighthNumber % 2 == 0) sumOfEvenNumbers += eighthNumber;

        System.out.print("Enter ninth integer: ");
        int ninthNumber = input.nextInt();
        if(ninthNumber % 2 == 0) sumOfEvenNumbers += ninthNumber;

        System.out.print("Enter tenth integer: ");
        int tenthNumber = input.nextInt();
        if(tenthNumber % 2 == 0) sumOfEvenNumbers += tenthNumber;

        System.out.printf("The Sum of the Even numbers is %d%n", sumOfEvenNumbers);
    }
}