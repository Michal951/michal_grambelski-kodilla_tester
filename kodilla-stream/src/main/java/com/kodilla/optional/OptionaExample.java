package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionaExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");
        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
}
