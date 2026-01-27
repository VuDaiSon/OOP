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

        System.out.print("Please enter the upper bound: ");
        int n = in.nextInt();
        int count = 0;
for(int i = 1; i < n; i++) {
    if (isPrime(i)) {
        count ++;
        System.out.println(i);
    }}
        System.out.println("[" +count + " primes found (" + Math.round(((double) count /n) * 10000.0)/1000.0 + "%)]");

    }
    public static boolean isPrime(int aPosInt){
        if(aPosInt<2){
            return false;
        }
        if (aPosInt == 2) return true;
        if (aPosInt % 2 == 0) return false;
        for(int i = 3; i<= aPosInt/2; i+=2){
            if(aPosInt%i==0){
                return false;
            }
        }
        return true;
    }
}
