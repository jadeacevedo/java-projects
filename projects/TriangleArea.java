/*	Write a program that asks the user to enter three sides for a triangle and computes the area if the input is valid. 
 * The formula for computing the area of a triangle from its sides is:
area = √(s(s-side1)(s-side2)(s-side3))

where, side1, side2 and side3 are the three sides, and s = (side1 + side2 + side3) / 2

The program should use the isValid and area methods with the following headers:

//the method returns true if the sum of any two sides is greater than the third side
public static boolean isValid (double side1, double side2, double side3)

//the method returns the area of the triangle
public static double area (double side1, double side2, double side3)

 * 
 * */
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side 2:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter side 3:");
        double side3 = scanner.nextDouble();

        if (isValid(side1, side2, side3)) {
            double area = area(side1, side2, side3);
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Invalid input. The sum of any two sides must be greater than the third side.");
        }
    }

    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}