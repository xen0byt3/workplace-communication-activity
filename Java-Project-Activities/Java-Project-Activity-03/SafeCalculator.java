import java.util.Scanner;

public class SafeCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Initialize the variables and grouped them by purpose: Input, Deduction, Summary.
        double daysWorked, ratePerDay, overtimeHours, overtimeRate, allowance;
        double sss, pagibig, philhealth, cashAdvance, cashBond, others;
        double regularIncome, overtimeIncome, grossIncome, withholdingTax, totalDeductions, netPay;

        // Payroll Input Section
        System.out.println("----- PAYROLL INPUT -----");
        System.out.print("Enter Number of Days Worked: ");
        daysWorked = input.nextDouble();

        // Condition 1 - Validate Input
        if (daysWorked < 0) {
            System.out.println("Invalid input! Days worked cannot be negative.");
            input.close();
            return; 
        }

        // Get Users' inputs
        System.out.print("Enter Rate per Day: ");
        ratePerDay = input.nextDouble();

        System.out.print("Enter Overtime Hours: ");
        overtimeHours = input.nextDouble();

        System.out.print("Enter Rate per Overtime Hour: ");
        overtimeRate = input.nextDouble();

        System.out.print("Enter Additional Allowance: ");
        allowance = input.nextDouble();

        // Deductions Input Section
        System.out.println("\n----- DEDUCTIONS -----");
        System.out.print("Enter SSS/GSIS Contribution: ");
        sss = input.nextDouble();

        System.out.print("Enter Pagibig Contribution: ");
        pagibig = input.nextDouble();

        System.out.print("Enter PhilHealth Contribution: ");
        philhealth = input.nextDouble();

        System.out.print("Enter Cash Advance: ");
        cashAdvance = input.nextDouble();

        System.out.print("Enter Cash Bond: ");
        cashBond = input.nextDouble();

        System.out.print("Enter Other Deductions: ");
        others = input.nextDouble();

        // Compute the Payroll Input
        regularIncome = daysWorked * ratePerDay;
        overtimeIncome = overtimeHours * overtimeRate;
        grossIncome = regularIncome + overtimeIncome + allowance;

        // Condition 2 - Tax Computation 
        if (grossIncome <= 10000) {
            withholdingTax = grossIncome * 0.05;
        } else if (grossIncome <= 20000) {
            withholdingTax = grossIncome * 0.10;
        } else {
            withholdingTax = grossIncome * 0.15;
        }

        totalDeductions = sss + pagibig + philhealth + cashAdvance + cashBond + others + withholdingTax;
        netPay = grossIncome - totalDeductions;

        // Output Payroll Summary
        System.out.println("\n----- PAYROLL SUMMARY -----");
        System.out.printf("Regular Income: %.2f\n", regularIncome);
        System.out.printf("Overtime Income: %.2f\n", overtimeIncome);
        System.out.printf("Gross Income: %.2f\n", grossIncome);
        System.out.printf("Withholding Tax: %.2f\n", withholdingTax);
        System.out.printf("Total Deductions: %.2f\n", totalDeductions);
        System.out.printf("Net Pay: %.2f\n", netPay);

        // Condition 3 - Net Pay Message 
        if (netPay < 0) {
            System.out.println("Warning: Deductions are greater than income.");
        } else if (netPay < 5000) {
            System.out.println("Note: Net pay is relatively low.");
        } else {
            System.out.println("Good! Net pay is within normal range.");
        }

        input.close();
    }
}

// ----- PAYROLL INPUT -----
// Enter Number of Days Worked: 22
// Enter Rate per Day: 800
// Enter Overtime Hours: 8
// Enter Rate per Overtime Hour: 150
// Enter Additional Allowance: 1000

// 2. After that, the program should ask the user to enter the following deductions:

// ----- DEDUCTIONS -----
// Enter SSS/GSIS Contribution: 100
// Enter Pagibig Contribution: 100
// Enter PhilHealth Contribution: 100
// Enter Cash Advance: 100
// Enter Cash Bond: 100
// Enter Other Deductions: 100

// 3. Your program should compute and display:

// ----- PAYROLL SUMMARY -----
// Regular Income: 17600.00
// Overtime Income: 1200.00
// Gross Income: 19800.00
// Withholding Tax: 1980.00
// Total Deductions: 2580.00
// Net Pay: 17220.00
// Good! Net pay is within normal range.
