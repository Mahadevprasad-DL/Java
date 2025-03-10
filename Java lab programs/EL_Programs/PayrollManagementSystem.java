package util;

import java.util.Scanner;

interface Employee {
 void displayEmployeeDetails();
 double calculateSalary(); 
}


class FullTimeEmployee implements Employee {
 private String name;
 private double basicSalary;
 private double hra;
 private double da; 

 public FullTimeEmployee(String name, double basicSalary) {
     this.name = name;
     this.basicSalary = basicSalary;
     this.hra = basicSalary * 0.2; 
     this.da = basicSalary * 0.1;  
 }

 @Override
 public void displayEmployeeDetails() {
     System.out.println("\nFull-Time Employee: " + name);
 }

 @Override
 public double calculateSalary() {
     return basicSalary + hra + da;
 }
}


class PartTimeEmployee implements Employee {
 private String name;
 private int hoursWorked;
 private double hourlyRate;

 public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
     this.name = name;
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public void displayEmployeeDetails() {
     System.out.println("\nPart-Time Employee: " + name);
 }

 @Override
 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }
}


class ContractEmployee implements Employee {
 private String name;
 private double fixedContractAmount;

 public ContractEmployee(String name, double fixedContractAmount) {
     this.name = name;
     this.fixedContractAmount = fixedContractAmount;
 }

 @Override
 public void displayEmployeeDetails() {
     System.out.println("\nContract Employee: " + name);
 }

 @Override
 public double calculateSalary() {
     return fixedContractAmount; 
 }
}


public class PayrollManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Welcome to Payroll Management System!");

  
     System.out.println("\nSelect Employee Type:");
     System.out.println("1. Full-Time Employee");
     System.out.println("2. Part-Time Employee");
     System.out.println("3. Contract Employee");
     System.out.print("Enter your choice: ");
     int choice = scanner.nextInt();
     scanner.nextLine(); 

     Employee employee = null; 

     switch (choice) {
         case 1:
             System.out.print("Enter Full-Time Employee Name: ");
             String ftName = scanner.nextLine();
             System.out.print("Enter Basic Salary: ₹");
             double basicSalary = scanner.nextDouble();
             employee = new FullTimeEmployee(ftName, basicSalary);
             break;

         case 2:
             System.out.print("Enter Part-Time Employee Name: ");
             String ptName = scanner.nextLine();
             System.out.print("Enter Hours Worked: ");
             int hoursWorked = scanner.nextInt();
             System.out.print("Enter Hourly Rate: ₹");
             double hourlyRate = scanner.nextDouble();
             employee = new PartTimeEmployee(ptName, hoursWorked, hourlyRate);
             break;

         case 3:
             System.out.print("Enter Contract Employee Name: ");
             String ctName = scanner.nextLine();
             System.out.print("Enter Fixed Contract Salary: ₹");
             double fixedSalary = scanner.nextDouble();
             employee = new ContractEmployee(ctName, fixedSalary);
             break;

         default:
             System.out.println("Invalid Choice! Exiting...");
             System.exit(0);
     }

     
     if (employee != null) {
         employee.displayEmployeeDetails();
         System.out.println("Total Salary: ₹" + employee.calculateSalary());
     }

     scanner.close();
 }
}



