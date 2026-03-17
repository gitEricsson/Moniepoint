import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 3 == 0) System.out.println("It is divisible by 3");
        if (number % 3 != 0) System.out.println("It isn't divisible by 3");
    }
}