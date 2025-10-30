package lab1.java.basic.input.decision.and.loop;

import java.util.Scanner;

// Write a program called CircleComputation that prompts user for the radius of a circle in
// floating point number. The program shall read the input as double compute the diameter,
// circumference, and area of the circle in double and print the values rounded to 2 decimal places.
// Use System-provided constant Math.PI for pi.
public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextInt();
        double diameter = radius * 2;
        double circumference = radius * 2 * Math.PI;
        double area = Math.pow(radius,2) * Math.PI;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);
    }
}
