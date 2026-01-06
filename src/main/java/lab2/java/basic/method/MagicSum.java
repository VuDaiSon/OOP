package lab2.java.basic.method;

import java.util.Scanner;

/**
 * Write a boolean method called hasEight(), which takes an int as input and returns true if the
 * number contains the digit 8 (e.g., 18, 168, 1288). The signature of the method is as follows:
 * public static boolean hasEight (int number);
 * Write a method called int testMagicSum(Scanner in) which prompts user for integers (or −1 to end),
 * and produce the sum of numbers containing the digit 8. Your program should use the above methods.
 */
public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testMagicSum(in);
        in.close();
    }
    public static boolean hasEight(int number){
        while(number > 0){
            if(number % 10 == 8){
                return true;
            }
            number /=10;
        }
       return false;
    }
    public static int testMagicSum(Scanner in){
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = in.nextInt();
        int sum = 0;
        while (number != SENTINEL){
            if(hasEight(number)){
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
        return sum;
    }
}
