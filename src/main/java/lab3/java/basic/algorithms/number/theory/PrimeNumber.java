package lab3.java.basic.algorithms.number.theory;

import java.util.Scanner;

/**
 * A positive integer is a prime if it is divisible by 1 and itself only. Write a boolean method
 * called isPrime(int aPosInt) that takes a positive integer and returns true if the number is
 * a prime. Write a program called PrimeList that prompts the user for an upper bound (a
 * positive integer), and lists all the primes less than or equal to it. Also display the percentage
 * of prime (rounded to 2 decimal places).
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
    }
    public static boolean isPrime(int aPosInt){
        if(aPosInt<2){
            return false;
        }
        if (aPosInt == 2) return true;
        if (aPosInt % 2 == 0) return false;
        for(int i = 5; i<= aPosInt/2; i+=2){
            if(aPosInt%i==0){
                return false;
            }
        }
        return true;
    }
}
