package oop.anonymous_classes;

public class Runner {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            {
                countLegs = 2;
            }
            @Override
            void eat() {
                System.out.println("Собака ест");
            }
        };
        System.out.println(dog.countLegs);
    }
}
