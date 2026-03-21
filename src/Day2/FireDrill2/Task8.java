package Day2.FireDrill2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfEvenNumbers = 0;

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();

        while(firstNumber <= 0 || firstNumber >= 100) firstNumber = input.nextInt();
	    sumOfEvenNumbers += firstNumber;


        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();
        while(secondNumber <= 0 || secondNumber >= 100) secondNumber = input.nextInt();
        sumOfEvenNumbers += secondNumber;

        System.out.print("Enter third integer: ");
        int thirdNumber = input.nextInt();
        while(thirdNumber <= 0 || thirdNumber >= 100) thirdNumber = input.nextInt();
        sumOfEvenNumbers += thirdNumber;

        System.out.print("Enter fourth integer: ");
        int fourthNumber = input.nextInt();
        while(fourthNumber <= 0 || fourthNumber >= 100) fourthNumber = input.nextInt();
        sumOfEvenNumbers += fourthNumber;

        System.out.print("Enter fifth integer: ");
        int fifthNumber = input.nextInt();
        while(fifthNumber <= 0 || fifthNumber >= 100) fifthNumber = input.nextInt();
        sumOfEvenNumbers += fifthNumber;

        System.out.print("Enter sixth integer: ");
        int sixthNumber = input.nextInt();
        while(sixthNumber <= 0 || sixthNumber >= 100) sixthNumber = input.nextInt();
        sumOfEvenNumbers += sixthNumber;

        System.out.print("Enter seventh integer: ");
        int seventhNumber = input.nextInt();
        while(seventhNumber <= 0 || seventhNumber >= 100) seventhNumber = input.nextInt();
        sumOfEvenNumbers += seventhNumber;

        System.out.print("Enter eighth integer: ");
        int eighthNumber = input.nextInt();
        while(eighthNumber <= 0 || eighthNumber >= 100) eighthNumber = input.nextInt();
        sumOfEvenNumbers += eighthNumber;

        System.out.print("Enter ninth integer: ");
        int ninthNumber = input.nextInt();
        while(ninthNumber <= 0 || ninthNumber >= 100) ninthNumber = input.nextInt();
        sumOfEvenNumbers += ninthNumber;

        System.out.print("Enter tenth integer: ");
        int tenthNumber = input.nextInt();
        while(tenthNumber <= 0 || tenthNumber >= 100) tenthNumber = input.nextInt();
        sumOfEvenNumbers += tenthNumber;

        System.out.printf("The Sum of the 10 integers between 0 and 100 is %d%n", sumOfEvenNumbers);
    }
}