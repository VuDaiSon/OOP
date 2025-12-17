package lab2.java.basic.exercises.on.string.andchar.operations;

import java.util.Scanner;

/**
 * Write a method called octalToDecimal() (with prototype int octalToDecimal
 * (String octalStr)) to convert an input octal string into its equivalent decimal number.
 * Write a method called testOctalToDecimal(), which prompts user for a octal string,
 * and convert the input octal string into its equivalent decimal number.
 */
public class OctalToDecimal {
    public static void main(String[] args) {
        test();

    }
    public static int octalToDecimal(String octalStr){
        int result = 0;
        for(int i = 0; i<octalStr.length(); i++){
            char c = octalStr.charAt(i);
            if(c > '7' || c < '0' ){
                return -1;
            }
            int value = c - '0';
            result = result * 8 + value;
        }
        return result;
    }
    public static void test(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octalStr = in.next();
        int result = octalToDecimal(octalStr);
        if(result == -1){
            System.out.println("error: invalid octal string \"" + octalStr + "\"");
        } else {
            System.out.println(
                    "The equivalent decimal number \"" + octalStr + "\" is : " + result);
        }
    }
}
