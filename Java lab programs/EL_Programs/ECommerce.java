package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

abstract class Discount {
    public abstract double applyDiscount(double price);
}

class PercentageDiscount extends Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * (percentage / 100));
    }
}

class FixedDiscount extends Discount {
    private double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double applyDiscount(double price) {
        return Math.max(0, price - amount);
    }
}

class Cart {
    private List<Product> products;
    private Discount discount;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }

        if (discount != null) {
            total = discount.applyDiscount(total);
        }

        return total;
    }

    public void showCart() {
        System.out.println("\nItems in Cart:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " : Rs" + product.getPrice());
        }
        System.out.println("Total Price: $" + calculateTotal());
    }
}


public class ECommerceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("Welcome to E-Commerce Cart!");

        System.out.print("Enter number of products to add: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            cart.addProduct(new Product(name, price));
        }

        
        System.out.println("\nChoose discount type:");
        System.out.println("1. Percentage Discount");
        System.out.println("2. Fixed Discount");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter discount percentage: ");
            double percentage = scanner.nextDouble();
            cart.setDiscount(new PercentageDiscount(percentage));
        } else if (choice == 2) {
            System.out.print("Enter fixed discount amount: ");
            double amount = scanner.nextDouble();
            cart.setDiscount(new FixedDiscount(amount));
        } else {
            System.out.println("No discount applied.");
        }

        cart.showCart();
        scanner.close();
    }
}
