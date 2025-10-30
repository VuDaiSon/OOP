package lab1.java.basic.exercises.on.decision.and.loop;

import java.math.BigInteger;
import java.util.Scanner;

//Write a program called ExtractDigits to extract each digit from an int, in the reverse order.
//For example, if the int is 15423, the output shall be ”3 2 4 5 1”, with a space separating the
//digits.
public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number you wanna reverse its order: ");
        BigInteger n = sc.nextBigInteger();
        while (n.compareTo(BigInteger.ZERO) >0) {
            BigInteger digit = n.remainder(BigInteger.TEN);
            n = n.divide(BigInteger.TEN);
            System.out.print(digit + " ");
        }
    }
}
