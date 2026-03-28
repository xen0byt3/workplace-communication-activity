import java.time.LocalDate; 
import java.time.LocalTime; 

public class DataTypesRhymeWithDate { 
    public static void main(String[] args) { 

        byte age = 20;
        short year = 2026;
        int stars = 500;
        long steps = 1234567L; 
        float height = 5.1f;   
        double savings = 99.99;
        char section = 'A';
        boolean isCodingFun = true;
        String name = "Abram";
        LocalDate today = LocalDate.now(); 

        System.out.println("My name is " + name + ", shining bright,\n" +
            "At " + age + " years old, I code day and night.\n" +
            "In the year " + year + ", dreams appear,\n" +
            "With " + stars + " stars that I hold dear.\n\n" +

            "I've traveled " + steps + " steps to grow,\n" +
            "With height of " + height + ", I proudly show.\n" +
            "My savings reach " + savings + " today,\n" +
            "In section " + section + ", I learn each day.\n\n" +

            "It is " + isCodingFun + " that I love to create,\n" +
            "Today is " + today + ", and my future is great!");
    }
}