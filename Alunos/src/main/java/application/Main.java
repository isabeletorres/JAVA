package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students students = new Students();

        System.out.print("Name: ");
        String Name = sc.nextLine();
        students.setNote1(sc.nextDouble());
        students.setNote2(sc.nextDouble());
        students.setNote3(sc.nextDouble());

        System.out.println("FINAL GRADE = " + students.average());
        System.out.println(students.passedOrNot());
    }
}