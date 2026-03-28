import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Start Student Grading System");
            System.out.println("2 - Exit");
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Student No.: ");
                    String studentNo = input.nextLine();
                    
                    System.out.print("Enter Student Name: ");
                    String studentName = input.nextLine();
                    
                    System.out.print("Enter Subject: ");
                    String subject = input.nextLine();
                    
                    System.out.print("Enter Prelim Grade: ");
                    double prelim = input.nextDouble();
                    
                    System.out.print("Enter Midterm Grade: ");
                    double midterm = input.nextDouble();
                    
                    System.out.print("Enter Pre-final Grade: ");
                    double prefinal = input.nextDouble();
                    
                    System.out.print("Enter Final Grade: ");
                    double finalGrade = input.nextDouble();
                    
                    int completed = 0;
                    if (prelim > 0) completed++;
                    if (midterm > 0) completed++;
                    if (prefinal > 0) completed++;
                    if (finalGrade > 0) completed++;

                    String periodRemarks;
                    if (completed == 4) {
                        periodRemarks = "Complete!";
                    } else if (completed > 0) {
                        periodRemarks = "Incomplete!";
                    } else {
                        periodRemarks = "Dropped!";
                    }

                    double highest = prelim;
                    if (midterm > highest) highest = midterm;
                    if (prefinal > highest) highest = prefinal;
                    if (finalGrade > highest) highest = finalGrade;

                    double lowest = prelim;
                    if (midterm < lowest) lowest = midterm;
                    if (prefinal < lowest) lowest = prefinal;
                    if (finalGrade < lowest) lowest = finalGrade;

                    double average = (prelim + midterm + prefinal + finalGrade) / 4.0;

                    String collegeRating;
                    if (average > 100) {
                        collegeRating = "Out of Range";
                    } else if (average >= 98) {
                        collegeRating = "1.00";
                    } else if (average >= 95) {
                        collegeRating = "1.25";
                    } else if (average >= 92) {
                        collegeRating = "1.50";
                    } else if (average >= 89) {
                        collegeRating = "1.75";
                    } else if (average >= 86) {
                        collegeRating = "2.00";
                    } else if (average >= 83) {
                        collegeRating = "2.25";
                    } else if (average >= 80) {
                        collegeRating = "2.50";
                    } else if (average >= 77) {
                        collegeRating = "2.75";
                    } else if (average >= 75) {
                        collegeRating = "3.00";
                    } else if (average > 0) {
                        collegeRating = "5.0"; 
                    } else {
                        collegeRating = "Dropped";
                    }

                    String finalRemarks;
                    if (average > 100) {
                        finalRemarks = "Out of Range";
                    } else if (average >= 75 && average <= 100) {
                        finalRemarks = "Passed";
                    } else {
                        finalRemarks = "Failed";
                    }

                    System.out.println("\n===== RESULT =====");
                    System.out.println("Student No.: " + studentNo);
                    System.out.println("Student Name: " + studentName);
                    System.out.println("Subject: " + subject);
                    System.out.println("Academic Grading Period Completed: " + completed);
                    System.out.println("Remarks: " + periodRemarks);
                    System.out.println("Highest Grade: " + highest);
                    System.out.println("Lowest Grade: " + lowest);
                    System.out.printf("General Average: %.2f\n", average);
                    System.out.println("College Rating: " + collegeRating);
                    System.out.println("Remarks: " + finalRemarks);
                    break;

                case 2:
                    System.out.println("Program Ended.");
                    isRunning = false; // Breaks the while loop
                    break;

                default:
                    System.out.println("Invalid input. Please enter 1 or 2.");
                    break;
            }
        }
        
        input.close();
    }
}


// If user selects 1

// Ask the user to input the following:

// 	Enter Student No.: SUMM-1T
// 	Enter Student Name: xen0byt3
// 	Enter Subject: Programming (Java) NCIII
// 	Enter Prelim Grade: 100
// 	Enter Midterm Grade: 95
// 	Enter Pre-final Grade: 0
// 	Enter Final Grade: 99

// Display Output Format (Sample Output)

// 	===== RESULT =====
// 	Student No.: SUMM-1T
// 	Student Name: xen0byt3
// 	Subject: Programming (Java) NCIII
// 	Academic Grading Period Completed: 3
// 	Remarks: Incomplete!
// 	Highest Grade: 100.0
// 	Lowest Grade: 0.0
// 	General Average: 73.50
// 	College Rating: 5.0
// 	Remarks: Failed