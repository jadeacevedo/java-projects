package assignment_7;

import java.util.*;
import java.io.*;
/*to read file, use the file scanner class 
* 
* */ 

public class salesreports
{

  public static void main(String[] args) throws IOException //<<<<<<<<<<
	{
		//  declaration 
		String filename;
		double sales = 0, total = 0, average = 0;
		Scanner kb = new Scanner(System.in);

		
		ArrayList<Double> list = new ArrayList<Double>();
		
		//get name of file 
		System.out.print("enter the name of file: ");
		filename= kb.nextLine();
		
		//open the file
		File myFile= new File(filename);
		Scanner inputFile = new Scanner(myFile);
		
		//read data from file
		while (inputFile.hasNext())
		{
			sales = inputFile.nextDouble(); // reads a number from the file
			list.add(sales);
			
		}
		//close the file
		inputFile.close();
		
		//process the data
		int numDays = list.size();
		for (int i = 0; i < list.size(); i++) 
		{
			total = total + list.get(i);
			
		}
		 average= total / list.size();
	 
	
	    //output
       System.out.println("numeber of days " + list.size());
       System.out.println("numeber of sales  " + total);
       System.out.println("average  " + average);
	kb.close();
	
	}
} 