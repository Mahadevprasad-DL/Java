//Print sum of n natural numbers//
package util;
import java.util.Scanner;

public class loop2 {
	public static void main(String[] arg) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		n = sc.nextInt();
				int sum=0;
			for(int i=1; i<=n ; i++) {
				sum = sum+i;
			}
		System.out.println("Sum of"  +n+ "number is:" + sum);
				
	}
}
