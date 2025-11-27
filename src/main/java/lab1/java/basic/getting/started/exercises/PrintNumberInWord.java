package lab1.java.basic.getting.started.exercises;

import java.util.Scanner;

/**
 a program called PrintNumberInWord which prints ”ONE”, ”TWO”,... , ”NINE”,
 ”OTHER” if the int variable ”number” is 1, 2, ..., 9, or other, respectively.
 Use (a) a ”nested- if” statement; (b) a ”switch-case-default” statement.
 */
public class PrintNumberInWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
        sc.close();
    }
}
