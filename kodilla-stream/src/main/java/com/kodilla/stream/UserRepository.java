package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> getUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Shrek", 47, 24, "Shrek"));
        users.add(new User("Stanisław Wokulski", 50, 37, "Merchant"));
        users.add(new User("Doctor", 900, 38111, "Time Lord"));
        users.add(new User("Alexander Hamilton", 50, 12000, "Founding Father of the USA"));
        users.add(new User("Geralt of Rivia", 80, 350, "The Witcher"));
        users.add(new User("James T Kirk", 35, 499, "Captain"));
        return users;
    }
}
