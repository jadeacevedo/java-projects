package a3;
import javax.swing.JOptionPane;

public class TestScoresAverage {
	public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter the first test score:");
        String input2 = JOptionPane.showInputDialog("Enter the second test score:");
        String input3 = JOptionPane.showInputDialog("Enter the third test score:");

        double score1 = Double.parseDouble(input1);
        double score2 = Double.parseDouble(input2);
        double score3 = Double.parseDouble(input3);

        double average = (score1 + score2 + score3) / 3.0;

        String letterGrade;
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        JOptionPane.showMessageDialog(null, "Average: " + average + "\nLetter Grade: " + letterGrade);
    }

}
