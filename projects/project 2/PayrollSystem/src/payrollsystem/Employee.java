package payrollsystem;

public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String SocialSecurityNumber;
	
   public Employee (String firstName, String lastName, String SocialSecurityNumber) 
   {
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.SocialSecurityNumber = SocialSecurityNumber;
	   
   }
   
   public abstract double earnings();
   
   public String toString() 
   {
	   return String.format("%s %s \nSocial Security Number: %s",
			   firstName, lastName, SocialSecurityNumber);
	   
   }
	
}
