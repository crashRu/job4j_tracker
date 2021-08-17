package ru.job4j.oop;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] veh = new Vehicle[]{airplane, train, bus};
        for (Vehicle v : veh) {
            v.fuelType();
            v.move();
        }
    }
}
