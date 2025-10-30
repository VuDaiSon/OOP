package lab1.java.basic.getting.started.exercises;

// a program called PrintDayInWord which prints ”Sunday”, ”Monday”, ... ”Saturday”
// if the int variable ”dayNumber” is 0, 1, ..., 6, respectively.
// Otherwise, it shall print ”Not a valid day”.
// Use (a) a ”nested-if” statement; (b) a ”switch-case-default” statement.
//Try dayNumber = 0, 1, 2, 3, 4, 5, 6, 7 and verify your results.

import java.math.BigInteger;
import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dayNumber: ");
        BigInteger dayNumber = sc.nextBigInteger();
        if (dayNumber.equals(BigInteger.valueOf(0))) {
            System.out.println("Sunday");
        } else if (dayNumber.equals(BigInteger.valueOf(1))) {
            System.out.println("Monday");
        } else if (dayNumber.equals(BigInteger.valueOf(2))) {
            System.out.println("Tuesday");
        } else if (dayNumber.equals(BigInteger.valueOf(3))) {
            System.out.println("Wednesday");
        } else if (dayNumber.equals(BigInteger.valueOf(4))) {
            System.out.println("Thursday");
        }else if (dayNumber.equals(BigInteger.valueOf(5))) {
            System.out.println("Friday");
        }
        else if (dayNumber.equals(BigInteger.valueOf(6))) {
            System.out.println("Saturday");
        }
        else System.out.println("Not a valid day");
        sc.close();
    }

}