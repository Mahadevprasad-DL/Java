package util;
import java.util.Scanner;

class Calculator { // instance variable
    private int a;
    private int b;

    public Calculator(int a, int b) { //constructor
        this.a = a;
        this.b = b;
    }
    
   // Method
    public void add() {
        int result = this.a + this.b;  
        System.out.println("Addition is: " + result);
    }

    public void sub() {
        int result = this.a - this.b;
        System.out.println("Subtraction is: " + result);
    }

    public void mul() {
        int result = this.a * this.b;
        System.out.println("Multiplication is: " + result);
    }

    public void div() {
        if (this.b != 0) {
            double result = (double) this.a / this.b;
            System.out.println("Division is: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void choice() {
        System.out.println("Select an option below: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Close");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter your second number (b): ");
        int b = sc.nextInt();

        Calculator c = new Calculator(a, b);

        int choice;
        do {
            choice();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    c.add();
                    break;
                case 2:
                    c.sub();
                    break;
                case 3:
                    c.mul();
                    break;
                case 4:
                    c.div();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
