package assignment_6;
import java.util.Scanner;

import java.util.Scanner;

public class PopulationCalculator {
    public static void main(String[] args) {
        // Declarations
        int initialPopulation = 8175133;
        int targetPopulation = 10000;
        int doublingTime = 40;
        int currentYear = 2010;

        // Process and output
        while (initialPopulation > targetPopulation) {
            initialPopulation /= 2; 
            currentYear += doublingTime;
        }

        System.out.printf("The population of New York City was about %d people in the year %d.%n", targetPopulation, currentYear);
    }
}

