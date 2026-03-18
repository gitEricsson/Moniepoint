import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

	int result = 0;
	int i = 0;

	if (secondNumber < 0 && firstNumber > 0)  {
		int positiveSecondNumber =  -secondNumber;
		while(i++ < positiveSecondNumber) result += -firstNumber;
	};

	if (secondNumber < 0 && firstNumber < 0)  {
	int positiveSecondNumber =  -secondNumber;
	int positiveFirstNumber =  -firstNumber;
	while(i++ < positiveSecondNumber) result += positiveFirstNumber;
	};

	while(i++ < secondNumber) result += firstNumber;

  
        if(firstNumber == 0 || secondNumber == 0)System.out.printf("%d multiplied by %d without a '*' operator is 0", firstNumber, secondNumber, result );
        if(firstNumber != 0 && secondNumber != 0)System.out.printf("%d multiplied by %d without a '*' operator is %d", firstNumber, secondNumber, result );

    }
}