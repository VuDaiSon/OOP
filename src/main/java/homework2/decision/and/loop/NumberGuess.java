package homework2.decision.and.loop;

import java.util.Scanner;

/**
 * Write a program to play the number guessing game. The program shall generate a random
 * number between 0 and 99. The player inputs his/her guess, and the program shall response
 * with ”Try higher”, ”Try lower” or ”You got it in n trials” accordingly.
 */
public class NumberGuess {
    public static void main(String[] args) {
        guessNumber();
    }
    public static void guessNumber(){
        final int SECRET_NUMBER = (int) (Math.random()*100);
        Scanner in = new Scanner(System.in);
        guessNumber(SECRET_NUMBER, in);
    }
    public static void guessNumber(int number, Scanner in){
        int trials = 0;
        System.out.print("Key in your guess: ");
        int guess = in.nextInt();
        trials++;
        while(guess != number){
            if(guess < number){
                System.out.print("Try higher:");
            }
            else {
                System.out.print("Try lower:");
            }
                guess = in.nextInt();
                trials ++;
        }
        System.out.print("you got it in " + trials + " !");
    }
}
