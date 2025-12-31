package lab2.java.basic.array;

import java.util.Scanner;

/**
 * Write a method called generateStudentGrades() (with prototype int[] generateStudentGrades(Scanner
 * in)) which prompts user for the number of students in a class (a non-negative integer), and
 * saves it in an int variable called numStudents. It then prompts user for the grade of each
 * of the students (integer between 0 to 100) and saves them in an int array. Write a method
 * called simpleGradesStatistics(), which generates an array of grade of each of the students
 * and saves them in an int array called grades. The method shall then compute and print
 * the average (in double rounded to 2 decimal places) and minimum/maximum (in int).
 */

public class GradesStatistics {
    public static void main(String[] args) {
        simpleGradesStatistics();
    }
    public static int[] generateStudentGrades(Scanner in){    System.out.print("Enter the number of students: ");

        int numStudents = in.nextInt();
        int[] studentGrades = new int[numStudents];
        for(int i = 0; i<studentGrades.length; i++){
            System.out.print("Enter the number of student " + ( i+ 1) + ": ");
            studentGrades[i] = in.nextInt();
            System.out.println();
        }
        return studentGrades;
    }
    public static void simpleGradesStatistics() {
        Scanner in = new Scanner(System.in);
        int[] grades = generateStudentGrades(in);
        int sum = 0;
        int minimum = grades[0];
        int maximum = grades[0];
        for(int grade :grades) {
            sum += grade;
            if (minimum > grade) {
                minimum = grade;
            }
            if(maximum < grade){
                maximum = grade;
            }
        }
        double average = (double) sum/ grades.length;
        System.out.printf("The average is: %.2f%n", average);
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);
    }
}
