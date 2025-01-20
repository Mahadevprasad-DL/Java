package util;
import java.util.Scanner;

abstract class Vehicle {       // abstract class 
    void drive() {                // method drive
        System.out.println("My vehicle");
    }
}

class Car extends Vehicle {         //class 
    public void drive() {
        System.out.println("Driving car");
    }
}

class Motorcycle extends Vehicle {
    public void drive() {
        System.out.println("Driving motorcycle");
    }
}

public class Main {       // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v = null;

        while (true) {
            System.out.println("Vehicle Menu");
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    v = new Car();
                    break;
                case 2:
                    v = new Motorcycle();
                    break;
                case 3:
                    System.out.println("Exiting program");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            if (v != null) {
                v.drive();
            }
        }
    }
}

