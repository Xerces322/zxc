package oop.polymorphism.interfaces.dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();
        Terrier terrier = new Terrier();


        Nursery nursery = new Nursery(poodle, shepherd);
        Nursery nursery1 = new Nursery(terrier, poodle);

    }
}
