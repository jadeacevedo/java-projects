//Assignment # 10 Question 4
import java.util.Scanner;
public class TestScores {
	private double score1;
    private double score2;
    private double score3;
    
    public TestScores(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3; 
       }


    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    
    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    public double calculateAverage() {
        return (score1 + score2 + score3) / 3.0;
    } 
    
    // DEMO
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter test #1 score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter test #2 score: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter test #3 score: ");
        double score3 = scanner.nextDouble();


        TestScores testScores = new TestScores(score1, score2, score3);

           System.out.println("Average of all three test scores are: " + testScores.calculateAverage());

        scanner.close();
    }
}


