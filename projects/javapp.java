/**problem 1 
 * 
 */
package assignment8;


/** which is the first task?
 * capture/  ask user to enter values 
 * 2nd task? 
 * calculate average daily sales for week 
 * 3rd task? 
 * display total sales/ average sales
 */
import java.util.*;

public class javapp {

	/**
	 * assign variables //// step 1
	 */
	public static void main(String[] args)
	{
		// declarations 
		
		int numberDays = 7;
		double totalSales =0;
		double averageSales = 0;
	
		
		//task #1 :get total sales 
		totalSales = getTotalSales(numberDays); // 7=  number days per sales
		 
		
		//task #2 :calculate average 
		averageSales = getAverageSales(totalSales, numberDays);
		//needs total and number of days so create two arguments 
		
		
		
		//task #:3 display total & average 
        displayResults(numberDays, totalSales, averageSales);
	}
///////////create method for task 1///////// step2 
	public static double  getTotalSales (int days) 
	//we need to get something from user so create body-
	{
		//Declarations 
		double total=0.0,sales =0.0;
		Scanner kb = new Scanner(System.in);
		
		//input and processing 
		for (int i = 1; i<=days; i++) {
			System.out.print("enter daily sales:");
			sales = kb.nextDouble();
			total += sales;
		}
		
		//output
		
		return total;
		
		
	}
/////////create method for task 2/////// step 3
	//use double since double = total sales and average sales 
    public static double getAverageSales( double s, int d) 

{
	return(s / d );
	
}
///////// create method for task 3//////////step 4
 //use void because you're only displaying results 
     public static void  displayResults(int d , double s, double a)
 {
	 System.out.println("the  numeber of days is" + d);
	 System.out.println("the  numeber of sales is" + s);
	 System.out.println("the  numeber of average is" + a);
	 
 }
 
}
