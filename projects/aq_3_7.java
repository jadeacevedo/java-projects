package assignment_7;
import java.util.*;
public class aq_3_7 {
	public static void main (String[] args)
	{
		//declarations
		int numStudents= 0 , numTests= 0 ;
		double total = 0, average= 0 ;
		
		Scanner kb= new Scanner(System.in);

		
		//input
		System.out.print("enter the numeber of studenst:");
		numStudents = kb.nextInt();
		System.out.print("enter the numebr of tests; ");
		numTests= kb.nextInt();
		
		double[][] scores = new double[numStudents][numTests];
		
		
		
		//processing and output 
		for (int row = 0; row < numStudents; row++) 
		{
			// outer loop
			System.out.print("enter the scores for student "+ row +": " );
			for (int col = 0; col< numTests; col++)
			{
				scores[row][col] = kb.nextDouble(); // inner loop
				
				
			}
		}
		//average scores  for each student (average for each row)
		for (int row = 0; row< numStudents; row++ ) 
		{
			total= 0;
			for (int col = 0; col < numTests; col++ )
			{
				total = total +scores[row][col];
				
			}
					average = total / numTests;
					System.out.println("the average of student "+ row +"is " + average);
					
		// average for the different tests (average for each column)
			for (int col = 0; col < numTests; col++ ) 
			{
				total = 0;
				
				for (int row1 = 0; row1 < numStudents; row1++)
				{
					total = total +scores[row1][col];
					
				}
						average = total / numStudents;
						System.out.println("the average of tests "+ col +"is " + average);
			}
					
					
		}
	}
	

}
