package homework2.nested_loops;

import java.util.Scanner;

/**
 * Write 4 methods called triangularPatternX() (with prototype void triangularPatternX(int n),
 * X = A, B, C, D) that prints each of the patterns as shown. Write a method called
 * testTriangularPattern() prompts user for the size (a non-negative integer in int);
 * and prints ach of the patterns.
 */
public class TriangularPattern {
    public static void main(String[] args) {
        testTriangularPattern();
    }

    public static void triangularPatternA(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("(A)");

    }

    public static void triangularPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row + col) <= n + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("(B)");

    }

    public static void triangularPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col) {
                    System.out.print("#");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("(C)");

    }

    public static void triangularPatternD(int n) {
        for(int row = 1; row <=n; row++){
            for(int col = 1; col <= n; col++){
                if((row + col) >= n + 1){
                    System.out.print("# ");
                }else{
                System.out.print("  ");
            }}
            System.out.println();
        }
        System.out.println("(D)");
    }
    public static void testTriangularPattern() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = in.nextInt();

        triangularPatternA(n);
        System.out.println();

        triangularPatternB(n);
        System.out.println();

        triangularPatternC(n);
        System.out.println();

        triangularPatternD(n);
    }
}