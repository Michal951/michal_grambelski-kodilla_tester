package com.kodilla.spring.basic.dependency_injection;


import org.springframework.stereotype.Component;

@Component
public class EmailMessageService implements MessageService {
    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending [" + message + "] to: " + receiver + " via Email");
    }
}