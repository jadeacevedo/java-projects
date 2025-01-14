/*
 * 5.	Write a program to calculate the average, the maximum and the minimum element of a 1D array of doubles. 
 * The program should use a method called arrayStats that takes a 1D array of doubles as an argument and returns a 1D array of doubles containing the average, 
 * the maximum and the minimum element of the array. Write a test program (the main method) that prompts the user to enter a one-dimensional array, 
 * calls the arrayStats method, and displays the average, maximum and minimum element of the array. 
 */
import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        double[] array = new double[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        double[] stats = arrayStats(array);

        System.out.println("Average: " + stats[0]);
        System.out.println("Maximum: " + stats[1]);
        System.out.println("Minimum: " + stats[2]);
    }

    public static double[] arrayStats(double[] array) {
        double sum = 0;
        double max = array[0];
        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        double average = sum / array.length;

        return new double[]{average, max, min};
    }
}