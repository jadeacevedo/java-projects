package assignment8;
import java.util.*;
public class PrimeNumbersq4 
{
    public static void main( String[] args) 
    {
    	
	//declarations 
    int num;
    Scanner kb = new Scanner(System.in);
    
    	
    	//input
    	System.out.print("enter an integer:");
    	num = kb.nextInt();
    	
    	
    	    //processing and output
    	for (int i = 1; i <= num; i++) 
    	{
    		if ( isPrime(i)) 
    		{
    			System.out.println(i + " is prime");
    			
    		}
    	}
    		
}//method 1
    public static boolean isPrime(int num) 
    {
    	boolean prime = true;
    	
    	for (int j = 2; j < num; j++) 
    	{
    		if (num % j ==0) 
    		{
    			//num is not prime
    			prime = false;
    			
    		}
    		
    	}
    	 return prime;
    }
  
}
