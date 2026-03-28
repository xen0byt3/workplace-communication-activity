import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.00;
        int choice;

        while (true) {
            System.out.println("\n===== SIMPLE ATM SYSTEM =====");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit Money");
            System.out.println("3 - Withdraw Money");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is: %.2f\n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposit successful! New Balance: %.2f\n", balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Withdrawal successful! Remaining Balance: %.2f\n", balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM System");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose 1-4 only.");
            }
        }
    }
}