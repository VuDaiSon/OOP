package lab3.java.basic.Recursion;

import java.util.Scanner;

/**
 * Write a recursive method called gcd() to compute the greatest common divisor of two given integers.
 */
public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();

        System.out.print("Enter b: ");
        int b = in.nextInt();

        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
    }
    public static int gcd(int a, int b){
        if(b==0){
            return 0;
        }
        else {
            return gcd(b, a%b);
        }
    }
}
