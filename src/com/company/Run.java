package com.company;

import java.util.List;

public class Run {
    private List<Customers> customers;

    public Run() {
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }

    public void ptintAllCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getId() + " " + customers.get(i).getSurname() + " " + customers.get(i).getName() + " " + customers.get(i).getPatronymic() + " " + customers.get(i).getAddress() + " " + customers.get(i).getCreditcard() + " " + customers.get(i).getBankaccount() + " ");
        }
    }
    public void printAllCustomersByCreditCard(){
        int value1=10000;
        int value2=16000;
        int value3=17000;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCreditcard()<value2 && customers.get(i).getCreditcard()>value1)
                System.out.println(customers.get(i).getId() + " " + customers.get(i).getSurname() + " " + customers.get(i).getName() + " " + customers.get(i).getPatronymic() + " " + customers.get(i).getAddress() + " " + customers.get(i).getCreditcard() + " " + customers.get(i).getBankaccount() + " ");

        }
    }
}
