package lab2.java.basic.method;

import java.util.Scanner;

/**
 * Write a method called test search(), which takes an array of int and an int; and returns the
 * array index if the array contains the given int; or −1 otherwise.
 */
public class Search {
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
        if(search(array, key) != -1){
            System.out.println("Contains " + key + "? " + "true");
        }else{
            System.out.println("Contains " + key + "? " + "not found");
        }
    }
    public static int search(int[] array, int key){
        for (int i : array){
            if(i == key){
                return key;
            }
        }
        return -1;
    }
}
