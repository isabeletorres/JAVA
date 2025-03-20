package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        double[] vect = new double[num];

        for (int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            double value = sc.nextDouble();
            vect[i] = value;
            sum += vect[i];
        }

        double avg = sum /vect.length;
        System.out.print("VALORES = ");

        for (int i=0; i<vect.length; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f%n", sum);
        System.out.printf("MÉDIA = %.2f%n", avg);
    }
}