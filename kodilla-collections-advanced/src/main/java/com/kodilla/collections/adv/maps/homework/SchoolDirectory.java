package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal principal1 = new Principal("Jacek", "Kwiatkoski", "Liceum nr 1");
        Principal principal2 = new Principal("Jędrula","Kossoń", "Liceum nr 2");
        Principal principal3 = new Principal("Karol", "Krawczyk", "Liceum nr 3");
        Principal principal4 = new Principal("Tadeusz", "Norek", "Liceum nr 4");

        School school1 = new School(15, 20,17);
        School school2 = new School(13,17,50);
        School school3 = new School(14,16,18);
        School school4 = new School(11,16,18);


        school.put(principal1,school1);
        school.put(principal2,school2);
        school.put(principal3,school3);
        school.put(principal4,school4);

    }
}
