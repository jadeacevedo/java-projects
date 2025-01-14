package payrollsystem;

public class CommissionEmployee extends Employee {
    private double grossSales; 
    private double commissionRate; 

  
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and <= 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    
    public double earnings() {
        return commissionRate * grossSales;
    }

    
    public String toString() {
        return String.format("commission employee: %s\ngross sales: %.2f; commission rate: %.2f",
                super.toString(), grossSales, commissionRate);
    }
}
