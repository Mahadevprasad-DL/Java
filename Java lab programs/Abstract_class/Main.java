package util;
import java.util.Scanner;

abstract class Printer {    // abstract class 
 abstract void configuration();   // methods
 abstract void display();        // methods
}

class DotMatrix extends Printer {    // child class
	String name;
	String color;
 void configuration() {
     System.out.println("welcome to DotMatrix Printer");
     System.out.println("Enter Your Printer name :");
     System.out.println("Enter your Printer Color");
     Scanner sc1 = new Scanner(System.in);
     name = sc1.next();
     color = sc1.next();
 }

 
 void display() {
     System.out.println("Dot-matrix Printer Display: carbon copy printing.");
     System.out.println("The printer name is:" + name);
     System.out.println("The printer color is :" + color);
     
 }
}

class LaserJet extends Printer {    // child class
 void configuration() {
     System.out.println("LaserJet Printer Configuration: High-speed printing.");
 }


 void display() {
     System.out.println("LaserJet Printer Display: high-quality text and graphics.");
 }
}

//Main Class
public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Printer printer;

     while (true) {
         System.out.println("\n--- Printer Menu ---");    // menu driven 
         System.out.println("1. Dot-matrix Printer");
         System.out.println("2. LaserJet Printer");
         System.out.println("3. Exit");
         System.out.print("Choose an option: ");

         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 printer = new DotMatrix();
                 printer.configuration();
                 printer.display();
                 break;
             case 2:
                 printer = new LaserJet();
                 printer.configuration();
                 printer.display();
                 break;
             case 3:
                 System.out.println("Exiting the program. Goodbye!");
                 scanner.close(); 
                 return; 
             default:
                 System.out.println("Invalid option! Please choose again.");
         }
     }
 }
}
