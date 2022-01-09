package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        student.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", students=" + students +
                '}';
    }
}