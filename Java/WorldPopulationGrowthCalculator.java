import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        long population = input.nextLong();
        System.out.print("Enter the annual growth rate (e.g. 0.01 for 1%): ");
        double growthRate = input.nextDouble();

        System.out.printf("After the first year: %.0f%n", population * (1 + growthRate));
        System.out.printf("After the second year: %.0f%n", population * Math.pow(1 + growthRate, 2));
        System.out.printf("After the third year: %.0f%n", population * Math.pow(1 + growthRate, 3));
        System.out.printf("After the fourth year: %.0f%n", population * Math.pow(1 + growthRate, 4));
        System.out.printf("After the fifth year: %.0f%n", population * Math.pow(1 + growthRate, 5));
    }
}