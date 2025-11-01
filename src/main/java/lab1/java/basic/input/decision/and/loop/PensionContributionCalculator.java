package lab1.java.basic.input.decision.and.loop;

//Both the employer and the employee are mandated to contribute a certain percentage of the
//employee’s salary towards the employee’s pension fund. The rate is tabulated as follows(I show it in code)
//However, the contribution is subjected to a salary ceiling of $6, 000. In other words, if an
//employee earns $6, 800, only $6, 000 attracts employee’s and employer’s contributions, the
//remaining $800 does not.
//Write a program called PensionContributionCalculator that reads the monthly salary
//and age (in int) of an employee. Your program shall calculate the employee’s, employer’s
//and total contributions (in double); and print the results rounded to 2 decimal places. For
//examples,

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        int salary  = sc.nextInt();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        int contributableSalary = Math.min(salary, SALARY_CEILING);
        double employeeContribution;
        double employerContribution;
        double totalContribution;
        if(age <= 55){
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
        }
        else if (age <= 65) {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
            employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
        } else {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
            employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
        }
        totalContribution = employeeContribution + employerContribution;
        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);
    }
}
