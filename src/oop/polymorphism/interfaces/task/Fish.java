package oop.polymorphism.interfaces.task;

public class Fish implements Swim{
    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }
}
