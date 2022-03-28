package com.company;

import java.util.List;

public class Bank {
    private List<Customers> customers ;

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers=customers;
    }

    public void printAllSurname(){
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }


    public void printCreditCard(Integer creditcard){
        for (int i = 0; i < customers.size(); i++) {
            if (creditcard == customers.get(i).getCreditcard()) {
                System.out.println(customers.get(i));
            }
        }
    }
    public Bank(List <Customers> customers) {
        this.customers = customers;
    }
}

