package assignment5;
//using while loop
import java.util.*;

public class gradeaverage_4 
{
 public static void main(String[] args) 
 {
	 //declarations
	 double grade = 0, total= 0 , average= 0;
	 int counter = 0;
	 
	 Scanner kb = new Scanner(System.in);
	 
	 //input and processing
	 
	 while(grade != -1)
	 {
		 System.out.print("enter a grade (-1 to stop):");
		 grade = kb.nextDouble();
		 if (grade != -1);
		 { 
			 total = total + grade;
			 counter++;
			 
		 }
	 }
	 average = total / counter;
	 
	 //output
	 System.out.println("the average is:"+ average);
	 
 }
}
