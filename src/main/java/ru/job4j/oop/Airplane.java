package ru.job4j.oop;

public class Airplane implements Vehicle{
    @Override
    public void move() {
        System.out.println("Самлет летит по воздуху");
    }

    @Override
    public void fuelType() {
        System.out.println("Kerosene");
    }
}
