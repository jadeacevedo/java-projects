package payrollsystem;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String SocialSecurityNumber, double weeklySalary) 
	{
		super(firstName, lastName, SocialSecurityNumber);
		if( weeklySalary <0.0) {
			throw new IllegalArgumentException("Weekly salart must be greater than or equal to 0.0!!");
		}
		this.weeklySalary =weeklySalary;
	}
	public double earnings() {
		return weeklySalary;
		
	}
	public String toString()
	{
		return String.format("salaried employee: %s\nweekly salary: %.2f", super.toString(), weeklySalary);
	}
	
}


