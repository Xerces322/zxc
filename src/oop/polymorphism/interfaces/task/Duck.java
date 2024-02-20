package oop.polymorphism.interfaces.task;

public class Duck implements Fly, Swim {

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }
}
