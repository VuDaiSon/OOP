package lab1.java.basic.input.decision.and.loop;

import java.util.Scanner;

// Write a program that prompts user for the mark (between 0 − 100 in int) of 3 students
// computes the average (in double); and prints the result rounded to 2 decimal places
// Your program needs to perform input validation.
public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENT = 3;
        Scanner in = new Scanner(System.in);
        int number;
        boolean isValid;
        int sum = 0;
        double average;
        for(int studentNo = 1; studentNo <=NUM_STUDENT; studentNo++){
            isValid = false;
            do{
                System.out.print("Enter the mark (0-100) for student " + studentNo + " : ");
                number = in.nextInt();
                if(number <= 100 && number >= 0){
                    isValid = true;
                }else {
                    System.out.println("Invalid input, try again...");
                }
            }while(!isValid);
            sum += number;
        }
        average = (double) sum/NUM_STUDENT;
        System.out.println(average);
    }
}
