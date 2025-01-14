package payrollsystem;

public class basePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    // Constructor
    public basePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                       double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // Set and reward base salary
    public void rewardBaseSalary() {
        baseSalary += baseSalary * 0.10; // Add 10% to base salary
    }

    // Earnings method
    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    // toString method
    @Override
    public String toString() {
        return String.format("base-salaried commission employee: %s\nbase salary: %.2f",
                super.toString(), baseSalary);
    }
}
