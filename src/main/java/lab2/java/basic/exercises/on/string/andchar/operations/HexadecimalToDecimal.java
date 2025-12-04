package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;

/**
 *
 */
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        testHexadecimalToBinary();
    }
    public static String HexadecimalToBinary(String hexStr){
        StringBuilder result = new StringBuilder();
        hexStr = hexStr.toUpperCase();
        String[] HEX_BITS ={ "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111" };
        for(int i = 0; i<hexStr.length(); i++){
            char ch = hexStr.charAt(i);
            int index;
            if(ch <= '9' && ch >= '0'){
                index = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                index = ch - 'A' + 10;
            }else {
                return " Invalid hex character: " + ch;
            }
            result.append(HEX_BITS[index]).append(" ");

        }
        return result.toString();
    }
    public static void testHexadecimalToBinary(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.next();
        String binary = HexadecimalToBinary(hexStr);
        System.out.println("The equivalent binary for hexadecimal \"" + hexStr + "\" is: " + binary);
    }
}
