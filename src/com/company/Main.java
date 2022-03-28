package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            // write your code here

            Customers customers1 = new Customers(1, "Diana", "Babiy", "Andreevna", "Minsk", 16785, 945638);
            Customers customers2 = new Customers(2, "Maria", "Malisheva", "Andreevna", "Minsk", 15585, 986387);
            Customers customers3 = new Customers(3, "Ekaterina", "Ignatovich", "Andreevna", "Minsk", 11850, 109638);

            List<Customers> customers = new ArrayList<>();
            customers.add(customers1);
            customers.add(customers2);
            customers.add(customers3);

            System.out.println();

            System.out.println("Список покупателей в алфавитном порядке: ");
            System.out.println();

            Run run=new Run();
            Collections.sort(customers);
            run.setCustomers(customers);
            run.ptintAllCustomers();
            System.out.println();

            System.out.println("Список покупателей по диапазону номера кредитной карты: ");
            System.out.println();
            run.printAllCustomersByCreditCard();

    }
}
