//Assigment 6 Question 4
package assignment_6;

import java.util.Scanner;

public class IdealWeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for gender, height, and weight
        System.out.print("Enter your gender (M/m or F/f): ");
        String genderInput = scanner.next().toLowerCase(); // Convert input to lowercase for case insensitivity
        char gender = genderInput.charAt(0); // Extract the first character for comparison

        System.out.print("Enter your height in inches: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        // Calculate ideal weight based on gender
        double idealWeight;
        if (gender == 'm') { // Calculate weight for male
            idealWeight = height * 4 - 128;
        } else if (gender == 'f') { // Calculate weight for female
            idealWeight = height * 3.5 - 108;
        } else {
            System.out.println("Invalid gender input.");
            scanner.close();
            return;
        }

        // Check if the person is underweight, overweight, or has the ideal weight
        if (weight < idealWeight) {
            System.out.println("You are underweight.");
        } else if (weight > idealWeight) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You have the ideal weight.");
        }

        scanner.close();
    }
}
