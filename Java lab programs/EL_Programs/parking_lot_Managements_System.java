package util;


import java.util.Scanner;

class InvalidVehicleException extends Exception {
 public InvalidVehicleException(String message) {
     super(message);
 }
}

class ParkingLotFullException extends Exception {
 public ParkingLotFullException(String message) {
     super(message);
 }
}

class Vehicle {
 private String vehicleName;
 private String vehicleType;

 public Vehicle(String vehicleName, String vehicleType) throws InvalidVehicleException {
     if (vehicleName == null || vehicleName.trim().isEmpty()) {
         throw new InvalidVehicleException("Vehicle name cannot be empty or null.");
     }
     this.vehicleName = vehicleName;
     this.vehicleType = vehicleType;
 }

 public String getVehicleName() {
     return vehicleName;
 }

 public String getVehicleType() {
     return vehicleType;
 }

 @Override
 public String toString() {
     return "Vehicle [Name=" + vehicleName + ", Type=" + vehicleType + "]";
 }
}

class ParkingLot {
 private Vehicle[] slots;
 private int currentSlot;

 public ParkingLot(int numberOfSlots) {
     slots = new Vehicle[numberOfSlots];
     currentSlot = 0;
 }

 public void parkVehicle(Vehicle vehicle) throws ParkingLotFullException {
     if (currentSlot >= slots.length) {
         throw new ParkingLotFullException("Parking lot is full. Cannot park the vehicle.");
     }
     slots[currentSlot++] = vehicle;
     System.out.println("Vehicle parked: " + vehicle);
 }

 public void displayParkedVehicles() {
     System.out.println("\nList of parked vehicles:");
     for (int i = 0; i < currentSlot; i++) {
         System.out.println(slots[i]);
     }
 }
}

public class ParkingLotManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter the number of parking slots: ");
         int numberOfSlots = scanner.nextInt();
         scanner.nextLine();  

         ParkingLot parkingLot = new ParkingLot(numberOfSlots);

         while (true) {
             System.out.println("\n1. Park a vehicle");
             System.out.println("2. Display parked vehicles");
             System.out.println("3. Exit");
             System.out.print("Enter your choice: ");
             int choice = scanner.nextInt();
             scanner.nextLine();  

             switch (choice) {
                 case 1:
                     System.out.print("Enter vehicle name: ");
                     String vehicleName = scanner.nextLine();
                     System.out.print("Enter vehicle type (e.g., Car, Bike): ");
                     String vehicleType = scanner.nextLine();

                     try {
                         Vehicle vehicle = new Vehicle(vehicleName, vehicleType);
                         parkingLot.parkVehicle(vehicle);
                     } catch (InvalidVehicleException e) {
                         System.out.println("Error: " + e.getMessage());
                     } catch (ParkingLotFullException e) {
                         System.out.println("Error: " + e.getMessage());
                     }
                     break;

                 case 2:
                     parkingLot.displayParkedVehicles();
                     break;

                 case 3:
                     System.out.println("Exiting Parking Lot Management System.");
                     scanner.close();
                     return;

                 default:
                     System.out.println("Invalid choice! Please try again.");
                     break;
             }
         }
     } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}