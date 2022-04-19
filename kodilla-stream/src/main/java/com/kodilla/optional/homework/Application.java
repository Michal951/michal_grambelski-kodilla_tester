package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John ", new Teacher("Paul")));
        students.add(new Student("Mick ", new Teacher("Keith")));
        students.add(new Student("Robby ", new Teacher("Jim")));
        students.add(new Student("Robert ", new Teacher("Jimmy")));
        students.add(new Student("Steven ", null));
        students.add(new Student("Janis ", null));
        students.add(new Student("Frank ", null));

        for (Student student : students) {
            System.out.println("Name of student: " + student.getName() + " and his teacher is: " + student.getTeacher() +student.getName());
        }
    }
}