import java.util.Scanner;

// Class with encapsulation
class OilSupply {

    private String oilType;
    private double liters;
    private double dailyUsage;

    public OilSupply (String oilType, double liters, double dailyUsage) {
        this.oilType = oilType;
        this.liters = liters;
        this.dailyUsage = dailyUsage;
    }

    public String getOilType() {
        return oilType;
    }

    public double getLiters(){
        return liters;
    }

    public double getDailyUsage(){
        return dailyUsage;
    }

    public double setDaySupply (){
        return liters / dailyUsage;
    }

    public String setStatus(){
        double days = setDaySupply();

        if (days < 20) {
            return ("RED (CRITICAL)");
        }
        else if (days <= 40){
            return ("YELLOW (WARNING)");
        }
        else {
            return ("SAFE");
        }
    }

    public void addSupply(double amount) {
        liters += amount;
        System.out.printf("%.2f L supply added successfully to %s!\n", amount, oilType);
    }

    public void reduceSupply(double amount) {
        if (liters >=  amount) {
            liters -= amount;
            System.out.printf("%.2f L supply reduced successfully to %s!\n", amount, oilType);
        } else {
            System.out.println("Not enough stock!");
        }
    }

    public void displayOil(){
        System.out.println("Oil Type: " + oilType);
        System.out.println("Liters: " + liters + " L");
        System.out.println("Daily Usage: " + dailyUsage + " L/day");
        System.out.printf("Days Supply:  %.2f days \n", setDaySupply());
        System.out.println("Status: "+ setStatus());
        
        double targetSupply = 60 * dailyUsage;
        double reorderAmount = targetSupply - liters;

        if (reorderAmount > 0) {
            System.out.printf("Reorder Suggestion: Add %.2f L to reach 60 days!\n", reorderAmount);
        } else {
            System.out.println("Reorder Suggestion: Supply is sufficient.");
        }

    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        OilSupply diesel = new OilSupply("Diesel", 5000000, 99000);
        OilSupply gasoline = new OilSupply("Gasoline", 5200000, 101000);
        OilSupply kerosene = new OilSupply("Kerosene", 3000000, 44400);
        OilSupply jet = new OilSupply("Jet Fuel", 4000000, 69000);
        OilSupply lpg = new OilSupply("LPG", 2000000, 69000);

        int choice;

        do {
            System.out.println("\n=== COUNTRY OIL SUPPLY SYSTEM ===");
            System.out.println("1. View Supply");
            System.out.println("2. Add Supply");
            System.out.println("3. Reduce Supply");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- 1. Diesel ---");
                    diesel.displayOil();

                    System.out.println("\n--- 2. Gasoline ---");
                    gasoline.displayOil();

                    System.out.println("\n--- 3. Kerosene ---");
                    kerosene.displayOil();

                    System.out.println("\n--- 4. Jet Fuel ---");
                    jet.displayOil();

                    System.out.println("\n--- 5. LPG ---");
                    lpg.displayOil();

                    break;

                case 2:
                    System.out.println("\nSelect Oil Type:"); 
                    System.out.println("1 - Diesel | 2 - Gasoline | 3 - Kerosene | 4 - Jet Fuel | 5 - LPG");
                    System.out.print("Select Oil (1-5): ");
                    int addChoice = input.nextInt();

                    System.out.print("Enter quantity to add: ");
                    double addAmount = input.nextDouble();

                    if (addChoice == 1) {
                        diesel.addSupply(addAmount);
                    } else if (addChoice == 2) {
                        gasoline.addSupply(addAmount);
                    } else if (addChoice == 3) {
                        kerosene.addSupply(addAmount);
                    } else if (addChoice == 4) {
                        jet.addSupply(addAmount);
                    } else if (addChoice == 5) {
                        lpg.addSupply(addAmount);
                    } else {
                        System.out.println("Invalid choice");
                    }

                    break;

                case 3:
                    System.out.println("\nSelect Oil Type:"); 
                    System.out.println("1 - Diesel | 2 - Gasoline | 3 - Kerosene | 4 - Jet Fuel | 5 - LPG");
                    System.out.print("Select Oil (1-5): ");
                    int reduceChoice = input.nextInt();

                    System.out.print("Enter quantity to reduce: ");
                    double reduceAmount = input.nextDouble();

                    if (reduceChoice == 1) {
                        diesel.reduceSupply(reduceAmount);
                    } else if (reduceChoice == 2) {
                        gasoline.reduceSupply(reduceAmount);
                    } else if (reduceChoice == 3) {
                        kerosene.reduceSupply(reduceAmount);
                    } else if (reduceChoice == 4) {
                        jet.reduceSupply(reduceAmount);
                    } else if (reduceChoice == 5) {
                        lpg.reduceSupply(reduceAmount);
                    } else {
                        System.out.println("Invalid choice");
                    }

                    break;

                case 4:
                    System.out.print("Are you sure you want to exit? [Y/N]: ");
                    char confirm = input.next().toUpperCase().charAt(0);

                    if (confirm == 'Y'){
                        System.out.println("Exiting program...");
                        input.close();
                        System.exit(0);
                    }
                    else if (confirm == 'N'){
                        System.out.println("Returning to menu...");
                        choice = 0;
                    }
                    else {
                        System.out.println("Invalid Input! Returning to menu...");
                        choice = 0;
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice !=4);

    }
}