// HelloWithNameAndDate
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Activity2 {
    public static void main(String[] args) {
        // Create objects
        Scanner input = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Initialize the variables
        String uName, activity;

        System.out.print("Enter username: ");
        uName = input.nextLine();

        // Get the date-time and format it
        System.out.println("\nLogin successful!" + 
                           "\nUser: " + uName + 
                           "\nLogin time: " + LocalDateTime.now().format(format) + "\n");

        System.out.print("Enter your activity: ");
        activity = input.nextLine();

        System.out.println("\n----- USER ACTIVITY LOG -----" + 
                           "\nUser: " + uName + 
                           "\nActivity: " + activity + 
                           "\nActivity time: " + LocalDateTime.now().format(format) + "\n");

        System.out.print("Press ENTER to logout...");
        input.nextLine(); 

        System.out.println("\nLogout successful!" + 
                           "\nUser: " + uName + 
                           "\nLogout time: " + LocalDateTime.now().format(format));

        input.close();
    }
}