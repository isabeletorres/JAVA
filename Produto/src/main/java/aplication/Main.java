package aplication;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Products products = new Products(name, price, quantity);

        System.out.println("\nProduct data: "+products);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantitys = sc.nextInt();
        products.addProducts(quantitys);

        System.out.println("\nUpdated data: "+products);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        int quantityRemove = sc.nextInt();
        products.removeProducts(quantityRemove);

        System.out.println("\nUpdated data: "+products);
    }
}