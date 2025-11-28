package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;

/**
 * Write a method called binaryToDecimal() (with prototype int binaryToDecimal
 * (String bin-Str)) to convert an input binary string into its equivalent decimal number.
 * Write a method called testBinaryToDecimal(), which prompts user for a binary string,
 * and convert the input binary string into its equivalent decimal number.
 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        testBinaryToDecimal();
    }
    public static int binaryToDecimal(String binStr){
        int decimal = 0;
        for (int i = 0; i<binStr.length(); i++){
            char ch = binStr.charAt(i);
            if(ch != '0' && ch != '1'){
                return -1;
            }
            decimal = decimal*2 + (ch - '0');
        }
        return decimal;
    }
    public static void testBinaryToDecimal(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Binary string: ");
        String binStr = in.nextLine();

        int result = binaryToDecimal(binStr);

        if (result == -1) {
            System.out.printf("error: invalid binary string \"%s\"\n", binStr);
        } else {
            System.out.printf(
                    "The equivalent decimal number for binary \"%s\" is: %d\n",
                    binStr, result
            );
        }
    }
}
