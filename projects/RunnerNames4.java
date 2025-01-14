
import java.util.Scanner;

public class RunnerNames4 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        String fullName1, fullName2, fullName3; 
        double time1, time2, time3; 
        
        System.out.println("Runner 1, Enter your name:");
        fullName1 = scanner.nextLine();
        System.out.println("Enter time taken by " + fullName1 + " (in minutes):");
        time1 = scanner.nextDouble();
        
        scanner.nextLine(); 
        
        System.out.println("Runner 2, Enter your name:");
        fullName2 = scanner.nextLine();
       
        System.out.println("Enter time taken by " + fullName2 + " (in minutes):");
        time2 = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Runner 3, Enter your name:");
        fullName3 = scanner.nextLine();
        
        System.out.println("Enter time taken by " + fullName3 + " (in minutes):");
        time3 = scanner.nextDouble();
        
       
        System.out.println("Person + time:");
        System.out.println(fullName1 + " - Time: " + time1 + " minutes");
        System.out.println(fullName2 + " - Time: " + time2 + " minutes");
        System.out.println(fullName3 + " - Time: " + time3 + " minutes");
        
        
        if (time1 < time2 && time1 < time3) {
            System.out.println("The Winner Is: " + fullName1);
        } else if (time2 < time1 && time2 < time3) {
            System.out.println("The Winner Is: " + fullName2);
        } else if (time3 < time1 && time3 < time2) {
            System.out.println("The Winner Is: " + fullName3);
        } else {
            System.out.println("It's a tie!" );
        }
        
        scanner.close();
    }
}

