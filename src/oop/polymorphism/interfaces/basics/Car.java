package oop.polymorphism.interfaces.basics;

public class Car implements Moveable{
    public void move() {
        System.out.println("Машина едет");
    }

    @Override
    public void back() {
        System.out.println("Машина вернулась назад");
    }

}
