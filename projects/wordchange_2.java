package assignment5;

import java.util.*;

public class wordchange_2
{
 public static void main(String[] args)
 {
	 //DECLERATIONS 
	 String sentence, word, newWord, newSentence;
	 int n1;
	 Scanner kb= new Scanner(System.in);
	 
	 //INPUT
	 
	 System.out.print("enter a sentence: ");
	 sentence = kb.nextLine();
	 System.out.print("enter a word in the sentence: ");
	 word = kb.nextLine();
	 System.out.print("enter the new word: ");
	 newWord = kb.nextLine();
	 
	 // processing
	 
	 n1 = sentence.indexOf(word);
	 
	 
	 if (n1 >=0)
	 {
	   newSentence = sentence.substring(0, n1)+ newWord + sentence.substring(n1 + word.length());
	   System.out.println("the new sentence is:"+ newSentence);
	 }
	 else 
	 {
		 System.out.println("error: "+ word + "is not in the sentence ");
	 } 
			 
  }
 
}
