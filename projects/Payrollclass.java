//Assignment # 10 Question 3

import java.util.Scanner;
public class Payroll {
	
	private String name;
    private String idNumber;
    private double hourlyPayRate;
    private double hoursWorked;
    
    public Payroll(String name,String idNumber ) {
    	this.name = name;
    	this.idNumber = idNumber;
    	
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
     
    public String getName(){
    	return name;
    }
    public String getIdNumber(){
    	return idNumber;
    }
    public double getHourlyPayRate(){
    	return hourlyPayRate;
    }
    public double getHoursWorked(){
    	return hoursWorked;
    }
    public double calculateGrossPay() {
        return hourlyPayRate * hoursWorked;
    }
    
    // DEMO
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the employee's ID number: ");
        String idNumber = scanner.nextLine();

        System.out.print("Enter the employee's hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();

        System.out.print("Enter the number of hours worked by the employee: ");
        double hoursWorked = scanner.nextDouble();


        Payroll employee = new Payroll(name, idNumber);
        employee.setHourlyPayRate(hourlyPayRate);
        employee.setHoursWorked(hoursWorked);

        System.out.println("Employee's Gross Pay is: $" + employee.calculateGrossPay());

        scanner.close();
    }
    
}
