package com.company;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Original Program");

        HardcoverBook book1 = new HardcoverBook("The Hunger Games", "9780439023528", 8.79, 12, LocalDate.of(2010, Month.JULY, 3), "Suzanne Collins", 384);
        PaperbackBook book2 = new PaperbackBook("A Wrinkle in Time", "9780312367541", 6.19, 4, LocalDate.of(2007, Month.MAY, 1), "Madeleine L'Engle", 256);
        VinylRecord record = new VinylRecord("Kind of Blue", 13.54, 18, LocalDate.of(2011, Month.APRIL, 12), "Miles Davis", Duration.ofMinutes(46));

        List<Order> order = new ArrayList();

        order.add(book1);
        order.add(book2);
        order.add(record);
        
        System.out.println(order);
    }
}