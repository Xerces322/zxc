package oop.polymorphism.interfaces.task;

public class Plane implements Fly{
    @Override
    public void fly() {
        System.out.println("Самолет летает");
    }
}
