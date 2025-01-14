/*QUESTION 
/*1.
 * Write a method that takes two arguments: an integer number (the key) and a
 *  1D array of integers. 
 *  The method should return the number of times that the key is repeated in the array. 
 *  Write also a test program (the main method) that prompts the user to enter the key number and 
 *  the one-dimensional array, calls the method, and displays the number of times that the key
 *  number appears  in the array.
 * 
 * EXAMPLES OF PASSING AND RETURNING ARRAYS TO/FROM METHODS 
 * */
import java.util.*;
public class PassignAndReturningArrays {

	public static void main(String[] args) 
	{
		double [] a = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(a));
		
		System.out.println(myArraytoString(a));
		
		double scale = 2.0;
		double [] b = rescale(a, scale);
		System.out.println(myArraytoString(b));
	}
	
	
	public static double []rescale (double []a, double b)
	{
		double []output = new double [a.length];
		for (int i = 0; i < a.length; i++) 
		{
			output[i] = a[i] * b;
			
		}
		return output;
	}
	
	
	public static String myArraytoString(double[] a) 
	{
	   String output = "[";
	   for (int i = 0; i < a.length-1; i++) 
	   {
		   output = output + a[i] + " ,";
		   
	   }
	   if(a.length !=0) 
	   {
		   output = output + a[a.length -1] + "]";
				   output = output;
	   }
	   return output; 
	   }
	}

