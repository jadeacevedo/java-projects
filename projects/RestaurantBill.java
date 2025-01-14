import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        //declarations
        double appetizerPrice;
        double mainCoursePrice;
        double dessertPrice;
        
        Scanner scanner = new Scanner(System.in);
        
        //input
        System.out.print("Enter price of appetizer: $");
        double AppetizerPrice = scanner.nextDouble();

        System.out.print("Enter price of main course: $");
        double MainCoursePrice = scanner.nextDouble();

        System.out.print("Enter price of dessert: $");
        double DessertPrice = scanner.nextDouble();

        // Calculate subtotal
        double subtotal = AppetizerPrice + MainCoursePrice + DessertPrice;

        // Calculate tax (6.75%)
        double taxRate = 0.0675;
        double taxAmount = subtotal * taxRate;

        // Calculate total after tax
        double totalAfterTax = subtotal + taxAmount;

        // Calculate tip (15% of total after tax)
        double tipRate = 0.15;
        double tipAmount = totalAfterTax * tipRate;

        // Calculate total bill
        double totalBill = totalAfterTax + tipAmount;

        // Display results
        System.out.println("Meal Total: $" + subtotal);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Tip Amount: $" + tipAmount);
        System.out.println("Total Bill: $" + totalBill);
    }
}    


        