package com.company;

public class Customers implements Comparable<Customers> {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int creditcard;
    private int bankaccount;


    public Customers(int id, String name, String surname, String patronymic, String address, int creditcard, int bankaccount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.creditcard = creditcard;
        this.bankaccount = bankaccount;
    }

    @Override
    public int compareTo(Customers s) {
        return this.surname.compareTo(s.surname);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(int creditcard) {
        this.creditcard = creditcard;
    }

    public int getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(int bankaccount) {
        this.bankaccount = bankaccount;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", creditcard=" + creditcard +
                ", bankaccount=" + bankaccount +
                '}';

    }

}
