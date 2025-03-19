package aplication;
import entities.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle  y = new Triangle();

        System.out.println("Valores triângulo A: 3.0 4.0 5.0");
        x.a = 3.0;
        x.b = 4.0;
        x.c = 5.0;
        System.out.println("Área do triângulo A:" + x.areaTriangulo());

        System.out.println("\nValores triângulo B: 7.5 4.5 4.02");
        y.a = 7.5;
        y.b = 4.5;
        y.c = 4.02;
        System.out.println("Área do triângulo B: " + y.areaTriangulo());

    }
}