package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsApp {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car Nissan = new Nissan(50);
        Car Ford = new Ford(51);
        Car Opel = new Opel(55);

        cars.add(Nissan);
        cars.add(Ford);
        cars.add(Opel);


        cars.remove(Nissan);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
