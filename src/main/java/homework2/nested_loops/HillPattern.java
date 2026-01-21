package homework2.nested_loops;

import java.util.Scanner;

/**
 * Write 4 methods called hillPatternX() (with prototype void hillPatternX(int n) , X = A,
 * B, C, D) that prints the pattern as shown. Write a method called testHillPatternX() that
 * prompts user for the size (a non-negative integer in int); and prints the patterns.
 */
public class HillPattern {
    public static void main(String[] args) {
        testHillPattern();
    }
    public static void hillPatternA(int n){
        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <=  2 * n - 1; col ++){
                if(row + col >= n + 1 && row >= col - n +1){
                System.out.print("# ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("(a)");
    }
    public static void hillPatternB(int n){
        for (int row = 1; row <= n; row ++){
            for(int col = 1; col <= 2 * n - 1; col ++){
                if (row + col <= 2 * n && col - row >= 0){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("(b)");

    }
    public static void hillPatternC(int n) {
        // nửa trên
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2*n-1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        // nửa dưới
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= 2*n-1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("(c)");
    }

    public static void hillPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2*n-1; col++) {
                if (
                        row == n ||                     // đáy
                                row + col == n + 1 ||           // cạnh trái
                                col - row == n - 1              // cạnh phải
                )
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("(d)");
    }
    public static void testHillPattern(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = in.nextInt();
        hillPatternA(n);
        System.out.println();
        hillPatternB(n);
        System.out.println();
        hillPatternC(n);
        System.out.println();
        hillPatternD(n);
        System.out.println();
    }
}
