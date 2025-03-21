package application;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Isabele"); //adicionando elementos na lista
        list.add("Camilo");
        list.add("Clementina");
        list.add("Jobson");
        list.add(2, "Ramison"); //adicionar na posição específica

        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("-------------------------------");
        System.out.println("Index of Jobson: "+ list.indexOf("Jobson"));
        System.out.println(list.size());
        System.out.println("-------------------------------");
        list.remove("Ramison"); //Removendo um nome específico
        list.remove(1); // removendo por index
        list.removeIf(x -> x.charAt(0) == 'I');

        for (String nome : list){
            System.out.println(nome);
        }

    }
}