// Print table using forloop //
package util;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number:");
        n = sc.nextInt();p
        
        for (int i = 1; i < 10; i++) { 
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        
        sc.close(); // Close the scanner 
    }
}
