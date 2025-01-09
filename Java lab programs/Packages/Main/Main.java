package Main;
import shape.Square;
import shape.Rectangle;
import shape.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double area = 0;

        
        switch (choice) {
            case 1: 
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                area = square.getArea();
                break;
            case 2: 
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                area = rectangle.getArea();
                break;
            case 3: 
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                area = circle.getArea();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        
        System.out.println("The area is: " + area);

        scanner.close(); 
    }
}
