package lab3.java.basic.algorithms_sorting.and.searching;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            array[i] = in.nextInt();
        }
        System.out.print("Enter the number you wanna search: ");
        int key = in.nextInt();
        if(binarySearch(array, key)){
            System.out.print( "The key has been found");
        }else {
            System.out.print("Not found!");
        }
    }
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx){
        if(fromIdx == toIdx - 1){
            return key == array[fromIdx];
        }else {
           int middleIdx = (fromIdx + toIdx)/2;
           if(key==array[middleIdx]){
               return true;
           }
           else if(key<array[middleIdx]){
               toIdx = middleIdx;
           }
           else {
                fromIdx = middleIdx +1;
           }
           return binarySearch(array, key, fromIdx, toIdx);
        }
    }
    public static boolean binarySearch(int[] array, int key){
        return binarySearch(array, key, 0, array.length);
    }
}
