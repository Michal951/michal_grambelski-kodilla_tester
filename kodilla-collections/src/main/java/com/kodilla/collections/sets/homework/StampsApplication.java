package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Stamp number 1", 20, 30, true));
        stamps.add(new Stamp("Stamp number 2", 15, 15, false));
        stamps.add(new Stamp("Stamp number 3", 20, 20, true));
        stamps.add(new Stamp("Stump number 4", 33, 21, true));
        stamps.add(new Stamp("Stump number 5", 51, 55, true));
        stamps.add(new Stamp("Stump number 1", 20, 30, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}