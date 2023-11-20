/**
 * Hrant Virabyan - Project 5 - AssignGrades - Mr. Riveira
 * The AssignGrades class is a program that prompts user for number of students and their scores. 
 * It calculates the best score and based on the criteria below, assigns a grade and displays it for each student.
 * Criteria
 * Grade is A if score is ≥ best – 10
 * Grade is B if score is ≥ best – 20
 * Grade is C if score is ≥ best – 30
 * Grade is D if score is ≥ best – 40
 * Grade is F otherwise
 *
 */

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // create a new array to store the student scores
        double[] scores = new double[numberOfStudents];

        // Print out the scores
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextDouble();
        }

        // Find the best_score
        double best_score = findbest_score(scores);

        // Assign and display grades
        for (int i = 0; i < scores.length; i++) {
            char grade = calculateGrade(scores[i], best_score);
            System.out.printf("Student %d score is %.1f and grade is %c%n", i, scores[i], grade);
        }

        input.close();
    }

    // Method to find all grades based on best_score using the following criteria 
    // Grade is A if score is ≥ best – 10
    // Grade is B if score is ≥ best – 20
    // Grade is C if score is ≥ best – 30
    // Grade is D if score is ≥ best – 40
    // Grade is F otherwise
    public static char calculateGrade(double score, double best_score) {
        if (score >= best_score - 10) return 'A';
        else if (score >= best_score - 20) return 'B';
        else if (score >= best_score - 30) return 'C';
        else if (score >= best_score - 40) return 'D';
        else return 'F';
    }

    // Method to find greatest/best_score. if the current score is greater than
    // previous best_score, replace the old best_score with current score
    public static double findbest_score(double[] scores) {
        double best_score = scores[0];
        for (double score : scores) {
            if (score > best_score) {
                best_score = score;
            }
        }
        return best_score;
    }


}
