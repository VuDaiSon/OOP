package lab2.java.basic.method;

import java.util.Scanner;

/**
 * Write a method called print(), which takes an int array and print its contents in the form
 * of [a1, a2, . . . , an]. Take note that there is no comma after the last element.
 */
public class PrintArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ===== Test int[] =====
        System.out.print("Enter number of integers: ");
        int nInt = in.nextInt();
        int[] intArr = new int[nInt];
        for(int i = 0; i<nInt; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            intArr[i] = in.nextInt();
        }
        System.out.print("int array = ");
        print(intArr);
        System.out.println();

        // ===== Test double[] =====
        System.out.print("Enter number of doubles: ");
        int nDouble = in.nextInt();
        double[] doubleArr = new double[nDouble];
        for (int i = 0; i<nDouble; i++){
            System.out.print("Enter double " + (i+1) + ": ");
            doubleArr[i] = in.nextDouble();
        }
        System.out.print("double arr = ");
        print(doubleArr);
        System.out.println();

        // ===== Test float[] =====
        System.out.print("Enter number of floats: ");
        int nFloat = in.nextInt();
        float[] floatArr = new float[nFloat];
        for (int i = 0; i<nFloat; i++){
            System.out.print("Enter float " + (i+1) + ": ");
            floatArr[i] = in.nextFloat();
        }
        System.out.print("float arr = ");
        print(floatArr);
        System.out.println();
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
    public static void print(double[] array){
        System.out.print("[");
        if(array.length > 0){
            System.out.print(array[0]);
            for(int i = 1; i < array.length; i++){
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
    }
    public static void print(float[] array){
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
