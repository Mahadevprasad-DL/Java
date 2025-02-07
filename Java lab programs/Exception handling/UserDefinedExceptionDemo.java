package javalab6; 

import java.util.InputMismatchException;
import java.util.Scanner;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


public class UserDefinedExceptionDemo {

  
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age: You must be at least 18 years old.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    
    static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0, num = 0, den = 0;
        
      
        while (true) {
            try {
                System.out.print("Enter age: ");
                age = scanner.nextInt();
                validateAge(age);
                break;
            } catch (InvalidAgeException e) {
                System.out.println("Exception Caught: " + e.getMessage());  
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input: Please enter a valid number.");
                scanner.next(); 
            }
        }
        
       
        while (true) {
            try {
                System.out.print("Enter numerator: ");
                num = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input: Please enter a valid number.");
                scanner.next(); 
            }
        }
        
        
        while (true) {
            try {
                System.out.print("Enter denominator: ");
                den = scanner.nextInt();
                System.out.println("Result: " + divide(num, den));
                break;
            } catch (ArithmeticException e) {
                System.out.println("Exception Caught: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input: Please enter a valid number.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}