package payrollsystem;

public class PayrollSystemTest {
    public static void main(String[] args) {
      
        SalariedEmployee salariedEmployee = new SalariedEmployee("Jade", "acevedo", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("savara", "khan", "222-22-2222", 20.00, 45.0);
        CommissionEmployee commissionEmployee = new CommissionEmployee("george ", " sylvester", "333-33-3333", 10000.00, 0.06);
        basePlusCommissionEmployee basePlusCommissionEmployee = new basePlusCommissionEmployee("mona", "lisa", "444-44-4444", 5000.00, 0.04, 300.00);

        
        basePlusCommissionEmployee.rewardBaseSalary();

        
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            System.out.printf("earned: %.2f%n%n", currentEmployee.earnings());
        }
    }
}
