package oop.polymorphism.interfaces.basics;

public class Runner {
    public static void main(String[] args) {
        Moveable car = new Car();
        Moveable dog = new Dog();
        Moveable[] moveables = new Moveable[2];
        moveables[0] = car;
        moveables[1] = dog;
        for (Moveable moveable : moveables) {
            moveable.move();
        }
        car.back();
        dog.back();
    }
}
