package oop.polymorphism.interfaces.basics;

public interface Moveable {
    void move();
    default void back() {
        System.out.println("Объект вернулся назад");
    }
}
