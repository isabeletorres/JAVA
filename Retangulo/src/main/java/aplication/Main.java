package aplication;

import entities.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Enter rectangle width and height: ");
        retangulo.setWidth(sc.nextDouble());
        retangulo.setHeight(sc.nextDouble());

        System.out.println("AREA: "+ retangulo.area());
        System.out.println("PERIMETER: "+ retangulo.perimeter());
        System.out.println("DIAGONAL: " + retangulo.diagonal());
    }
}