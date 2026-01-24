package lab3.java.basic.algorithms_sorting.and.searching;

import java.util.Scanner;

/**
 * Write the following linear search methods to search for a key value in an array, by comparing
 * each item with the search key in the linear manner. Linear search is applicable to unsorted list.
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your array's size: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i =0; i<n; i++){
            System.out.print("Enter the element "+ i + ": " );
            array[i] = in.nextInt();
        }
        System.out.print("Enter the number you wanna search: ");
        int key = in.nextInt();
        if(linearSearch(array, key)){
            System.out.print( "The key has been found in the array at index "
                    + linearSearchIndex(array, key));
        }else {
            System.out.print("Not found!");
        }
    }
    public static boolean linearSearch(int[] array, int key){
        for (int j : array) {
            if (j == key) {
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key){
        for(int i = 0; i<array.length; i++){
            if(array[i] == key){
                 return i;
            }
        }
        return -1;
    }
}
