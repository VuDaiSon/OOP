package lab2.java.basic.exercises.on.string.andchar.operations;


import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        testCipherCaesarCode();
    }

    public static String cipherCaesarCode(String inStr) {
        inStr = inStr.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);
            if (inChar >= 'A' && inChar <= 'W') {
                result.append((char) (inChar + 3));
            } else if (inChar == 'X') {
                result.append('A');
            } else if (inChar == 'Y') {
                result.append('B');
            } else if (inChar == 'Z') {
                result.append('C');
            } else {
                result.append(inChar);
            }
        }
        return result.toString();
    }
    public static void testCipherCaesarCode(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.nextLine();
        System.out.print("The ciphertext string is: " + cipherCaesarCode(inStr));

    }
}
