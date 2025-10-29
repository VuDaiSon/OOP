package lab1.java.basic;

import java.math.BigInteger;
import java.util.Scanner;

//The following program calculates and prints the factorial of n entered from the keyboard.
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        BigInteger n = sc.nextBigInteger();
        BigInteger factorial = BigInteger.ONE;
        BigInteger i = BigInteger.ONE;
        while (i.compareTo(n) <= 0){
            factorial = factorial.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        System.out.println("Factorial of " + n + " is " + factorial);
        }

}