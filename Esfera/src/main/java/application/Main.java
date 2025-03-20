package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Radios: ");
        double radios = sc.nextDouble();

        System.out.printf("Circunference: %.2f\n", Calculator.circumference(radios));
        System.out.printf("Volume: %.2f\n", Calculator.volume(radios));
        System.out.printf("PI: %.2f\n", Calculator.PI);

    }
}