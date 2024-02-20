package oop.polymorphism.interfaces.interface_inheritance;

public class Dog implements Alive{
    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void move() {
        System.out.println("Собака двигается");
    }
}
