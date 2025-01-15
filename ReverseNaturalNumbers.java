import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the upper limit
        System.out.print("Enter the upper limit of natural numbers: ");
        int upperLimit = scanner.nextInt();

        // Check if the input is valid
        if (upperLimit <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Natural numbers in reverse order:");
            // Loop to print numbers in reverse order
            for (int i = upperLimit; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}