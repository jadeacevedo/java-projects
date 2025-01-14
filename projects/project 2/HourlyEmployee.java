package payrollsystem;

public class HourlyEmployee extends Employee {
    private double wage; // hourly wage
    private double hours; // hours worked

    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        if (hours < 0.0 || hours > 168.0) { // There are only 168 hours in a week
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    // Earnings method
   
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    // toString method
 
    public String toString() {
        return String.format("hourly employee: %s\nhourly wage: %.2f; hours worked: %.2f", super.toString(), wage, hours);
    }
}
