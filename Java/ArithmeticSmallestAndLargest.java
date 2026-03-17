import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int numberSquared = number * number;

        if (number > 100) System.out.printf("Is %d > 100? %n", number);
        if (number == 100) System.out.printf("Is %d == 100? %n", number);
        if (number != 100) System.out.printf("Is %d != 100? %n", number);
        if (number < 100) System.out.printf("Is %d < 100? %n", number);

        if (numberSquared > 100) System.out.printf("Is %d > 100? %n", numberSquared);
        if (numberSquared == 100) System.out.printf("Is %d == 100? %n", numberSquared);
        if (numberSquared != 100) System.out.printf("Is %d != 100? %n", numberSquared);
        if (numberSquared < 100) System.out.printf("Is %d < 100? %n", numberSquared);
    }
}