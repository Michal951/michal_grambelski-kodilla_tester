package com.kodilla.abstracts.homework;

public class PersonApp {
    public static void main(String[] args) {

        Person Ewa = new Person("Ewa", 24, new Cashier(1000, "Sprzedaż produktów"));
        Person Karolina = new Person("Karolina", 23, new Teacher(1500, "Prowadzenie zajęć"));

        System.out.println(Ewa.job.showResponsibilities());
        System.out.println(Karolina.job.showResponsibilities());
    }
}