
import java.util.Scanner;

 public class MenuItems5 {

	public class CaloriesInMenuItem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the name of a menu item:");
	        String itemName = scanner.nextLine();

	        System.out.println("Enter the number of grams of fat:");
	        double fat = scanner.nextDouble();

	        System.out.println("Enter the number of grams of protein:");
	        double protein = scanner.nextDouble();

	        System.out.println("Enter the number of grams of carbohydrates:");
	        double carbohydrates = scanner.nextDouble();

	        // Calculate
	        double fatCalories = fat * 9;
	        double proteinCalories = protein * 4;
	        double carbohydratesCalories = carbohydrates * 4;
	        double totalCalories = fatCalories + proteinCalories + carbohydratesCalories;

	        double percentFromFat = (fatCalories / totalCalories) * 100;

	        System.out.println("The Nutritional information for " + itemName + " is:");
	        System.out.println("Total calories calculated: " + totalCalories);
	        System.out.printf("Percent of calories from fat: %.2f%%\n", percentFromFat);

	        scanner.close();
	    }
	}
}
