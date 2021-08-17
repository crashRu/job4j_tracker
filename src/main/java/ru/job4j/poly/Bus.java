package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void run() {
        System.out.println("Bus is run");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Number of passengers on the bus: " + count);
    }

    @Override
    public double fillUp(int count) {
        return (double) count * 53;
    }
}
