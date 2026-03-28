import java.util.Scanner;

public class HelloWithName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();

        System.out.print("Enter your birthday: ");
        String birthday = input.nextLine();

        System.out.print("Enter your home town: ");
        String hometown = input.nextLine();

        System.out.print("Enter your status: ");
        String status = input.nextLine();

        System.out.print("Enter your profession: ");
        String profession = input.nextLine();

        System.out.println("\nWelcome " + name + " !" + 
                           "\nWelcome to " + course + " !" + 
                           "\nWe will be recording you as our birth month celebrant. Your birthday is " + birthday +
                           "\nHere are some of your Personal Information!" +
                           "\nHome Town: " + hometown +
                           "\nStatus: " + status + 
                           "\nProfession: " + profession +
                           "\n\nThank you for registering your personal information! Have a nice day!");

        input.close();
    }
}

