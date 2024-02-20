package oop.inheritance.lesson9.dogs;


import oop.inheritance.lesson9.Alive;

public abstract class Dog extends Alive {
    protected final int COUNT_LEGS = 4;
    protected int countTeeth;
    public static final String LATIN_NAME = "Canis familiaris";

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }
    public final void eat() {
        System.out.println("Собака ест");
    }

    public abstract void bark();
    public abstract void run();
}
