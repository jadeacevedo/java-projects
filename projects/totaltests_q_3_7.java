package assignment_7;
import java.util.*;
public class totaltests_q_3_7 {
	public static void main (String[] args)
	{
		//declarations
		int numStudents = 0 , numTests= 0 ;
		double total = 0, average= 0 ;
		
		Scanner kb= new Scanner(System.in);

		
		//input
		System.out.print("enter the number of studenst: ");
		numStudents = kb.nextInt();
		System.out.print("enter the number of tests: ");
		numTests = kb.nextInt();
		
		double[][] scores = new double[numStudents][numTests];
		
		
		
		  // Processing and Output
		
        
        for (int row = 0; row < numStudents; row++) 
        	
        { System.out.print("Enter the scores for student " + row + ": ");
            for (int col = 0; col < numTests; col++) 
            {
                scores[row][col] = kb.nextDouble(); // innner loop 
            }
            System.out.print("Enter the scores for student " + row + ": ");
        }
		//average scores  for each student (average for each row)
		for (int row = 0; row < numStudents; row++) 
		{
            total = 0;
            for (int col = 0; col < numTests; col++) 
            {
                total += scores[row][col];
            }
            average = total / numTests;
            System.out.println("The average of student " + row + " is " + average);
        }

        // Average for the different tests (average for each column)
        for (int col = 0; col < numTests; col++) 
        {
            total = 0;
            
            for (int row = 0; row < numStudents; row++) 
            {
                total += scores[row][col];
            }
            average = total / numStudents;
            System.out.println("The average of test " + col + " is " + average);
        }
    }
}

