package assignment_6;
//since we asking user to enter, use java.util

import java.util.*;
public class rainfall_5 {

	public static void main(String[] args) {
		
		//Decelerations
		//variables- average, rain, years, 
		int years;
		double rain, total= 0, average = 0;
		Scanner kb = new Scanner(System.in);
		
		//input
		System.out.print("how many years of rainfall average? ");
		years= kb.nextInt();
		
		//processing 
		for (int i =1; i<= years; i ++ ) // outer loop; iterates the years 
			{
			for (int j =1; j<= 12; j ++ ) //inner loop ; iterates through the month for each year 
				
			{//////input validation ///////
				do 
				{
					System.out.print("enter rainfall for the year" + i + " the month"+ j + ": ");
					
					rain = kb.nextDouble();
					if (rain< 0) {
						System.out.print("ERROR: RAINFALL MUST BE A POSITIVE NUMBER" );
						
					}
					
				} while (rain <0 );
			///////////////////////////////
				total = total +rain;
				
			}
			average = total/ 12;
			
			System.out.println("the average rainfall for year "+ i + "is: "+ average );
			
			
			
			}

	}

}
