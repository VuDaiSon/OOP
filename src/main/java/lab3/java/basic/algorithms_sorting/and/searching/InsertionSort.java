package lab3.java.basic.algorithms_sorting.and.searching;

import java.util.Scanner;

import static lab2.java.basic.method.PrintArray.print;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            array[i] = in.nextInt();
        }
        insertionSort(array);
        System.out.print("The array after sorting: ");
        print(array);
    }
    public static void insertionSort(int[] array){
        for(int i = 1; i<array.length; i++){
            int key = array[i];
            int j = i - 1;
            while (j>= 0 && key < array[j]){
                array[j+1] = array[j];
                j -= 1;
            }
            array[j+1] = key;
        }
    }
}