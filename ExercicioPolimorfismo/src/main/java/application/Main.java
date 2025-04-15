package application;

import entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.printf("Product #%d data:\n", i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Preco: ");
            double price = sc.nextDouble();

            if (type == 'i'){
                System.out.print("Customs fee: ");
                double cus = sc.nextDouble();

                list.add(new ImportedProduct(name, price, cus));
            } else if (type == 'u'){
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                list.add(new Product(name, price));
            }
        }

        for (Product prod : list){
            System.out.println(prod.priceTag());
        }
    }
}