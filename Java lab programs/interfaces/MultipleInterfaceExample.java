import util;
import java.util.Scanner;

interface Personal {
    String getName();
    int getAge();
}

interface Official {
    String getDesignation();
    String getDepartment();
}

class Employee implements Personal, Official {
    private String name;
    private int age;
    private String designation;
    private String department;

    public Employee(String name, int age, String designation, String department) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getDesignation() {
        return designation;
    }

    @Override
    public String getDepartment() {
        return department;
    }
}

public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        Employee employee = new Employee(name, age, designation, department);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View Personal Details");
            System.out.println("2. View Official Details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nPersonal Details:");
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Age: " + employee.getAge());
                    break;

                case 2:
                    System.out.println("\nOfficial Details:");
                    System.out.println("Designation: " + employee.getDesignation());
                    System.out.println("Department: " + employee.getDepartment());
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
