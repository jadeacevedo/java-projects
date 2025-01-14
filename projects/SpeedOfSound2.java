import java.util.Scanner;
public class SpeedOfSound2 {
//air: 1100 feet/seconds 
//water: 4900 feet/seconds 
//steel: 16,400 feet/seconds 
	//output the speed of sound in said medium.
	   public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        //Taking input from user
	        System.out.println("Select a medium below,");
	        System.out.println("A / a - Air") ;
	        System.out.println("W / w - Water");
	        System.out.println("S / s - Steel");
	        System.out.println("Enter your choice using corresponding letter: ");
	        
	        char option = Character.toLowerCase(sc.next().charAt(0)); // Convert to lowercase for uniformity

	        double speed = 0;

	        // Switch case starts here
	        // Speed value is decided based on user input
	        switch (option) {
	            case 'a':
	                speed = 1100.0; // speed of air sound
	                System.out.print("the speed of air is: " + speed+ " Feet/ sec");
	                break;
	            case 'w':
	                speed = 4900.0; // speed of water sound
	                System.out.print("the speed of water is: " + speed + " Feet/ sec");
	                break;
	            case 's':
	                speed = 16400.0; // speed in steel
	                System.out.print("the speed of steel is: " + speed+ " Feet/ sec");
	                break;
	            default:
	                System.out.println("INVALID RESPONSE, TRY AGAIN.");
	                System.exit(0);
	        }
            
	       


	    }
}

