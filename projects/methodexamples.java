
public class methodexamples {
//METHOD = STATIC 
  //methods can be arranged in any way 
	//must have a main 
	  //methods are like stacking boxes,  cannot be inside each other but can be arranged in any way 
	     
	public static void main(String[]args) // this alone wouldn't return anything  // method one
{
	displaymessage(); //function call
	displaymessage(); //function call again
	//PROPER WAY TO DO IT
	methodexamples.displaymessage(); // method 1
	displaymessage("hi"); //method 2
	displaymessage(1); //method 3
	
}
    //define method using header and a body
	
	public static void displaymessage() // method definition  // method 1
{
	System.out.println("hello");
	
	
}
	public static void displaymessage(String s) // this method overloads the previous one //method 2
	{
		System.out.println(s);
		
	}
	public static void displaymessage(int n ) //method 3
{
		System.out.println("the value is " + n);
		
	}
}
