package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    int numberOfPassengers;
    @Override
    public void fly() {

    }
    public Plane(int number) {
        this.numberOfPassengers = number;
    }
}
