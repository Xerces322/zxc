package oop.polymorphism.interfaces.basics;

public class Dog implements Moveable {
    public void move() {
        System.out.println("Собака идет");
    }
    public void turnOff() {
        System.out.println("Машина выключилась");
    }

    @Override
    public void back() {
        System.out.println("Собака вернулась назад");
    }
}
