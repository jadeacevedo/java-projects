package assignment5;
/*Create a Java program that asks a teacher how many (numeric) 
 * grades s/he is going to enter in the system.
The program will then prompt the teacher to enter all grades and then calculate the grade average for the class. 
*/
/*1. IMPORT SCANNER- user will be entering a value 
 * */
import java.util.Scanner;
public class ClassGrades 
{
	public static void main (String[]args) 
	{   Scanner kb =new Scanner(System.in);
	
		System.out.print("enter the number of grades ");
		int numGrades = kb.nextInt();
		
		int [] grades = new int[numGrades];
		 
	 //enter grades and process 
		for (int i = 0; i < numGrades; i++)
		{
			//ask user for grades and store value 
			System.out.print("Enter grade "+ (i + 1) +": " );
			kb.nextLine();
			grades[i] = kb.nextInt();
			
		}
		//calculate average 
		double sum = 0;
				for (int grade : grades) 
				{
					sum += grade;
					
				}
	    double average = sum / numGrades;

	    System.out.print("average grade: " + average);
	}
	 
	
	
	
}
