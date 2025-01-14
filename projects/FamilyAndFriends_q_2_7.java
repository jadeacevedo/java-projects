package assignment_7;
/*2)	Write a Java application that stores the names of your family and friends in a 
one-dimensional array of Strings. 
 * The program should show all names in upper case and lower case, identify the first character of the name, 
 * and the lengths of the names. 
 * */


public class FamilyAndFriends_q_2_7
{
	//create method,
	/*doesnt return value so void
	 * takes string 
	 * 
	 * */
	    public static void main(String[] args) 
	    {
	    	//create string array declaration 
	    	//declares an array type string
	        String[] names = {"juniper", "violet", "jade", "knyx", "Emma", "tee"};

//////////////////// Display names in upper case///////////////////////////////////////////////
	       
	        System.out.println("Names in upper case:");
	        for (String name : names) 
	        {
	            System.out.println(name.toUpperCase());
	        }

 /////////////////// Display names in lower case////////////////////
	        System.out.println("\nNames in lower case:");
	        
	        for (String name : names)
	        	//variable declarations inside the for loop
	        {
	            System.out.println(name.toLowerCase());
	        }
//////////// // Identify the first character of each name/////////////////////////
	        System.out.println("\nFirst characters of names:");
	        for (String name : names) 
	        {
	            char firstChar = name.charAt(0);
	            System.out.println(name + ": " + firstChar);
	        }
///////////////// Display lengths of names/////////////////////////////////////////
	        System.out.println("\nLengths of names:");
	        for (String name : names) {
	            System.out.println(name + ": " + name.length());
	        }
	    }
	}


