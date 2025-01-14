package assignment5;
//question 1
/*	The US Constitution establishes that only a natural born citizen who is at least thirty-five years of age is eligible 
to be President of the US (Article 2/section 1). 
Create a Java program to help a user determine if s/he is eligible to be President. 
(Use Dialog boxes for input/output). 
 * */
/*TO DO 
 * To use dialog box for input/ option import joptionpane
 * use parse method to convert string to integer Integer.parseInt();
 * use if else methods to see if user meets eligibility based on input. (atleast 35 and natural born citizen)
 * */
import javax.swing.JOptionPane;

public class USCitizen
{
public static void main (String[] args) 
{  String ageInput = JOptionPane.showInputDialog(null, "Enter your age:");

// Parse age string to integer
int age = Integer.parseInt(ageInput);

// Check if the user's age meets the eligibility criteria
if (age >= 35) {
    // Get user's citizenship status using input dialog
    int response = JOptionPane.showConfirmDialog(null, "Are you a natural born citizen of the US?");
    
    // Check if the user is a natural born citizen
    if (response == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Congratulations! You are eligible to be President of the US.");
    } else {
        JOptionPane.showMessageDialog(null, "Sorry, you are not eligible to be President of the US.");
    }
} else {
    JOptionPane.showMessageDialog(null, "Sorry, you are not eligible to be President of the US.");
}
}

}

