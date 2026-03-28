import java.util.Scanner;
import java.time.LocalDateTime;

public class LoginSessionLogger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        LocalDateTime loginTime = LocalDateTime.now();

        System.out.println("\nLogin successful!");
        System.out.println("User: " + username);
        System.out.println("Login date and time: " + loginTime);

        input.close();
    }
}