package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now(); // Fuso horário local(Brasília)
        Instant d03 = Instant.now(); // Fuso horário de Londres

        LocalDate d04 = LocalDate.parse("2005-10-26");//formatação
        LocalDateTime d05 = LocalDateTime.parse("2005-10-26T22:30:56");
        Instant d06 = Instant.parse("2005-10-26T22:30:56Z");
        Instant d07 = Instant.parse("2005-10-26T22:30:56-03:00");
        LocalDate d08 = LocalDate.parse("02/04/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("02/04/2025 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println("d01: "+ d01);
        System.out.println("d02: "+d02);
        System.out.println("d03: "+d03);
        System.out.println("d04: "+d04);
        System.out.println("d05: "+d05);
        System.out.println("d06: "+d06);
        System.out.println("d07: "+d07);
        System.out.println("d08: "+d08);
        System.out.println("d09: "+d09);
    }
}