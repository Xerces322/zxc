package oop.basics.lesson7;

public class Car {
    private String mark;
    private double maxSpeed = 220;

    public Car() {
    }

    public Car(String _mark, double _maxSpeed) {
        this.mark = _mark;
        if (_maxSpeed > 0)
            this.maxSpeed = _maxSpeed;
        else this.maxSpeed = 100;
    }

    public void setMark(String _mark) {
        this.mark = _mark;
    }

    public String getMark() {
        return mark;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int _maxSpeed) {
        if (_maxSpeed > 0)
            this.maxSpeed = _maxSpeed;
        else this.maxSpeed = 100;
    }
    public String accelerationTo100() {
        return "Скорость разгона до 100км/ч : " + (110/(maxSpeed/20));
    }


}
