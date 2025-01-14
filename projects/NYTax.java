package a3;
import java.util.Scanner;

public class NYTax {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Input
        System.out.print("Enter your income: ");
        double income = kb.nextDouble();

        // Calculate taxes due
        double taxesDue = calculateTaxes(income);

        // Output
        System.out.println("Based on your income of $" + income + ", taxes due to New York are: $" + taxesDue);
        
       
    }

    // Method to calculate taxes based on income
    public static double calculateTaxes(double income) {
        double taxRate;
        if (income < 20000) {
            taxRate = 0.02; // 2%
        } else if (income <= 50000) {
            taxRate = 0.03; // 3%
        } else {
            taxRate = 0.05; // 5%
        }
        return income * taxRate;
    }
}

