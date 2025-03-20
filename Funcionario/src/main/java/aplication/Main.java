package aplication;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.setName(sc.nextLine());
        System.out.print("Gross Salary: ");
        employee.setGrossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        employee.setTax(sc.nextDouble());

        System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
        double increase = sc.nextDouble();
        employee.increaseSalary(increase);
        System.out.println(employee);
    }
}