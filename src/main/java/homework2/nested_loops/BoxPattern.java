package homework2.nested_loops;

import java.util.Scanner;

/**
 * Write 4 methods called boxPatternX() (with prototype void boxPatternX(int n), X = A,
 * B, C, D) that prints the pattern as shown. Write a method called testBoxPattern() that
 * prompts user for the size (a non-negative integer in int); and prints the patterns.
 */
public class BoxPattern {
    public static void main(String[] args) {
        testBoxPattern();
    }
    public static void boxPatternA(int n){
        for(int row = 1; row <=n; row ++){
            for(int col  = 1; col <=n; col ++){
                if(row == 1 || row == n || col == 1 || col == n){
                    System.out.print("# ");
                }else {
                System.out.print("  ");
            }}
            System.out.println();
        }
        System.out.println("(a)");

    }
    public static void boxPatterB(int n){
        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <=n; col ++){
                if(row == 1 || row == n || row == col){
                    System.out.print("# ");
                }else{
                System.out.print("  ");
            }}
            System.out.println();
        }
        System.out.println("(b)");
    }
    public static void boxPatternC(int n){
        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <=n; col ++){
                if(row == 1 || row == n || row + col == n + 1){
                    System.out.print("# ");
                }else{
                System.out.print("  ");
            }}
            System.out.println();
        }
        System.out.println("(c)");
    }
    public static void boxPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n ||
                        row == col || row + col == n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("(d)");
    }
    public static void testBoxPattern(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = in.nextInt();
    boxPatternA(n);
    System.out.println();
    boxPatterB(n);
    System.out.println();
    boxPatternC(n);
    System.out.println();
    boxPatternD(n);
    System.out.println();
    }
}
