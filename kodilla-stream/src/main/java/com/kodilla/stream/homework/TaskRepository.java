package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        LocalDate date1 = LocalDate.of(2022, 3, 17);
        LocalDate date2 = LocalDate.of(2022, 2, 21);
        LocalDate date3 = LocalDate.of(2022, 1, 11);
        LocalDate currentDate = LocalDate.now();


        tasks.add(new Task("Pay bills",currentDate, date1 ));
        tasks.add(new Task("Find new job",currentDate, date3 ));
        tasks.add(new Task("Send a letter", date2,date1));
        return tasks;
    }
}
