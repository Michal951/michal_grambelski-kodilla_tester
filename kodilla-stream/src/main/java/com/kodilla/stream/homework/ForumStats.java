package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
       double average1 =  UserRepository.getUserList()
               .stream()
               .map(u -> u.getAge() >= 40)
               .mapToInt(u -> u.getnumberOfPosts)
               .average()
               .getAsDouble();

        System.out.println("średnia liczba postów dla użytkowników poniżej 40 lat wynosi " + average1);

      double average2 =   UserRepository.getUserList()
        .stream()
                .map(u -> u.getAge() >= 40)
                .mapToInt(u -> u.getnumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println("średnia liczba postów dla użytkowników mających 40 lat bądź więcej wynosi " + average2);
    }
}
