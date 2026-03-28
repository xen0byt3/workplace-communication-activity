// HelloWithName
import java.util.Scanner; //PRE-PROCESSOR DIRECTIVE

public class Activity1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initialize the variables
        String name, course, birthday, hometown, status, profession;

        // Get the Users' inputs
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your course: ");
        course = input.nextLine();

        System.out.print("Enter your birthday: ");
        birthday = input.nextLine();

        System.out.print("Enter your home town: ");
        hometown = input.nextLine();

        System.out.print("Enter your status: ");
        status = input.nextLine();

        System.out.print("Enter your profession: ");
        profession = input.nextLine();

        // Output
        System.out.println("\nWelcome " + name + " !" + 
                            "\nWelcome to " + course + " !" + 
                            "\nWe will be recording you as our birth month celebrant. Your birthday is " + birthday +
                            "\nHere are some of your Personal Information!" +
                            "\nHome Town: " + hometown +
                            "\nStatus: " + status + 
                            "\nProfession: " + profession);
        
        System.out.println("\nThank you for registering your personal information! Have a nice day!");

        input.close();
    }
}