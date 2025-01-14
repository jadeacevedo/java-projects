import java.util.Scanner;
//1. Create a Java program that asks the user to enter his/her first name and last name, in a single line and separated by a space. The program should output separately the first name and the last name. (Use the Scanner class.)
public class user_name1 {
    public static Scanner userInput;

    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.print("Enter your first and last name: ");
        String fullName = userInput.nextLine();
        System.out.println(formatName(fullName));
        userInput.close(); 
    }

    public static String formatName(String fullName) {
        // Extract first name and last name
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);

       
        System.out.println("Your input was: " + fullName);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);

       
        return lastName + ", " + firstName;
    }
}
