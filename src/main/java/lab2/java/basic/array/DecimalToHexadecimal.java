package lab2.java.basic.array;

import java.util.Scanner;

/**
 * Write a method called decimalToHexadecimal() (with prototype String decimalToHexadeci-
 * mal(int positiveInteger)) to convert a positive decimal number into its equivalent hexadecimal
 * string. Write a method call testDecimalToHexadecimal() that prompts user for a positive
 * decimal number, read as int, and print its equivalent hexadecimal string.
 */
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        testDecimalToHexadecimal();
    }
    public static String decimalToHexadecimal(int positiveInteger){
        if(positiveInteger == 0){
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        while(positiveInteger >0){
            char hexChar;
            int remainder = positiveInteger % 16;
            if(remainder < 10){
                hexChar = (char) ('0' + remainder);
            }
            else{
                hexChar = (char) ('A' + remainder - 10);
            }
            hex.insert(0, hexChar);
            positiveInteger /=16;
        }
        return hex.toString();
    }
    public static void testDecimalToHexadecimal(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = in.nextInt();
        String hex = decimalToHexadecimal(num);
        System.out.println("The equivalent hexadecimal number is " + hex);
    }
}
