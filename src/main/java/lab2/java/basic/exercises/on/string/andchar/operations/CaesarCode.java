package lab2.java.basic.exercises.on.string.andchar.operations;

/**
 * Caesar’s Code is one of the simplest encryption techniques. Each letter in the plaintext is
 * replaced by a letter some fixed number of position (n) down the alphabet cyclically. In this
 * exercise, we shall pick n = 3. That is, ’A’ is replaced by ’D’, ’B’ by ’E’, ’C’ by ’F’, ..., ’X’
 * by ’A’, ..., ’Z’ by ’C’.
 * Write a method called cipherCaesarCode() (with prototype String cipherCaesarCode(String
 * inStr)) to cipher the Caesar’s code. Write a method called testCipherCaesarCode(), which
 * prompts user for a plaintext string consisting of mix-case letters only; compute the ciphertext;
 * and print the ciphertext in uppercase.
 */

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        testCipherCaesarCode();
    }

    public static String cipherCaesarCode(String inStr) {
        inStr = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if (inChar >= 'A' && inChar <= 'W') {
                result.append((char) (inChar + 3));
            } else if (inChar == 'X') {
                result.append('A');
            } else if (inChar == 'Y') {
                result.append('B');
            } else if (inChar == 'Z') {
                result.append('C');
            } else {
                result.append(inChar);
            }
        }
        return result.toString();
    }
    public static void testCipherCaesarCode(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.nextLine();
        System.out.print("The ciphertext string is: " + cipherCaesarCode(inStr));

    }
}
