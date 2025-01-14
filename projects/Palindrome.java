/*
 * 3.	A number is a palindrome if its reversal is the same as itself. Write a program that prompts the user to enter an integer and report
 *s whether the integer is a palindrome. T
he program should use the reverse and isPalindrome methods with the following headers:

//the method returns the reversal of an integer, i.e, reverse(456) should return 654
public static int reverse (int number)

//the method returns true if number is a palindrome
public static boolean  isPalindrome (int number)


 */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}