package oop.polymorphism.interfaces.functional_interfaces;
@FunctionalInterface
public interface Sounding {
    void makeSound();
    default void doSmth() {
        System.out.println("Что то делается");
    }
}
