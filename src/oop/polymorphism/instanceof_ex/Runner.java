package oop.polymorphism.instanceof_ex;

import oop.basics.lesson7.Car;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal zoo[] = {cat, dog};
        for (Animal animal : zoo) {
            if (animal instanceof Cat cat1)
                cat1.sayMeow();
        }
    }
}
