package oop.inheritance.lesson9.dogs;

public final class Shepherd extends Dog{
    public Shepherd() {
        super(26);
    }

    @Override
    public void breathe() {
        System.out.println("Овчарка дышит");
    }

    @Override
    public void bark() {
        System.out.println("Овчарка громко лает");
    }

    @Override
    public void run() {
        System.out.println("Собака быстро бежит");
    }
}
