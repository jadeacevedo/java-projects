import javax.swing.JOptionPane;
public class PayrollDialogBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   	//declarations 
    	String name;
    	int hours;
    	double payRate, grossPay;
    	
    	//input
    	//python: name = input("Enter your name: ")
    	name = JOptionPane.showInputDialog("enter the name: ");
    	
    	
    	// python : hours = it (input ("enter the hours: ")) 
    	hours = Integer.parseInt(JOptionPane.showInputDialog( "enter the hours: "));
    	
    	
    	//python; payRate  = float(input("enter your pay rate: "))
    	payRate= Double.parseDouble(JOptionPane.showInputDialog( "enter your pay rate : "));
    	
    	
    	
    	//processing
    	
    	grossPay = hours * payRate;
    	
    	//output
    		JOptionPane.showMessageDialog(null, "Hello " + name + "\n" + 
    	                                   "your gross pay is $" + grossPay);	
 
		
		
		
	}

}
