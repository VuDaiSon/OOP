package lab3.java.basic.algorithms_sorting.and.searching;


import java.util.Scanner;

/**
 * The principle of bubble sort is to scan the elements from left-to-right,
 * and whenever two adjacent elements are out-of-order, they are swapped.
 * Repeat the passes until no swap are needed.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            array[i] = in.nextInt();
        }
        bubbleSort(array);
            System.out.print("The array after sorting: ");
        print(array);
    }
    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean swapped;
        do{
            swapped = false;
            for(int i = 1; i <n; i ++){
                if(array[i-1] > array[i]){
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n = n -1;
        }while (swapped);
    }
    public static void print(int[] array){
        System.out.print("[");
        if(array.length > 0){
            System.out.print(array[0]);
            for(int i = 1; i < array.length; i++){
                System.out.print("," + array[i]);
            }
        }
        System.out.print("]");
    }
}
