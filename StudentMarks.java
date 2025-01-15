import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Display a message
        System.out.println("My First Java Program");

        // Task 2: Store Student Details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Marks for Subject 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter Marks for Subject 3: ");
        int marks3 = scanner.nextInt();

        // Task 3: Perform Calculations
        int totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300.0) * 100;
        String status = (percentage >= 40) ? "Pass" : "Fail";

        // Task 4: Display Results
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Status: " + status);

        scanner.close();
    }
}