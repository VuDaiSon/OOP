package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;
/**
 * Write a method called decipherCaesarCode() (with prototype String decipherCaesarCode(String inStr))
 * to decipher the Caesar’s code described in the previous exercise.
 * Write a method called testDecipherCaesarCode(),
 * which prompts user for a ciphertext string consisting of mix-case letters only;
 * compute the plaintext; and print the plaintext in uppercase.
 */
public class DecipherCaesarCode {
    public static void main(String[] args) {
        testDecipherCaesarCode();
    }
    public static String decipherCaesarCode(String inStr){
        inStr = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<inStr.length(); i++){
            char ch = inStr.charAt(i);
            if(ch >= 'D' && ch <= 'z'){
                result.append((char) (ch - 3));
            } else if (ch == 'A') {
                result.append('X');
            } else if (ch == 'B') {
                result.append('Y');
            } else if (ch == 'C') {
                result.append('Z');
            }
        }
        return result.toString();
    }
    public static void testDecipherCaesarCode(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = in.nextLine();
        String result = decipherCaesarCode(inStr);
        System.out.println("The plaintext string is: " + result);
    }
}
