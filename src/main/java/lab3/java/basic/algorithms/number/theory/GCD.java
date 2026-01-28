package lab3.java.basic.algorithms.number.theory;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter first positive integer: ");
            int a = in.nextInt();

            System.out.print("Enter second positive integer: ");
            int b = in.nextInt();

            // Handle invalid case
            if (a == 0 && b == 0) {
                System.out.println("GCD is undefined for a = 0 and b = 0");
                return;
            }
            int result = gcd(a, b);
            System.out.println("GCD(" + a + ", " + b + ") = " + result);

    }
    public static int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
