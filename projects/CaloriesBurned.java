
import java.util.Scanner;

public class CaloriesBurned {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.println("Enter the number of hours spent bicycling:");
        double hoursBicycling = scanner.nextDouble();

        System.out.println("Enter the number of hours spent jogging:");
        double hoursJogging = scanner.nextDouble();

        System.out.println("Enter the number of hours spent swimming:");
        double hoursSwimming = scanner.nextDouble();

        // Calculate total
        double totalCaloriesBurned = calculateCaloriesBurned(hoursBicycling, hoursJogging, hoursSwimming);
        double poundsLost = totalCaloriesBurned / 3500;

        // Result
        System.out.println("Total calories burned: " + totalCaloriesBurned
        );
        System.out.println("Total pounds lost: " + poundsLost);

        scanner.close();
    }

    public static double calculateCaloriesBurned(double hoursBicycling, double hoursJogging, double hoursSwimming) {
        double caloriesBicycling = 200 * hoursBicycling;
        double caloriesJogging = 475 * hoursJogging;
        double caloriesSwimming = 275 * hoursSwimming;

        double totalCaloriesBurned = caloriesBicycling + caloriesJogging + caloriesSwimming;
        return totalCaloriesBurned;
    }
}