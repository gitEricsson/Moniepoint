import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfValidNumbers = 0;
        int validCount = 0;

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        if(firstNumber >= 0 && firstNumber <= 100) {
            sumOfValidNumbers += firstNumber;
            validCount++;
        }

        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();
        if(secondNumber >= 0 && secondNumber <= 100) {
            sumOfValidNumbers += secondNumber;
            validCount++;
        }

        System.out.print("Enter third integer: ");
        int thirdNumber = input.nextInt();
        if(thirdNumber >= 0 && thirdNumber <= 100) {
            sumOfValidNumbers += thirdNumber;
            validCount++;
        }

        System.out.print("Enter fourth integer: ");
        int fourthNumber = input.nextInt();
        if(fourthNumber >= 0 && fourthNumber <= 100) {
            sumOfValidNumbers += fourthNumber;
            validCount++;
        }

        System.out.print("Enter fifth integer: ");
        int fifthNumber = input.nextInt();
        if(fifthNumber >= 0 && fifthNumber <= 100) {
            sumOfValidNumbers += fifthNumber;
            validCount++;
        }

        System.out.print("Enter sixth integer: ");
        int sixthNumber = input.nextInt();
        if(sixthNumber >= 0 && sixthNumber <= 100) {
            sumOfValidNumbers += sixthNumber;
            validCount++;
        }

        System.out.print("Enter seventh integer: ");
        int seventhNumber = input.nextInt();
        if(seventhNumber >= 0 && seventhNumber <= 100) {
            sumOfValidNumbers += seventhNumber;
            validCount++;
        }

        System.out.print("Enter eighth integer: ");
        int eighthNumber = input.nextInt();
        if(eighthNumber >= 0 && eighthNumber <= 100) {
            sumOfValidNumbers += eighthNumber;
            validCount++;
        }

        System.out.print("Enter ninth integer: ");
        int ninthNumber = input.nextInt();
        if(ninthNumber >= 0 && ninthNumber <= 100) {
            sumOfValidNumbers += ninthNumber;
            validCount++;
        }

        System.out.print("Enter tenth integer: ");
        int tenthNumber = input.nextInt();
        if(tenthNumber >= 0 && tenthNumber <= 100) {
            sumOfValidNumbers += tenthNumber;
            validCount++;
        }

        int averageOfValidNumbers = sumOfValidNumbers / validCount;

        System.out.printf("The Average of the Valid numbers between 0 and 100 is %d%n", averageOfValidNumbers);
    }
}