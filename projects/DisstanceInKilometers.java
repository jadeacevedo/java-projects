package assignment8;
/*3.	Write a Java program that asks the user to enter a distance in meters.
 The program will then present the following menu of selections:
a.	Convert to kilometers
b.	Convert to inches
c.	Convert to feet
d.	Quit the program

The program will convert the distance to kilometers (=meters*0.001), 
inches (=meters*39.37) or feet (=meters*3.281), depending on the user’s s
election. Each conversion should be handled by a separate method that takes the 
distance in meters as an argument.*/
import java.util.Scanner;
public class DisstanceInKilometers {

	public static void main(String[] args) 
	{ 
		    // Decelerations 
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double distanceInMeters = kb.nextDouble();

        boolean quit = false;

        while (!quit) //allows repetition and controlled termination 
        	//input 
        {
        	  System.out.println("\nSelect an option:");
		//a.	Convert to kilometers 
        	  System.out.println("a. Convert to kilometers");
		//b.	Convert to inches
        	  System.out.println("b. Convert to inches");
		//c.	Convert to feet
        	  System.out.println("c. Convert to feet");
		//d.	Quit the program
        	  System.out.println("d. Quit the program");
           //output 
              System.out.print("Enter your choice: ");
              char choice = Character.toLowerCase(kb.next().charAt(0));
           //processing 
              
              if (choice == 'a') {
                  displayResult("kilometers", convertToKilometers(distanceInMeters));
              } else if (choice == 'b') {
                  displayResult("inches", convertToInches(distanceInMeters));
              } else if (choice == 'c') {
                  displayResult("feet", convertToFeet(distanceInMeters));
              } else if (choice == 'd') {
                  System.out.println("Exiting the program...");
                  quit = true;
              } else {
                  System.out.println("Invalid option. Please enter a valid option (a, b, c, or d).");
              }
          }

          kb.close();

	} //method for each input and processing 
//
          public static double convertToKilometers(double distanceInMeters) //a
          {
              return distanceInMeters * 0.001;
          }

          public static double convertToInches(double distanceInMeters)//b
          {
              return distanceInMeters * 39.37;
          }

          public static double convertToFeet(double distanceInMeters) //c
          {
              return distanceInMeters * 3.281;
          }

          public static void displayResult(String unit, double convertedDistance) //
          {
              System.out.println("Distance in " + unit + ": " + convertedDistance);
          }
      }
/*
 * 
 * */
  
           
          
        