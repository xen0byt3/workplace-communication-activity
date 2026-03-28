import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoginSessionLogger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.println("\nLogin successful!");
        System.out.println("User: " + username);
        System.out.println("Login time: " + LocalDateTime.now().format(format) + "\n");

        System.out.print("Enter your activity: ");
        String activity = input.nextLine();

        System.out.println("\n----- USER ACTIVITY LOG -----");
        System.out.println("User: " + username);
        System.out.println("Activity: " + activity);
        System.out.println("Activity time: " + LocalDateTime.now().format(format) + "\n");

        System.out.print("Press ENTER to logout...");
        input.nextLine();

        System.out.println("\nLogout successful!");
        System.out.println("User: " + username);
        System.out.println("Logout time: " + LocalDateTime.now().format(format));

        input.close();
    }
}


// Program Flow Example:

// Enter username: adonis

// Login successful!
// User: adonis
// Login time: 2026-03-05 16:45:10

// Enter your activity: Upload project to GitHub

// ----- USER ACTIVITY LOG -----
// User: adonis
// Activity: Upload project to GitHub
// Activity time: 03-05-2026 16:45

// Press ENTER to logout...

// Logout successful!
// User: adonis
// Logout time: 03-05-2026 16:46