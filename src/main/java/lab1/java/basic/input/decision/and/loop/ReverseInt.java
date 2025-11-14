package lab1.java.basic.input.decision.and.loop;

import java.math.BigInteger;
import java.util.Scanner;

/**
Write a program that prompts user for a positive integer.
 The program shall read the input as int; and print the ”reverse” of the input integer.
 */

public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you wanna reverse: ");
        BigInteger inNumber = in.nextBigInteger();
        BigInteger inDigit;
        if(inNumber.compareTo(BigInteger.ZERO) <= 0){
            System.out.print("Please enter a positive integer!");
        }
        while(inNumber.compareTo(BigInteger.ZERO) > 0){
            inDigit = inNumber.remainder(BigInteger.TEN);
            System.out.print(inDigit);
            inNumber = inNumber.divide(BigInteger.TEN);
        }
    }
}
