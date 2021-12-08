package com.kodilla.abstracts.homework;

public abstract class Person extends Job {
    String name = "Kamil";      //1
    int age = 23;               //2
    String job = "Teacher";     //3

        @Override
        String Responsibilites(){
            return "Teaching, checking tests, taking care of students.";
        }
    }