import java.util.Scanner;

public class LargestAndSmallestIntegers {
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

        int smallest = firstNumber;
        if (secondNumber < smallest) smallest = secondNumber;
        if (thirdNumber < smallest) smallest = thirdNumber;
        if (fourthNumber < smallest) smallest = fourthNumber;
        if (fifthNumber < smallest) smallest = fifthNumber;

        int largest = firstNumber;
        if (secondNumber > largest) largest = secondNumber;
        if (thirdNumber > largest) largest = thirdNumber;
        if (fourthNumber > largest) largest = fourthNumber;
        if (fifthNumber > largest) largest = fifthNumber;

        System.out.printf("Smallest: %d, Largest: %d%n", smallest, largest);
    }
}