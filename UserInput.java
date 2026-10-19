package com.learning.task1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String empName = scan.nextLine();

        System.out.print("Enter Age : ");
        int age = scan.nextInt();

        System.out.print("Enter Monthly Salary : ");
        double salary = scan.nextDouble();

        double annualSalary = salary * 12;
        double bonus = annualSalary * 0.10;
        double totalIncome = annualSalary + bonus;

        System.out.println("\n--- Employee Details ---");
        System.out.printf("Name: %s%n", empName);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Monthly Salary: Rs. %.2f%n", salary);
        System.out.printf("Annual Salary: Rs. %.2f%n", annualSalary);
        System.out.printf("Bonus (10%%): Rs. %.2f%n", bonus);
        System.out.printf("Total Annual Income: Rs. %.2f%n", totalIncome);

        scan.close();


    }
}
