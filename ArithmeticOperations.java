

public class ArithmeticOperations{
    
    // The main() method is the entry point of the program
    public static void main(String[] args) {
         

        // Employee Salary Calculator

        int employeeId = 161;
        int workingDays = 26;
        double monthlySalary = 25000.00;
        float bonusRate = 10.0f;
        char employeeGrade = 'A';
        boolean isFullTime = true;
        long employeeNumber = 9876562456L;


        // Declare a constant for the deduction rate
        final double DEDUCTION_RATE = 5.0;

        // Calculate the bonus
        double bonus = monthlySalary * bonusRate / 100;

        // Calculate the deduction
        double deduction = monthlySalary * DEDUCTION_RATE / 100;

        // Calculate the final monthly salary
        double netSalary = monthlySalary + bonus - deduction;

        // Calculate the annual net salary
        double annualSalary = netSalary * 12;

        /*
          Display employee information and salary calculations
         */
        System.out.println(" ------ Employee Salary Slip ------ ");
        System.out.println("Employee ID       : " + employeeId);
        System.out.println("Employee Number   : " + employeeNumber);
        System.out.println("Working Days      : " + workingDays);
        System.out.println("Employee Grade    : " + employeeGrade);
        System.out.println("Full-Time Employee: " + isFullTime);

        System.out.println("\n ----- Salary Details ----- ");
        System.out.printf("Monthly Salary    : Rs. %.2f%n", monthlySalary);
        System.out.printf("Bonus (10%%)       : Rs. %.2f%n", bonus);
        System.out.printf("Deduction (5%%)    : Rs. %.2f%n", deduction);
        System.out.printf("Net Monthly Salary: Rs. %.2f%n", netSalary);
        System.out.printf("Annual Net Salary : Rs. %.2f%n", annualSalary);


    }
}

