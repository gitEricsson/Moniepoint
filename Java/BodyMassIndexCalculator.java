import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's your weight in pounds: ");
        int weight = input.nextInt();
        System.out.print("What's your height in inches: ");
        int height = input.nextInt();

        int bmi = (weight * 703) / (height * height);

        System.out.printf("Your BMI is: %d%n", bmi);
        System.out.println("BMI Values:");
        System.out.println("Underweight: below 18.5");
        System.out.println("Normal:      18.5 - 24.9");
        System.out.println("Overweight:  25 - 29.9");
        System.out.println("Obese:       30 or above");
    }
}