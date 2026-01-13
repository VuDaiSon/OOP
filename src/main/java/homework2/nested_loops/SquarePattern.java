package homework2.nested_loops;

import java.util.Scanner;

/**
 * Write a method called squarePattern() (with prototype void squarePattern(int n))
 * that prints the following square pattern using two nested for-loops.
 * Write a method called testSquarePattern() prompts user for the size (a non-negative integer in int);
 * and prints the square pattern.
 */
public class SquarePattern {
    public static void main(String[] args) {
        testSquarePattern();
    }
    public static void squarePattern(int n){
        for(int row = 0; row < n; row++){
            for (int col = 0; col <n; col ++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void testSquarePattern(){
        System.out.print("Enter the size: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Size must be non-negative.");
            return;
        }
        squarePattern(n);
    }
}
