package homework2.string.and.char_operations;

import java.util.Scanner;

/**
 * A word that reads the same backward as forward is called a palindrome, e.g., ”mom”,
 * ”dad”, ”racecar”, ”madam”, and ”Radar” (case-insensitive). Write a method called isPalindromicWord()
 * (with prototype boolean isPalindromicWord(String inStr)) that checks for palindromic work.
 * Write a method called testPalindromicWord() that prompts user for a
 * word and prints ””xxx” is | is not a palindrome”.

 */
public class TestPalindromicWord {
    public static void main(String[] args) {
        testPalindromicWord();
    }
    public static boolean isPalindromicWord(String inStr){
        inStr = inStr.toLowerCase();
        int fIdx = 0;
        int bIdx = inStr.length() - 1;
        while(fIdx < bIdx){
            if(inStr.charAt(fIdx) != inStr.charAt(bIdx)){
                return false;
            }
            fIdx ++;
            bIdx --;
        }
        return true;
    }
    public static void testPalindromicWord() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.next();
        if(isPalindromicWord(word)){
            System.out.println("\"" + word + "\" is a palindrome");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome");

        }
    }}
