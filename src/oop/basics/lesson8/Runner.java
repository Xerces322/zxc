package oop.basics.lesson8;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Mers");
        System.out.println(Car.counter);
        Car car1 = new Car("Bmw");
        System.out.println(Car.counter);

    }
}
