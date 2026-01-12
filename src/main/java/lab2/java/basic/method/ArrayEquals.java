package lab2.java.basic.method;

import java.util.Scanner;

/**
 * Write a boolean method called equals(), which takes two arrays of int and returns true if
 * the two arrays are exactly the same (i.e., same length and same contents).
 */
public class ArrayEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array 1
        System.out.print("Enter number of elements for array1: ");
        int n1 = in.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter element " + (i + 1) + " of array1: ");
            array1[i] = in.nextInt();
        }

        // Array 2
        System.out.print("Enter number of elements for array2: ");
        int n2 = in.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter element " + (i + 1) + " of array2: ");
            array2[i] = in.nextInt();
        }
        if (equals(array1, array2)) {
            System.out.println("Two arrays are equal.");
        } else {
            System.out.println("Two arrays are NOT equal.");
        }
        in.close();
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                return false;
            }
        }
        return true;
    }
}