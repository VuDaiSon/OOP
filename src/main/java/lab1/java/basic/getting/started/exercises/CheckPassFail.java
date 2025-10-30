package lab1.java.basic.getting.started.exercises;

// a program called CheckPassFail
// which prints ”PASS” if the int variable ”mark” is more than or equal to 50
// or prints ”FAIL” otherwise. The program shall always print “DONE” before exiting.

import java.math.BigInteger;
import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The mark is: ");
        BigInteger mark = sc.nextBigInteger();
        if(mark.compareTo(BigInteger.valueOf(50)) >=0 ){
            System.out.println("PASS");
        }
        else {System.out.println("FAIL");}
        System.out.println("DONE");
    }

}
