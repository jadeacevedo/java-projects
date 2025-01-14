package a3;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a year: ");
        int year = kb.nextInt();

        // Check if it's a leap year
        boolean isLeapYear = checkLeapYear(year);

        // Output
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to check if it's a leap year
    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
