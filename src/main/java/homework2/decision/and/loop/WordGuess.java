package homework2.decision.and.loop;

import java.util.Scanner;

/**
 * Write a program to guess a word by trying to guess the individual characters.
 * The word to be guessed shall be provided by player.
 */
public class WordGuess {
    public static void main(String[] args) {
        guessWord();
    }
    public static void guessWord(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word to be guessed: ");
        String word = in.nextLine();
        guessWord(word, in);
    }
    public static void guessWord(String guessedString, Scanner in){
        int trials = 0;
        boolean[] guessed = new boolean[guessedString.length()];
        while(true){
            System.out.print("Key in one character or your guess word: ");
            String input = in.nextLine();
            trials++;
            //guess all word
            if(input.length() > 1){
                if(input.equals(guessedString)){
                    System.out.println("Congratulations!");
                    System.out.println("You got it in " + trials + " trials");
                    break;
                }
                else {
                    System.out.println("Wrong guess!");
                }
            }
            // guess one char
            else{
                char ch = input.charAt(0);
                for(int i = 0; i<guessedString.length(); i++ ){
                    if(guessedString.charAt(i)==ch) {
                        guessed[i] = true;
                    }
                }
                System.out.print("Trial " + trials + ": ");
                    boolean finished = true;
                    for(int i = 0; i<guessedString.length(); i++){
                        if(guessed[i]){
                        System.out.print(guessedString.charAt(i));
                    }
                        else {
                            System.out.print("_");
                            finished = false;
                        }
                }
                    System.out.println();
                    if(finished){
                        System.out.println("Congratulations!");
                        System.out.println("You got it in " + trials + " trials");
                        break;
                    }
            }
        }
    }
}
