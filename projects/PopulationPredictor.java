//Assigment 6 Question 6
package assignment_6;
import java.util.Scanner;

public class PopulationPredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input starting size of the population
        int startingPopulation;
        do {
            System.out.print("Enter the starting population size (must be greater than 2): ");
            startingPopulation = scanner.nextInt();
        } while (startingPopulation < 2);

        // Input average daily population growth rate
        double growthRate;
        do {
            System.out.print("Enter the average daily population growth rate as a percentage: ");
            growthRate = scanner.nextDouble();
        } while (growthRate < 0);

        // Input validation for number of days
        int numDays;
        do {
            System.out.print("Enter the number of days for population growth (must be greater than 1): ");
            numDays = scanner.nextInt();
        } while (numDays < 1);

        // Output: Predict population size for each day of growth
        System.out.println("\nDay\tPopulation");
        System.out.println("------------------");
        double population = startingPopulation;
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%d\t%.2f%n", day, population);
            population += population * (growthRate / 100.0);
        }

        scanner.close();
    }
}
