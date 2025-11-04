package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;

/**
 Write a method called countVowels() (with prototype int countVowels(String inStr))
 that counts the number of vowels (a, e, i, o, u, A, E, I, O, U) contained in the string inStr.
 Write a method called countDigits() (with prototype int countDigits(String inStr))
 that counts the number of digits (0 − 9) contained in the String inStr. Write a method called
testCountVowelsDigits(), which prompts the user for a String, counts the number of vowels
and digits contained in the string, and prints the counts and the percentages (rounded to 2 decimal places).
 */

public class CountVowelsDigits {
    public static void main(String[] args) {
        testCountVowelsDigits();
    }
    public static int countVowels(String inStr) {
        int count = 0;
        for(int i = 0; i < inStr.length(); i++){
            char check = inStr.charAt(i);
            if("ueoaiUEOAI".indexOf(check) != -1){
                count++;
            }
        }
        return count;
    }
    public static int countDigits(String inStr){
        int count = 0;
        for(int i = 0; i< inStr.length(); i++){
            char check = inStr.charAt(i);
            if("0123456789".indexOf(check) != -1){
                count++;
            }
        }
        return count;
    }
    public static void testCountVowelsDigits(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inStr = in.nextLine();
        int numVowels = countVowels(inStr);
        int numDigits = countDigits(inStr);
        int strLen = inStr.length();
        double percentVowels = 100.0 * numVowels/strLen ;
        double percentDigits = 100.0 * numDigits/strLen;
        System.out.printf("Number of vowels: %d (%.2f%%)%n", numVowels, percentVowels);
        System.out.printf("Number of digits: %d (%.2f%%)%n", numDigits, percentDigits);
    }
}
