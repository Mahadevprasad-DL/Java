package util;
import java.util.Scanner;
public class Calculator {   // class declaration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating 'scanner' object to take input from the user

        System.out.println("Welcome to the Calculator!");
        boolean continueCalculating = true;   // Declaring a variable

        while (continueCalculating) {
            // Taking user input for numbers
            System.out.print("\nEnter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Displaying menu options
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            double result;

            // Performing the selected operation
            switch (choice) {        // 'switch' block
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    continueCalculating = false;
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
        }

        scanner.close();
    }
}
