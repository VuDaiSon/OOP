package lab2.java.basic.method;

import java.util.Scanner;

/**
 * Write a method called exponent(int base, int exp) that returns an int value of base raises to
 * the power of exp. The signature of the method is:
 * public static int exponent (int base, int exp);
 * Assume that exp is a non-negative integer and base is an integer. Do not use any Math library functions.
 * Also write the testExponent() method that prompts user for the base and exp; and prints the result.
 */
public class MethodExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testExponent(in);
        in.close();
    }
    public static void testExponent(Scanner in){
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = in.nextInt();
        System.out.println(base + " raises to the power of " + exp + "is: " + exponent(base, exp));
    }
    public static int exponent(int base, int exp){
        int product = 1;
        for(int i = 0; i<exp; i++){
            product *=base;
        }
        return product;

    }
}
