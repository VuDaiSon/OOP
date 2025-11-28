package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;

/**
 * The hexadecimal (hex) number system uses 16 symbols, 0 − 9 and A - F (or a - f). Write a
 * method called isHexString() (with prototype boolean isHexString(String hexStr)) to verify
 * a hex string. Write a method called testHexString(), which prompts user for a hex string;
 * and decide if the input string is a valid hex string.
 */
public class CheckHexString {
    public static void main(String[] args) {
        testHexString();
    }
    public static boolean isHexString(String hexStr){
        hexStr = hexStr.toUpperCase();
        for(int i = 0; i<hexStr.length(); i++){
            char ch = hexStr.charAt(i);
            if (!(ch <= 'F' && ch >= 'A' || ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        return true;
    }
    public static void testHexString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String input = in.nextLine();
        if(isHexString(input)){
            System.out.println("\"" + input + "\" is a hex string");
        }
        else {
            System.out.println("\"" + input + "\" is NOT a hex string");
        }
    }
}
