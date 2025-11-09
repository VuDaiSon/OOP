package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;
/**
 Write a method called reverseString(String inStr) (with prototype String reverseString(String inStr))
 which reverses the string inStr by extracting and processing each character.
 Write a method called testReverseString() which prompts user for a string,
 and prints the reverse of the string using the method reverseString().
 */

public class ReverseString {

    public static String reverseString(String inStr) {
        int inStrLen = inStr.length();
        StringBuilder reversedStr = new StringBuilder();
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            reversedStr.append(inStr.charAt(charIdx));
        }
        return reversedStr.toString();
    }

    public static void testReverseString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next();
        String reversed = reverseString(inStr);
        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + reversed + "\".");
    }

    public static void main(String[] args) {
        testReverseString();
    }
}