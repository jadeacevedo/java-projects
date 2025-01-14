//Assigment 6 Question 3
package assignment_6;

import java.util.Scanner;

public class CancerTherapy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter the initial amount of Cobalt 60 (grams): ");
        double initialAmount = scanner.nextDouble();
        
        System.out.print("Enter the decay rate per year: ");
        double decayRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        
        // Applying the decay formula
        double remainingAmount = initialAmount;
        for (int i = 0; i < years; i++) {
            remainingAmount -= remainingAmount * decayRate; 
        }

        // Output
        System.out.printf("After %d years, the amount of Cobalt 60 remaining is %.2f grams.%n", years, remainingAmount);
        
        scanner.close();
    }
}
