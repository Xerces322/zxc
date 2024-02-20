package oop.inheritance.lesson9.dogs;

public class Poodle extends Dog{
    public Poodle() {
        super(36);
    }

    @Override
    public void breathe() {
        System.out.println("Пудель дышит");
    }

    @Override
    public void bark() {
        System.out.println("Пудель лает");
    }

    @Override
    public void run() {
        System.out.println("Собака бежит медленно");
    }


}
