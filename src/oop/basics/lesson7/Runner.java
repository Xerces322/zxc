package oop.basics.lesson7;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMark("ZvorykinCar");
        Car car2 = new Car();
        car2.setMark("SuperCar");
        car2.setMaxSpeed(400);



        Garage garage = new Garage();
        garage.setCar1(car1);
        garage.setCar2(car2);
        garage.getInfoAboutCars();


    }
}
