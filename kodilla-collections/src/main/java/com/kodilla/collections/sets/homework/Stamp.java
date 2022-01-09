package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.Objects;

public class Stamp {
    private String name;
    private int hight;
    private int width;
    private boolean stamped;

    public Stamp(String name, int hight, int width, boolean stamped) {
        this.name = name;
        this.hight = hight;
        this.width = width;
        this.stamped = stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return hight == stamp.hight &&
                width == stamp.width &&
                stamped == stamp.stamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hight, width, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", hight= " + hight +
                " , widht= " + width +
                " , stamped " + stamped +
                '}';
    }
}