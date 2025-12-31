package lab2.java.basic.array;

import java.util.Scanner;

/**
 * Write a method called createArray() (with prototype int[] createArray(Scanner in)) which
 * prompts user for the number of items in an array (a non-negative integer), and saves it in
 * an int variable called NUM ITEMS. It then prompts user for the values of all the items
 * and saves them in an int array called items. Write a method called printArray(int[] arr) to
 * print the array arr in the form of [x1, x2, ..., xn]. Using the method printArray() to print the
 * created array.
 */

public class PrintArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = createArray(in);
        System.out.print("The values are: ");
        printArray(arr);
    }
    public static int[] createArray(Scanner in){
        System.out.print("Enter the number of item s: ");
        int n = in.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");
        int[] NUM_ITEMS = new int[n];
        for(int i = 0; i<n; i++) {
            NUM_ITEMS[i] = in.nextInt();
            System.out.print(" ");
        }
        return NUM_ITEMS;
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i< arr.length-1){
                System.out.print( ", ");
            }
        }
        System.out.print("]");
    }
}
