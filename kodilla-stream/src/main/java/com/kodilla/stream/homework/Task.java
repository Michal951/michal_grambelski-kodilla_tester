package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
   public String Name;
   public LocalDate opened;
   public LocalDate deadline;

    public Task(String Name, LocalDate opened, LocalDate deadline) {
        this.Name = Name;
        this.opened = opened;
        this.deadline = deadline;
    }


    public String getName() {
        return Name;
    }

    public LocalDate getopened() {
        return opened;
    }

    public LocalDate getdeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Name.equals(task.Name) && opened.equals(task.opened) && deadline.equals(task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, opened, deadline);
    }
}