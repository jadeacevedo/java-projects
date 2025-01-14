/*
 * ARRAY BASIC:
 * 1)ARRAY DECLERATION
 * 2)populate an array 
 * 3) how to print the array 
 * 4)basic processing 

*/
import java.util.*;
public class arraysbasics 
{
	
public static void main(String[]args) {
	Scanner kb = new Scanner( System.in);
	System.out.print("how many elements do you want in your array ?");
	int size = kb.nextInt();
	
	
	//array deceleration 
	int[] ar_int = new int [size];
	
	// populate the array 
	
	
	for( int i = 0; i < ar_int.length; i++)
	{
		System.out.print("enter an integer: ");
		ar_int[i] = kb.nextInt();
		
		//print the array
		//System.out.println(ar_int);
		System.out.println(Arrays.toString(ar_int));
	}
		
		//calculate the average 
		//processing 
		// *create a for loop*
		int total = 0;
		for(int i = 0; i < ar_int.length; i++);
		int i = 0;
		{
			total = total + ar_int[i];
		}
		double average =  total/ ar_int.length;
		
		//print the array 
		
		System.out.println(ar_int);
		System.out.println(Arrays.toString(ar_int));
	
		
		for(int i1 = 0; i1 < ar_int.length; i1++);
		{
			System.out.println(ar_int[i]);
		}
		 System.out.print("the average is:" + average);
		 
		 //shift to the right by one 
		 System.out.println("arrays before shifting:"+ Arrays.toString(ar_int));
		 int temp= ar_int[ar_int.length -1];
		 
		 for ( int i1 = ar_int.length-1; i1 >= 1; i1 --);
		 {
			 
			 ar_int[i]=ar_int[i-1];
		 }
		  
		ar_int[0] = temp ;
		 System.out.println("arrray aafter shifting:" + Arrays.toString(ar_int));
		 
		 
}
		
		
}
  
/*
 * primitive ::
 * {integer 
 *  double
 *  char
 *  boolean}
 *  integer a=1;
 *  
 *  reference::
 *  { string = s= hid 
 *  int[] ar = new int[3];
 *  }
 *  
 */
