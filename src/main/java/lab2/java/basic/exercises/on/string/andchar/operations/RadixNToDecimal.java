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
        testRadixToDecimal();
    }
    public static int radixToDecimal(String radixStr, int radix){
        radixStr = radixStr.toUpperCase();
        int result = 0;
        for(int i = 0; i < radixStr.length(); i++){
            char c = radixStr.charAt(i);
            int value;
            if(c <= '9' && c >= '0'){
                value = c - '0';
            } else if (c >= 'A' && c<= 'Z') {
                value = c - 'A' + 10;
            }
            else {
                return -1;
            }
            if (value >= radix) {
                return -1;
            }
            result = result * radix + value;
        }
        return result;
    }
    public static void testRadixToDecimal() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number string: ");
        String str = in.next();

        System.out.print("Enter the radix: ");
        int radix = in.nextInt();

        int decimal = radixToDecimal(str, radix);

        if (decimal == -1) {
            System.out.println("error: invalid number string \"" + str + "\" for radix " + radix);
        } else {
            System.out.println("The equivalent decimal number is: " + decimal);
        }
    }

}
