package oop.class_object.equals;

import java.util.Objects;

public class Child {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Child(String name, int year) {
        this.name = name;
        this.year = year;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Child child2) {
            return this.getName().equals(child2.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getYear() % 2;
    }
}
