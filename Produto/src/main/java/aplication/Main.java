package aplication;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products products = new Products();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        products.setName(sc.next());
        System.out.print("Price: ");
        products.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        products.setQuantity(sc.nextInt());

        System.out.println("\nProduct data: "+products);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        products.addProducts(quantity);

        System.out.println("\nUpdated data: "+products);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        int quantityRemove = sc.nextInt();
        products.removeProducts(quantityRemove);

        System.out.println("\nUpdated data: "+products);
    }
}