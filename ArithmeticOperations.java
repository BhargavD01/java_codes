public class ArithmeticOperations {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int choice;
        double num1, num2;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 5) break;
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("Addition: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Division: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}