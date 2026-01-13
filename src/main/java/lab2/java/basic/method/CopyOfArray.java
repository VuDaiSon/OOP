package lab2.java.basic.method;

import static lab2.java.basic.method.ArrayToString.arrayToString;

/**
 * Write a boolean method called copyOf(), which takes an int array and returns a copy of the given array.
 * Also write a test driver to test this method.
 * Write another version for copyOf() which takes a second parameter to specify the length of the new array.
 * You should truncate or pad with zero so that the new array has the required length.
 */
public class CopyOfArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};

        int[] copy1 = copyOf(original);
        int[] copy2 = copyOf(original, 2);
        int[] copy3 = copyOf(original, 6);

        System.out.println("Original: " + arrayToString(original));
        System.out.println("Copy same length: " + arrayToString(copy1));
        System.out.println("Copy shorter: " + arrayToString(copy2));
        System.out.println("Copy longer: " + arrayToString(copy3));
    }
    public static int[] copyOf(int[] array){
        int[] newArray = new int[array.length];
        for(int i = 0; i< array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static int[] copyOf(int[] array, int newLength){
        int[] newArray = new int[newLength];
        int lengthToCopy = Math.min(newLength, array.length);
        for(int i = 0; i<lengthToCopy; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
}
