package util;
public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(20, 10);

        System.out.println("Addition: " + Calculator.add(calc.num1, calc.num2));
        System.out.println("Subtraction: " + Calculator.subtract(calc.num1, calc.num2));
        System.out.println("Multiplication: " + Calculator.multiply(calc.num1, calc.num2));
        System.out.println("Division: " + Calculator.divide(calc.num1, calc.num2));
    }
}
