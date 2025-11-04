package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;

/**
 * On your phone keypad, the alphabets are mapped to digits as follows: ABC(2), DEF(3),
 * GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9). Write a method called phoneKey-
 * Pad() (with prototype String phoneKeyPad(String inStr)), which converts the string inStr
 * to a sequence of keypad digits. Write a method called testPhoneKeyPad(), which prompts
 * user for a string (case insensitive), and converts to a sequence of keypad digits using the
 * method phoneKeyPad(). Use (a) a nested-if, (b) a switch-case-default.
 */

public class PhoneKeyPad {
    public static void main(String[] args) {
        testPhoneKeyPad();
    }
    public static String phoneKeypad(String inStr) {
        inStr = inStr.toLowerCase();
        System.out.print("Converted String: " );
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            switch (inChar) {
                case 'a', 'b', 'c' -> System.out.print(2);
                case 'd', 'e', 'f' -> System.out.print(3);
                case 'g', 'h', 'i' -> System.out.print(4);
                case 'j', 'k', 'l' -> System.out.print(5);
                case 'm', 'n', 'o' -> System.out.print(6);
                case 'p', 'q', 'r', 's' -> System.out.print(7);
                case 't', 'u', 'v' -> System.out.print(8);
                case 'w', 'x', 'y', 'z' -> System.out.print(9);
                default -> System.out.print(inChar);
            }
        }
        return " ";
    }
    public static void testPhoneKeyPad(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.nextLine();
        phoneKeypad(inStr);
    }
}
