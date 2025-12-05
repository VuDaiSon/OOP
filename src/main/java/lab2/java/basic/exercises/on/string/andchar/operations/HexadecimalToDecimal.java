package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;

/**
 * Write a method called hexadecimalToDecimal() (with prototype int hexadecimalToDeci-mal(String hexStr))
 * to convert an input hexadecimal string into its equivalent decimal num-ber.
 * Write a method called testHexadecimalToDecimal(), which prompts user for a hexadec-imal string
 * and convert the input hexadecimal string into its equivalent decimal number.
 */
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        test();
    }
    public static int hexadecimalToDecimal(String hexStr){
        hexStr = hexStr.toUpperCase();
        int result =0;
        for(int i = 0; i<hexStr.length(); i++){
            char ch = hexStr.charAt(i);
            int value;
            if(ch >= '0' && ch <= '9'){
                value = ch - '0';
            }
            else if(ch >= 'A' && ch <= 'F'){
                value = ch - 'A' + 10;
            }else {
return -1;            }
            result = result * 16 + value;
        }
        return result;
    }
    public static void test(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.next();
        int decimal = hexadecimalToDecimal(hexStr);
        if(decimal == -1){
            System.out.println("error: invalid hexadecimal string \"" + hexStr + "\"");
        }
        else {
        System.out.println("The equivalent decimal number for hexadecimal \"" + hexStr + "\" is: " + decimal);
    }}
}
