package lab3.java.basic.Recursion;

import java.util.Scanner;

/**
 * Write a recursive method to compute the Fibonacci number of n
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("F(" + n + ") = " + fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
