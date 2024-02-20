package oop.polymorphism.interface_marker;


import java.util.Objects;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        AirPlane airPlane = new AirPlane();
        Object[] objects = {bird, airPlane};
        for (Object object : objects) {
            if (object instanceof Alive)
                System.out.println("Объект живой");
        }

    }
}
