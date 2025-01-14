
import java.util.Scanner;

public class BankServiceFees {
    public static void main(String[] args) {
        final double Base_Fee = 10.0; // Base fee per month
        final double Fee_Less_Than_20 = 0.10; // Fee per check for less than 20 checks
        final double Fee_20_TO_39 = 0.08; // for 20-39 checks
        final double Fee_40_TO_59 = 0.06; //for 40-59 checks
        final double Fee_60_OR_More = 0.04; //for 60 or more checks
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of checks written in month: ");
        int numChecks = scanner.nextInt();
        
        double totalFees = Base_Fee;
        
        if (numChecks < 20) {
            totalFees += numChecks * Fee_Less_Than_20;
        } else if (numChecks >= 20 && numChecks <= 39) {
            totalFees += numChecks * Fee_20_TO_39;
        } else if (numChecks >= 40 && numChecks <= 59) {
            totalFees += numChecks * Fee_40_TO_59;
        } else { 
            totalFees += numChecks * Fee_60_OR_More;
        }

        System.out.println("Bank's service fees for the month: $" + totalFees);

        scanner.close();
    }
}