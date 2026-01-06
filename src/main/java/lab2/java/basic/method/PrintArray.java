package lab2.java.basic.method;

/**
 * Write a method called print(), which takes an int array and print its contents in the form
 * of [a1, a2, . . . , an]. Take note that there is no comma after the last element.
 */
public class PrintArray {
    public static void main(String[] args) {
    }
    public static void print(int[] array){
        System.out.print("[");
        if(array.length > 0){
            System.out.print(array[0]);
        for(int i = 0; i < array.length; i++){
            System.out.print("," + array[i+1]);
        }
    }
    System.out.print("]");
    }
    public static void print(double[] array){
        System.out.print("[");
        if(array.length > 0){
            System.out.print(array[0]);
            for(int i = 0; i < array.length; i++){
                System.out.print(", " + array[i+1]);
            }
        }
        System.out.print("]");
    }
    public static void print(float[] array){
        System.out.print("[");
        if(array.length > 0){
            System.out.print(array[0]);
            for(int i = 0; i < array.length; i++){
                System.out.print("," + array[i+1]);
            }
        }
        System.out.print("]");
    }
}
