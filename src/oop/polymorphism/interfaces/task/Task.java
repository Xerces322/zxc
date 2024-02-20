package oop.polymorphism.interfaces.task;

public class Task {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Duck duck = new Duck();
        Fish fish = new Fish();

        Swim[] swimPool = {fish, duck};
        Fly[] sky = {plane, duck};

        for (Swim swim : swimPool) {
            swim.swim();
        }
        for (Fly fly : sky) {
            fly.fly();
        }

    }
}
