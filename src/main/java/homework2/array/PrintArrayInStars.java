package homework2.array;

import java.util.Scanner;

/**
 * Write a Java program called ArrayHomework that implements the following methods. Write
 * a method called printArrayInStars() (with prototype void printArrayStars(Scanner in)) which
 * prompts user for the number of items in an array (a non-negative integer),
 * and saves it in an int variable called NUM ITEMS. It then prompts user for the values of all the items
 * (nonnegative integers) and saves them in an int array called items. The program shall then print
 * the contents of the array in a graphical form, with the array index and values represented
 * by number of stars.
 */
public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printArrayStars(in);
    }
    public static void printArrayStars(Scanner in){
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        for(int i = 0; i<NUM_ITEMS; i++){
            items[i] = in.nextInt();
        }
        for(int i = 0; i< items.length; i++){
            System.out.print(i + ": ");
            for(int starNo = 1; starNo <= items[i]; starNo++){
                System.out.print("*");
            }
            System.out.println(" (" + items[i] + ")");
        }
    }
}
