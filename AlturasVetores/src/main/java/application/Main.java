package application;

import entities.Peoples;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? 5");
        int qtdPeople = sc.nextInt();
        sc.nextLine();

        Peoples[] peoples = new Peoples[qtdPeople];

        double sumHeight =0.0;
        int peopleUnder16 =0;
        for(int i =0; i<peoples.length; i++){
            System.out.printf("Dados da %d° pessoa: \n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();

            peoples[i] = new Peoples(name, age, height);

            sumHeight += peoples[i].getHeight();
            if (peoples[i].getAge() < 16){
                peopleUnder16++;
            }
        }
        double age = sumHeight / peoples.length;
        System.out.printf("Altura média: %.2f%n", age);
        double percentageUnder16 = ((double) peopleUnder16 / peoples.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentageUnder16);

        for(int i=0; i<peoples.length; i++){
            if(peoples[i].getAge() < 16){
                System.out.println(peoples[i].getName());
            }
        }
    }
}