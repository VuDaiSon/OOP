package lab2.java.basic.method;

import java.util.Scanner;

/**
 * Write a boolean method called contains(), which takes an array of int and an int; and returns
 * true if the array contains the given int.
 */
public class Contains {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = in.nextInt();
        }
        System.out.print("Enter key to search: ");
        int key = in.nextInt();
        if(contains(array, key)){
            System.out.println("Contains " + key + "? " + "true");
        }
        else {
            System.out.println("Contains " + key + "? " + "false");
        }
    }
    public static boolean contains(int[] array, int key){
        for (int j : array) {
            if (key == j) {
                return true;
            }
        }
        return false;
    }
}
