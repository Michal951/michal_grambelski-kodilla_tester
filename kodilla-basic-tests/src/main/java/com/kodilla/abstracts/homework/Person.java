package com.kodilla.abstracts.homework;

public class Person  {

    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
       Job cashier = new Cashier(1000,"Sprzedaż produktów");
       Job teacher = new Teacher(1500, "Prowadzenie zajęć");

       Person Ewa = new Person("Ewa",24,cashier);
       Person Karolina = new Person("Karolina",23,teacher);

        System.out.println(Ewa.job.showResponsibilities());
        System.out.println(Karolina.job.showResponsibilities());
    }
}