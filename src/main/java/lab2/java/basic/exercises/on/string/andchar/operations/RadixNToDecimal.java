package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;

/**
 * Write a method called radixNToDecimal() (with prototype int radixNToDecimal(StringradixNStr))
 * to convert an input string of any radix (≤ 16) into its equivalent decimal number.
 * Write a method called testRadixNToDecimal(), which prompts user for a radix n string,
 * and convert the input radix n string into its equivalent decimal number.
 */
public class RadixNToDecimal {
    public static void main(String[] args) {
        test();
    }
    public static int radixToDecimal(String radixStr){
        int result=0;
        for(int i = 0; i < radixStr.length(); i++){
            char c = radixStr.charAt(i);
        }
        return result;
    }
    public static void test(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix number: ");
        String radixStr = in.next();
        int result = radixToDecimal(radixStr);
    }
}
