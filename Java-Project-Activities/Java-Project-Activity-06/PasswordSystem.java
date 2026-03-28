import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "1234";
        boolean isLoggedIn = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Access Granted!");
                isLoggedIn = true;
                break;
            } else {
                if (i == 1) {
                    System.out.printf("Attempt %d! Incorrect PIN\n", i);
                } else if (i == 2) {
                    System.out.printf("Attempt %d! Warning: Last attempt remaining\n", i);
                } else {
                    System.out.printf("Attempt %d! Card Blocked\n", i);
                }
            }
        }

        if (!isLoggedIn) {
            System.out.println("Card Blocked.");
            System.out.println("Please contact your bank.");
            System.exit(0);
        }

        double balance = 1000.00;
        int choice;

        while (true) {
            System.out.println("\n===== SIMPLE ATM SYSTEM =====");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
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
                        System.out.println("Insufficient Balance.");
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