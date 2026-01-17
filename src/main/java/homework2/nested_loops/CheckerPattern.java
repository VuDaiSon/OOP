package homework2.nested_loops;

import java.util.Scanner;

/**
 * Write a method called checkerPattern() (with prototype void checkerPattern(int n)) that
 * prints the following checkerboard pattern. Write a method called testCheckerPattern() that
 * prompts user for the size (a non-negative integer in int); and prints the checkerboard pattern.
 */
public class CheckerPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = in.nextInt();
        checkPattern(n);
    }
    public static void checkPattern(int n){
        for(int row = 0; row <n; row++){
            if(row%2==1){
                System.out.print(" ");
            }
            for(int col = 0; col <n; col++){
                    System.out.print("# ");
                }
            System.out.println();
        }
        }
    }
