package oop.polymorphism.interfaces.functional_interfaces;

public class Runner {
    public static void main(String[] args) {
        Sounding cat1 = new Cat();
        cat1.makeSound();

        Sounding bird = () -> System.out.println("Птица поет");
        bird.makeSound();
    }
}
