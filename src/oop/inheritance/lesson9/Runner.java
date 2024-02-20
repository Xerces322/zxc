package oop.inheritance.lesson9;

import oop.inheritance.lesson9.dogs.Poodle;
import oop.inheritance.lesson9.dogs.Shepherd;
import oop.inheritance.lesson9.dogs.Terrier;

public class Runner {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        poodle.breathe();



        System.out.println();


        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breathe();



        System.out.println();


        Terrier terier = new Terrier();
        terier.bark();
        terier.run();
        terier.breathe();

    }
}
