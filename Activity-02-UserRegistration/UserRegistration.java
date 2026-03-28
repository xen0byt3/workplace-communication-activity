import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();

        System.out.print("Enter your birthday: ");
        String birthday = input.nextLine();

        System.out.println("\nWelcome " + name);
        System.out.println("Welcome to " + course);
        System.out.println("We will be recording you as our birth month celebrant. Your birthday is " + birthday);
        System.out.println("Thank you for registering your personal information! Have a nice day!");

        input.close();
    }
}