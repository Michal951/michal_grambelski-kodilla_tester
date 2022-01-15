package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String name;
    private String lastname;
    private String schoolName;


    public Principal(String name, String lastname, String schoolName) {
        this.name = name;
        this.lastname = lastname;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.kodilla.collections.adv.maps.homework.Principal principal = (com.kodilla.collections.adv.maps.homework.Principal) o;
        return name.equals(principal.name) && lastname.equals(principal.lastname) && schoolName.equals(principal.schoolName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, schoolName);
    }
}