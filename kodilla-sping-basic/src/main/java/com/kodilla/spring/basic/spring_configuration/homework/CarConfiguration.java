package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {
    private Car car;

    @Bean
    public Car chooseCar(String season) {
        switch (season) {
            case "spring":
            case "autumn":
                car = new Sedan();
                car.hasHeadlightsTurnedOn();
                break;
            case "summer":
                car = new Cabrio();
                break;
            case "winter":
                car = new SUV();
                break;
        }
        return car;
    }
}