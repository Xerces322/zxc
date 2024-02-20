package oop.polymorphism.interfaces.interface_segregation;

public class AirPlane implements Flyable, Driveable{
    @Override
    public void fly() {
        System.out.println("Самолет летает");
    }

    @Override
    public void drive() {
        System.out.println("Самолет едет");
    }
}
