package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;

    private int ssd;

    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public static void main(String[] args) {
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        comp.printInfo();
        computer.printInfo();
    }

    private void printInfo() {
        System.out.println(multiMonitor + " " + ssd + " " + cpu);
    }
}