package application;

import model.entities.*;
import model.enums.OrderStatus;
import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i =0; i<n; i++){
            System.out.printf("Enter #%d item data:\n ", i+1);
            System.out.print("Product name: ");
            String nameProduct = sc.next();
            System.out.print("Product Price: ");
            double priceProduct = sc.nextDouble();

            Product product = new Product(nameProduct, priceProduct);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, product, priceProduct);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMARY: ");
        System.out.println(order);

    }
}