package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilites) {
        this.salary = salary;
        this.responsibilities = responsibilites;
    }
    public String showResponsibilities(){
        return responsibilities;
    }
}