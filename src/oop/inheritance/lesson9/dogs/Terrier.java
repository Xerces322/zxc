package oop.inheritance.lesson9.dogs;

public class Terrier extends Dog{
    public Terrier() {
        super(28);
    }

    @Override
    public void breathe() {
        System.out.println("Терер дышит");
    }

    @Override
    public void bark() {
        System.out.println("Терьер громко лает");
    }

    @Override
    public void run() {
        System.out.println("Собака быстро бежит");
    }
}
