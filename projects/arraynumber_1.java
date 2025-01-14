package assignment_7;

import java.util.*;

public class arraynumber_1 {

	public static void main(String[] args) 
	{
		//declarations
		int numValues;
		
		double total = 0, average = 0, lowest= 0, highest = 0;
		
		Scanner kb = new Scanner(System.in);
		
				
		
		//input
		System.out.print("how many numbers do  you want to store in the array? ");
		numValues = kb.nextInt();
		// how do i create the array of doubles?, [] means array 
		
		 
		double[] numbers = new double[numValues];
		
		
		//processing
		//populate the array to get total: use a for loop,
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print("enter a number: ");
			numbers[i] = kb.nextDouble();
			total = total + numbers [i];
			
		}
		 average = total/ numbers.length;
		 
		//get the highest number, how?
		 /* how do we tell the computer to figure out the highest number? 
		  * find the highest compared to the lowest
		  * 
		  * */
		highest = numbers[0];
		for (int i = 0; i< numbers.length; i++)
		{
			if (numbers[i]>highest)
			{
				highest = numbers[i];
				
			}
		}
		//lowest
		lowest = numbers[0];
		for (int i = 0; i< numbers.length; i++)
		{
			if (numbers[i] < lowest)
			{
				lowest = numbers[i];
				
			}
		}
		
		//output
		System.out.println("the total is " + total);
		System.out.println("the averag eis " + average);
		System.out.println("the highest is " + highest);
		System.out.println("the lowest is "+ lowest);
		
		
	}

}
