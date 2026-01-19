package homework2.nested_loops;

import java.util.Scanner;

/**
 * Write a method called timeTable() (with prototype void timeTable(int n)) that prints the
 * multiplication table as the following table. Write a method called testTimeTable() that
 * prompts user for the size (a positive integer in int); and prints the multiplication table.
 */
public class TimeTable {
    public static void main(String[] args) {
    testTimeTable();
    }
    public static void timeTable(int n){
        System.out.print("* |");
        for(int col = 1; col <= n; col ++){
            System.out.printf("%4d", col);
        }
        System.out.println();
        System.out.print("---");
        for(int col = 1; col <=n; col ++){
            System.out.print("----");
        }
        System.out.println();
        for(int row=1;row<=n; row ++){
            System.out.printf("%2d|", row);
            for(int col = 1; col <=n; col++){
                System.out.printf("%4d", col * row);
            }
            System.out.println();
        }
    }
    public static void testTimeTable(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Size must be a positive integer.");
            return;
        }
        timeTable(n);
    }
}
