package lab3.java.basic.Recursion;

import java.util.Scanner;

/**
 * Write a recursive method called factorial() to compute the factorial of the given integer.
 */
public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("factorial of " + n + " is: " + factorial(n));
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}
