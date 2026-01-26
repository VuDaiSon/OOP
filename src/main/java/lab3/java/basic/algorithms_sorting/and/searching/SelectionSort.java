package lab3.java.basic.algorithms_sorting.and.searching;

import java.util.Scanner;

import static lab2.java.basic.method.PrintArray.print;

/**
 * This algorithm divides the lists into two parts: the
 * left-sublist of items already sorted, and the right-sublist for the remaining items. Initially, the
 * left-sorted-sublist is empty, while the right-unsorted-sublist is the entire list. The algorithm
 * proceeds by finding the smallest (or largest) items from the right-unsorted-sublist, swapping
 * it with the leftmost element of the right-unsorted-sublist, and increase the left-sorted-sublist
 * by one.
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            array[i] = in.nextInt();
        }
        selectionSort(array);
        System.out.print("The array after sorting: ");
        print(array);
    }
    public static void selectionSort(int[] array){
        for(int i = 0; i < (array.length - 1); i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
