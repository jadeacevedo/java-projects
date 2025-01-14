package assignment5;

/*5.Create a Java program to encrypt a word using the Cesar cipher, one of the oldest ciphers known. 
To encrypt a word you substitute each letter by the letter which is 3 spaces down the alphabet. 
For example, a -> d, b ->e, …So the word CESAR would be encrypted as FHVDU.
 * */
import java.util.Scanner;
  public class CeasarCipher
{
    public static void main(String[]args)
   {   
    	Scanner scanner = new Scanner(System.in);
     //input 
        //prompt the user to enter a word
    	System.out.print("Enter a word to encrypt: ");
        String word = scanner.nextLine().toUpperCase();
        
        //encrypt the word using ceasar cipher
        //will be used to create method for encryption
        String encryptedWord = encrypt(word);
        //output 
        //display the encrypted word 
        System.out.println("encrypted word: " + encryptedWord);
        
        scanner.close();
    	
   }
    //create method using ceasar cipher 
  public static String encrypt (String word) 
  {
	    String encryptedWord = " ";
	  
	    for (int i=0; i< word.length(); i++) 
	    {
	    	char ch = word.charAt(i);
	    	
	    	//check if character is a letter
	    if (Character.isLetter(ch))
	    {
	       //apply ceasar cipher (shift 3 spaces down the alphabet)
	   //use char for the character entered and the number of letters in alphabet (26)
	   // use % to return the remainder 
	    	char encryptedChar = (char)((ch- 'A' +3) % 26 + 'A');
	    	 encryptedWord += encryptedChar;
	    	
	    }
	    
	      else
	       {
	    	   encryptedWord += ch;
	      	
	        }
	    }
	    
  return encryptedWord;
  }
}
