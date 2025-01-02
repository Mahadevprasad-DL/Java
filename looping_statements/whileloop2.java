//sum of n natural numbers//
package util;
import java.util.Scanner;

public class whileloop2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while (i <= n) {
            sum += i;
            i++;
        }
        
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
