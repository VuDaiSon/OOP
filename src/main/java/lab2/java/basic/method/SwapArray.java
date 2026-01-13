package lab2.java.basic.method;

import static lab2.java.basic.method.ArrayToString.arrayToString;

/**
 * Write a method called swap(), which takes two arrays of int and swap their contents if they
 * have the same length. It shall return true if the contents are successfully swapped.
 */
public class SwapArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        System.out.println("Before swap:");
        System.out.println("a1 = " + arrayToString(a1));
        System.out.println("a2 = " + arrayToString(a2));

        boolean result = swap(a1, a2);

        System.out.println("\nSwap successful? " + result);
        System.out.println("After swap:");
        System.out.println("a1 = " + arrayToString(a1));
        System.out.println("a2 = " + arrayToString(a2));

        // Test different length
        int[] b1 = {1, 2};
        int[] b2 = {3, 4, 5};

        System.out.println("\nSwap different length arrays:");
        System.out.println("Result: " + swap(b1, b2));
    }
    public static boolean swap(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for(int i = 0; i < array1.length; i++){
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }
}
