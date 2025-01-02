//Display square of a number for first 10 natural numbers//
package util;

public class  forloop3 {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= 10; i++) {
            int square = (i * i) * n;
            System.out.println("Number: " + i + ", Square * " + n + ": " + square);
        }
    }
}
