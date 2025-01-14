
import java.util.Scanner;

public class HeartRateCalculator {
    public static void main(String[] args) {
        //declarations
        double calculateheartrate;
        
        Scanner scanner = new Scanner(System.in);

        // input= Ask for the age and resting heart rate
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your resting heart rate:");
        int restingHeartRate = scanner.nextInt();

        // Calculate the training heart rate
        double trainingHeartRate = calculateTrainingHeartRate(age, restingHeartRate);

        // Result
        System.out.println("Your training heart rate is: " + trainingHeartRate);

        scanner.close();
    }

    public static double calculateTrainingHeartRate(int age, int restingHeartRate) {
        double trainingHeartRate = 0.7 * (220 - age) + 0.3 * restingHeartRate;
        return trainingHeartRate;
    }
}