import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month;
        int day;

        System.out.print("Enter Month: ");
        month = input.nextLine();

        System.out.print("Enter Day: ");
        day = input.nextInt();

        if (month.equalsIgnoreCase("January")) {
            if (day >= 1 && day <= 19) {
                System.out.println("\nCapricornus (Goat): December 22 – January 19");
                System.out.println("Makaka-commit ka sa GitHub…\npero nakalimutan mong i-test ang program.\nGood luck sa pull request.");
            } else if (day >= 20 && day <= 31) {
                System.out.println("\nAquarius (Water Bearer): January 20 – February 18");
                System.out.println("Magkakaroon ka ng bright idea today…\npagkatapos mong uminom ng 3 kape habang nagco-code.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("February")) {
            if (day >= 1 && day <= 18) {
                System.out.println("\nAquarius (Water Bearer): January 20 – February 18");
                System.out.println("Magkakaroon ka ng bright idea today…\npagkatapos mong uminom ng 3 kape habang nagco-code.");
            } else if (day >= 19 && day <= 29) {
                System.out.println("\nPisces (Fish): February 19 – March 20");
                System.out.println("Magiging smooth ang coding mo today…\nhanggang sa ma-delete mo ang buong file by accident.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("March")) {
            if (day >= 1 && day <= 20) {
                System.out.println("\nPisces (Fish): February 19 – March 20");
                System.out.println("Magiging smooth ang coding mo today…\nhanggang sa ma-delete mo ang buong file by accident.");
            } else if (day >= 21 && day <= 31) {
                System.out.println("\nAries (Ram): March 21 – April 19");
                System.out.println("Magiging confident ka today sa coding… hanggang sa makita mo ang error na:\nmissing ; sa line 2.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("April")) {
            if (day >= 1 && day <= 19) {
                System.out.println("\nAries (Ram): March 21 – April 19");
                System.out.println("Magiging confident ka today sa coding… hanggang sa makita mo ang error na:\nmissing ; sa line 2.");
            } else if (day >= 20 && day <= 30) {
                System.out.println("\nTaurus (Bull): April 20 – May 20");
                System.out.println("Makakagawa ka ng program na gumagana…\npero hindi mo na alam kung paano mo siya napaandar.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("May")) {
            if (day >= 1 && day <= 20) {
                System.out.println("\nTaurus (Bull): April 20 – May 20");
                System.out.println("Makakagawa ka ng program na gumagana…\npero hindi mo na alam kung paano mo siya napaandar.");
            } else if (day >= 21 && day <= 31) {
                System.out.println("\nGemini (Twins): May 21 – June 21");
                System.out.println("May dalawang tab kang bukas:\nJava code\nStackOverflow\nGuess mo kung saan ka mas nakatingin today.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("June")) {
            if (day >= 1 && day <= 21) {
                System.out.println("\nGemini (Twins): May 21 – June 21");
                System.out.println("May dalawang tab kang bukas:\nJava code\nStackOverflow\nGuess mo kung saan ka mas nakatingin today.");
            } else if (day >= 22 && day <= 30) {
                System.out.println("\nCancer (Crab): June 22 – July 22");
                System.out.println("Akala mo tama na ang code mo…\npero may lalabas na bagong error pagkatapos mong ayusin yung isa.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("July")) {
            if (day >= 1 && day <= 22) {
                System.out.println("\nCancer (Crab): June 22 – July 22");
                System.out.println("Akala mo tama na ang code mo…\npero may lalabas na bagong error pagkatapos mong ayusin yung isa.");
            } else if (day >= 23 && day <= 31) {
                System.out.println("\nLeo (Lion): July 23 – August 22");
                System.out.println("Tatawagin ka ng instructor para i-explain ang code mo…\nsasabihin mo: \"Sir gumana siya bigla.\"");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("August")) {
            if (day >= 1 && day <= 22) {
                System.out.println("\nLeo (Lion): July 23 – August 22");
                System.out.println("Tatawagin ka ng instructor para i-explain ang code mo…\nsasabihin mo: \"Sir gumana siya bigla.\"");
            } else if (day >= 23 && day <= 31) {
                System.out.println("\nVirgo (Virgin): August 23 – September 22");
                System.out.println("Ikaw ang magiging class hero today…\ndahil ikaw lang ang nakakaalam kung saan ilalagay ang Scanner.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("September")) {
            if (day >= 1 && day <= 22) {
                System.out.println("\nVirgo (Virgin): August 23 – September 22");
                System.out.println("Ikaw ang magiging class hero today…\ndahil ikaw lang ang nakakaalam kung saan ilalagay ang Scanner.");
            } else if (day >= 23 && day <= 30) {
                System.out.println("\nLibra (Balance): September 23 – October 23");
                System.out.println("Balanced ang buhay mo today:\n50% debugging\n50% staring sa screen wondering bakit ayaw gumana.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("October")) {
            if (day >= 1 && day <= 23) {
                System.out.println("\nLibra (Balance): September 23 – October 23");
                System.out.println("Balanced ang buhay mo today:\n50% debugging\n50% staring sa screen wondering bakit ayaw gumana.");
            } else if (day >= 24 && day <= 31) {
                System.out.println("\nScorpius (Scorpion): October 24 – November 21");
                System.out.println("May matutuklasan kang bagong kaibigan sa coding:\nNullPointerException");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("November")) {
            if (day >= 1 && day <= 21) {
                System.out.println("\nScorpius (Scorpion): October 24 – November 21");
                System.out.println("May matutuklasan kang bagong kaibigan sa coding:\nNullPointerException");
            } else if (day >= 22 && day <= 30) {
                System.out.println("\nSagittarius (Archer): November 22 – December 21");
                System.out.println("Mabilis ka mag-type ng code today…\npero mas mabilis ang paglabas ng errors.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } 
        else if (month.equalsIgnoreCase("December")) {
            if (day >= 1 && day <= 21) {
                System.out.println("\nSagittarius (Archer): November 22 – December 21");
                System.out.println("Mabilis ka mag-type ng code today…\npero mas mabilis ang paglabas ng errors.");
            } else if (day >= 22 && day <= 31) {
                System.out.println("\nCapricornus (Goat): December 22 – January 19");
                System.out.println("Makaka-commit ka sa GitHub…\npero nakalimutan mong i-test ang program.\nGood luck sa pull request.");
            } else {
                System.out.println("Invalid Input!");
            }
        } 
        else {
                System.out.println("\nInvalid Input!");
        }

        input.close();
    }
}