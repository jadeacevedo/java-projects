//Assigment 6 Question 1
package assignment_6;

import java.util.Scanner;
import java.util.Random;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber; 
        int guessCount = 0;

        System.out.println("Welcome to the Random Number Game!");
        System.out.printf("I have selected a random number between %d and %d.%n", minNumber, maxNumber);

        int userGuess;
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                System.out.println("Number of guesses: " + guessCount);
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}
