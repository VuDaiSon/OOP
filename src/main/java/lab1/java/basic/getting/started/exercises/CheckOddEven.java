package lab1.java.basic.getting.started.exercises;

import java.math.BigInteger;
import java.util.Scanner;

//Write a program called CheckOddEven which prints ”Odd Number” if the int variable “number” is odd
//or “Even Number” otherwise. The program shall always print “Bye!” before exiting.
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number is:" );
        BigInteger number = sc.nextBigInteger();
        if(number.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
        System.out.println("Bye!");
    }
}
