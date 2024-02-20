package oop.record;

import java.util.Objects;

public class Human {
    private final int birthYear;
    private final String name;
    private final String surname;
    private final String lastname;

    public Human(int birthYear, String name, String surname, String lastname) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Human human)
            return this.birthYear == human.birthYear && Objects.equals(this.name, human.name) && Objects.equals(this.surname, human.surname) && Objects.equals(this.lastname, human.lastname);
        return false;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthYear, name, surname, lastname);
    }

    @Override
    public String toString() {
        return "Human{" +
                "birthYear=" + birthYear +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
