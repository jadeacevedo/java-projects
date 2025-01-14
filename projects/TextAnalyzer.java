package project;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class TextAnalyzer {

	public static void main(String[] args)throws IOException
	{
		//declarations 
		String filename, theText ; 
	    int numChar;
	    
	
		//( 1st task)ask user for the file name 
		 filename = getFilename();
				 
		//(2nd task) read the data from  file  
		 theText = getText(filename);
		 
		//(3rd task) count the number of characters in the file 
	     numChar= calcNumChar(theText);
	     System.out.println("The numeber of characters in the text: " + numChar);
	    //4th task, letter frequency 
	     analyzechar(theText);
	    //5th  task, count words 
	     
	    //6th task,
	     
	     
	     
	}
	
	
public static String getFilename()//task 1
{
	String files;
	Scanner kb = new Scanner(System.in);
	System.out.print("Enter the name of the file: ");
    files = kb.nextLine();
    
    
    
	return files;
}



public static String getText( String filename) throws IOException //task2

{ //declaration 
	String line= "", allText = ";";
	//open file
	 File myFile = new File(filename);
     Scanner inputFile = new Scanner(myFile);

	//read file
     while (inputFile.hasNext()) 
     {
         line  = inputFile.nextLine(); // reads a line from the file
         System.out.println(line); //for debugging
         allText = allText + " " + line;
         
     
     }
	//close file
	
     inputFile.close();
     return allText;
}



public static int calcNumChar( String text) //task  3 
{
	return text.length();
	
	
	
}



public static void analyzechar(String text) //task 4

{ 
	text = text.toLowerCase();
	char[] characters = new char [ 26];
	int[] rep = new int[26];
	
	char ch ='a';
	for ( int i =0; i< characters.length; i++) 
	{
		characters[i] = ch;
		ch++;
	}
	//System.out.println(Arrays.toString(characters));
	
	for (int i= 0; i<text.length(); i++) 
	{
		ch = text.charAt(i);
		if (ch >= 'a' && ch <= 'z') 
		{
			int index =ch -'a';
			rep[index]++;
			
		}
	}
	for (int i= 0; i< characters.length; i++) {
		System.out.println(characters[i]  + " repeats " + rep[i] + " times.");	
	}
		

	
}



}

