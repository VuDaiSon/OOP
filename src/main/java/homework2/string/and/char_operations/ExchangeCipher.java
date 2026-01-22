package homework2.string.and.char_operations;

import java.util.Scanner;

/**
 * This simple cipher exchanges ’A’ and ’Z’, ’B’ and ’Y’, ’C’ and ’X’, and so on.
 * Write a method called exchangeCipher() (with prototype String exchangeCipher(String in-Str))
 * that computes the ciphertext; and return the ciphertext in uppercase. Write a method
 * called testExchangeCipher() that prompts user for a plaintext string consisting of mix-case
 * letters only, compute the ciphertext; and print the ciphertext in uppercase.
 */
public class ExchangeCipher {
    public static void main(String[] args) {
        testExchangeCipher();
    }
    public static String exchangeCipher(String inStr){
StringBuilder result = new StringBuilder();
    for(int i = 0; i<inStr.length(); i++){
        char ch = inStr.charAt(i);
        char cipherChar = (char) ('Z' - (ch - 'A'));
        result.append(cipherChar);
        }
    return result.toString();
    }
    public static void testExchangeCipher(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String plainText = in.next().toUpperCase();
        String cipherText = exchangeCipher(plainText);
        System.out.println("The ciphertext string is: " + cipherText);
    }
}
