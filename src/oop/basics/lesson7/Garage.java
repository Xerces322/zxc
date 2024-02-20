package oop.basics.lesson7;

public class Garage {
    private Car car1;
    private Car car2;

    public void setCar1(Car _car1) {
        this.car1 = _car1;
    }

    public void setCar2(Car _car2) {
        this.car2 = _car2;
    }

    public void getInfoAboutCars() {
        getInfoAboutCar(car1);
        getInfoAboutCar(car2);
    }
    private void getInfoAboutCar(Car car) {
        System.out.println(car.getMark());
        System.out.println(car.accelerationTo100());
    }
}
