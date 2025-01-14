package a3;

import java.util.*;
 
public class StringManipulation
{
	
	public static void main (String[] args ) {
	//declarations
		String city;             //input
		int num;                //output 
		String lcity, ucity;   //output
		char fchar, lchar;    //output 
		
		Scanner kb = new Scanner (System.in);
	
		
    //inputs 
		System.out.print("enter your name: " );
		city = kb.nextLine();
		
		
    //processing 
		num = city.length();
		ucity = city.toUpperCase();
	    lcity = city.toLowerCase();
		fchar = city.charAt(0);
		lchar = city.charAt(num -1);
		//lchar= city.charat(city.lenght - 1
		
	
	//output 
		System.out.println("number of characaters: " + num);
		System.out.println("city in upper case: " + ucity);
		System.out.println("city in lowwer case: "+ lcity);
		System.out.println("first character:"+ fchar);
		System.out.println("last character:" + lchar);
		
	}
	
	

}
