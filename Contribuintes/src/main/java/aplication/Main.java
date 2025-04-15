package aplication;

import entities.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();
        for (int i =0; i<n; i++){
            System.out.printf("Tax payer #%d data:%n", i+1);
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double ind = sc.nextDouble();
                list.add(new Individual(name, anualIncome, ind));
            } else {
                System.out.print("Number of employees: ");
                int num = sc.nextInt();
                list.add(new Company(name, anualIncome, num));
            }
        }


        System.out.println("TAXES PAID");

        for(TaxPayer tax : list){
            System.out.println(tax.getName() + " $ " + tax.tax());
        }

    }
}