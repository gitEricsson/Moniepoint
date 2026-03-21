package Java;

import java.util.Scanner;

public class StatisticsForTheGreatPyramidOfGiza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Estimated stones used: ");
        long stones = input.nextLong();
        System.out.print("Average weight per stone (pounds): ");
        double averageWeight = input.nextDouble();
        System.out.print("Years to build: ");
        int years = input.nextInt();

        double totalWeight = stones * averageWeight;
        double weightPerYear = totalWeight / years;
        double weightPerHour = weightPerYear / (365 * 24);
        double weightPerMinute = weightPerHour / 60;

        System.out.printf("Weight of pyramid built per year: %.2f%n", weightPerYear);
        System.out.printf("Weight of pyramid built per hour: %.2f%n", weightPerHour);
        System.out.printf("Weight of pyramid built per minute: %.2f%n", weightPerMinute);
    }
}