///ask user for the key and elements in the array 
import java.util.*;
public class problem1 {
public static void main (String[]args)

{
 //test method 
	//declarations
	int key;
	Scanner kb = new Scanner (System.in);
	
	//input
	System.out.print("Enter the key");
	key= kb.nextInt();
	
	System.out.print("How many elements do you want in the array?");
	int[] array = new int [ kb.nextInt()];
	
	//populate teh array 
	for (int i =0; i< array.length; i++) 
	{
		System.out.print("enter an integer: ");
		array[i] = kb.nextInt();
		
	}
	//call the method
	System.out.println(Arrays.toString(array));
	System.out.println(" The number of times "+ key+ " appears in the array: "+ countKeys(key, array ));
}
     public static int countKeys(int key, int[]a ) 
     {
	
    	 int numKeys=0;
    	 for (int i = 0; i< a.length; i++) 
    	 {
    		 if (a[i] == key)
    		 {
    			 numKeys++;
    			
    		 }
    		 
    	 }
    	 
    	 
    	 return numKeys;

     }
}
