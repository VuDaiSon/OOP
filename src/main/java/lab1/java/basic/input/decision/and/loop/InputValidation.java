package lab1.java.basic.input.decision.and.loop;

import java.util.Scanner;

// your program often needs to validate the user’s inputs, e.g., marks shall be between 0 and 100
// Write a program that prompts user for an integer between 0 − 10 or 90 − 100.
// The program shall read the input as int; and repeat until the user enters a valid input.
public class InputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberIn;
        boolean isValid = false;
        do{
            System.out.print("Enter a number between 0−10 or 90−100: ");
            numberIn = in.nextInt();
            if( (numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100) ){
                isValid = true;
            }else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);
            System.out.println("You have entered: " + numberIn);
    }
}
