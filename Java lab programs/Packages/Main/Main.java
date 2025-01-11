package Main;
import shape.Circle;
import shape.Triangle;
import shape.Square;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double area = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                if (radius <= 0) {
                    System.out.println("Negative or zero value is not allowed for radius.");
                    return;
                }
                Circle circle = new Circle(radius);
                area = circle.getArea();
                break;

            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                if (base <= 0) {
                    System.out.println("Negative or zero value is not allowed for base.");
                    return;
                }
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Negative or zero value is not allowed for height.");
                    return;
                }
                Triangle triangle = new Triangle(base, height);
                area = triangle.getArea();
                break;

            case 3:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                if (side <= 0) {
                    System.out.println("Negative or zero value is not allowed for side length.");
                    return;
                }
                Square square = new Square(side);
                area = square.getArea();
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("The area is: " + area);

        scanner.close();
    }
}
