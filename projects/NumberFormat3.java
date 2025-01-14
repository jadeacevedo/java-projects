
public class NumberFormat3 {


	    public static void main(String[] args) {
	        double number = 123456789.1234567890;

	        System.out.println("The number without formatting is: " + number);
	        System.out.printf("the first formatted number is  (1 decimal place): %,.1f%n", number);        
	        System.out.printf("the second formatted number is (2 decimal places): %,.2f%n", number);       
	        System.out.printf("the third formatted number is (3 decimal places): %,.3f%n", number);
	        System.out.printf("the fourth formatted number is(4 decimal places): %,.4f%n", number);        
	        System.out.printf("the fifth formatted number is (5 decimal places): %,.5f%n", number);       
	        System.out.printf("the sixth formatted number is (6 decimal places): %,.6f%n", number);
	    }     
	}


