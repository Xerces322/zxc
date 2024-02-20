package oop.polymorphism.interfaces.dependency_inversion;

public class Nursery {
    private Dog dog1;
    private Dog dog2;

    public Nursery(Dog _dog1, Dog _dog2) {
        System.out.println("Конструктор для любых собак");
        this.dog1 = _dog1;
        this.dog2 = _dog2;
    }

    public Nursery(Poodle poodle, Shepherd shepherd) {
        System.out.println("Конструктор для пуделя и овчарки");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
}
