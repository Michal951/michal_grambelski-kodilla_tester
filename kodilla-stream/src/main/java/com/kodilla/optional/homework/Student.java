package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        Teacher result = optionalTeacher.orElse(new Teacher("<undifined>"));
        return result.getName();
    }

}