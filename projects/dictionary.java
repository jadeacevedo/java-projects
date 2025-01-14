package a3;

import java.util.Scanner;

public class dictionary {

	  public static void main(String[] args)
	  { 
		  //declarations 
		  String word; 
		  Scanner kb =new Scanner(System.in);
		  
		  //input
		  System.out.print("enter a word: ");
		  word = kb.nextLine();
		  
		  //processing and output
		  word.toLowerCase();
		  switch (word)    //int or char or string 
		  {
		  case "software":
			  System.out.println("software is ... \n");
			  break;
		  case "hardware":
			  System.out.println("hardware is... \n");
			  break;
		  case "jade":
			  System.out.println("Jade loves savara... \n");
			  break;
		  case "savara":
		       System.out.println("savara has adhd ... \n");
		       break;
			  
		  default:
			  System.out.println (word + " is not in the dictionary\n");
		      break;
		  }
				  
		  
	  }
}
