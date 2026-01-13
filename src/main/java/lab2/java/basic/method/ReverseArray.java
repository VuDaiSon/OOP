package lab2.java.basic.method;

import static lab2.java.basic.method.ArrayToString.arrayToString;

/**
 * Write a method called reverse(), which takes an array of int and reverse its contents.
 * For example, the reverse of [1, 2, 3, 4] is [4, 3, 2, 1].
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Before reverse: " + arrayToString(a));
        reverse(a);
        System.out.println("After reverse:  " + arrayToString(a));
        // Test edge cases
        int[] empty = {};
        reverse(empty);
        System.out.println("Empty array:    " + arrayToString(empty));
        int[] one = {10};
        reverse(one);
        System.out.println("One element:    " + arrayToString(one));
    }
    public static void reverse(int[] array){
        for(int fIdx = 0, bIdx = array.length -1;  fIdx < bIdx; fIdx++, bIdx--){
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
    }
}
