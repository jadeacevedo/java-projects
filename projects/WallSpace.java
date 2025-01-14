package assignment8;
/*	A painting company has determined that for every 115 square feet of wall space, one gallon of paint and eight hours of labor will be required. 
The company charges $18.00 per hour for labor. 
Write a Java program (from scratch) that allows the user to enter the wall space to be painted and the price of paint per gallon. 
The program should have methods that return the following data:
a.	The number of gallons of paint required
b.	The cost of the paint
c.	The hours of labor required
d.	The labor charges
e.	The total cost of the paint job

Then it should display the results on the screen.
 * */
import java.util.Scanner;

public class WallSpace {

	public static void main(String[] args) //declarations, inputs, and arguments
	{
		Scanner scanner = new Scanner(System.in);
	//a.	The number of gallons of paint required
	
        System.out.print("Enter the wall space to be painted (in square feet): ");
        double wallSpace = scanner.nextDouble();
        double gallonsOfPaint = calculateGallonsOfPaint(wallSpace);
        
        System.out.println("\nNumber of gallons of paint required: " + gallonsOfPaint);		
        
        
	//b.	The cost of the paint
		
        System.out.print("Enter the price of paint per gallon: $");
        double paintPricePerGallon = scanner.nextDouble();
        double paintCost = calculatePaintCost(gallonsOfPaint, paintPricePerGallon);
        System.out.println("Cost of the paint: $" + paintCost);
        
	//c.	The hours of labor required
        double hoursOfLabor = calculateHoursOfLabor(wallSpace);
        System.out.println("Hours of labor required: " + hoursOfLabor);
        
		
	//d.	The labor charges
        double laborCharges = calculateLaborCharges(hoursOfLabor);
        System.out.println("Labor charges: $" + laborCharges);
		
	//e.	The total cost of the paint job
        
        double totalCost = calculateTotalCost(paintCost, laborCharges);
        
        
        System.out.println("Total cost of the paint job: $" + totalCost);


        
        scanner.close();
	}
	
	
public static double calculateGallonsOfPaint( double wallSpace) //a.
   { 
	   return wallSpace / 115.0;
	  
   }

public static double calculatePaintCost( double gallonsOfPaint, double paintPricePerGallon) //b. 
{
    return gallonsOfPaint * paintPricePerGallon;

}
   
public static double calculateHoursOfLabor(double wallSpace) //c.
{
    return wallSpace / 115.0 * 8.0;
}

public static double calculateLaborCharges(double hoursOfLabor) //d. 
{
    return hoursOfLabor * 18.0;
}

public static double calculateTotalCost(double paintCost, double laborCharges)//e.  
{
    return paintCost + laborCharges;
}
}
