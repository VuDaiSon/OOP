package lab2.java.basic.method;

import java.util.Scanner;

/**
 * Write a method called arrayToString(), which takes an int array and return a String in the
 * form of [a1, a2, . . . , an]. Take note that this method returns a string, the previous exercise
 * returns void but prints the output.
 */
public class ArrayToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i ++){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = in.nextInt();
        }
        System.out.print("Array: " + arrayToString(array));
    }
    public static String arrayToString(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(array.length > 0) {
            sb.append(array[0]);
            for (int i = 1; i < array.length; i++) {
                sb.append(", ").append(array[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
