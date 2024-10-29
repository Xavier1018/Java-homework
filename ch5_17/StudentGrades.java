package ch5_17;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count_a = 0, count_b = 0, count_c = 0, count_d = 0;

        // Loop to input names and grades for 5 students
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter name of student " + i + ":");
            String student_name = input.nextLine();  // Input for student name

            System.out.println("Enter grade for student " + student_name + ": ");
            char grade = input.nextLine().toUpperCase().charAt(0);  // Input for student grade as char

            // Switch statement to count grades
            switch (grade) {
                case 'A':
                    count_a++;
                    break;
                case 'B':
                    count_b++;
                    break;
                case 'C':
                    count_c++;
                    break;
                case 'D':
                    count_d++;
                    break;
                default:
                    System.out.println("Invalid grade entered. Please enter A, B, C, or D.");
                    i--; // Repeat the iteration for invalid input
                    break;
            }
        }

        // Display the final results after the loop
        System.out.println("\nNumber of students who got 'A': " + count_a);
        System.out.println("Number of students who got 'B': " + count_b);
        System.out.println("Number of students who got 'C': " + count_c);
        System.out.println("Number of students who got 'D': " + count_d);

        input.close();  // Close the scanner
    }
}
