package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadline = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getdeadline().isAfter(LocalDate.now()))
                .map(task -> task.getdeadline())
                .collect(Collectors.toList());
        System.out.println(deadline);
    }
}