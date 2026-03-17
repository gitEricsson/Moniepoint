import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

        int firstNumberSquared = firstNumber * firstNumber;
        int secondNumberSquared = secondNumber * secondNumber;
        int sumOfSquares = firstNumberSquared + secondNumberSquared;
        int differenceOfSquares = firstNumberSquared - secondNumberSquared;

        System.out.printf("The Square of %d is %d%n", firstNumber, firstNumberSquared);
        System.out.printf("The Square of %d is %d%n", secondNumber, secondNumberSquared);
        System.out.printf("The Sum of the Squares of %d and %d is %d%n", firstNumber, secondNumber, sumOfSquares);
        System.out.printf("The Difference of the Squares of %d and %d is %d%n", firstNumber, secondNumber, differenceOfSquares);
    }
}