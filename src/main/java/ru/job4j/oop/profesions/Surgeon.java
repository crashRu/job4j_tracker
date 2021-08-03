package ru.job4j.oop.profesions;

public class Surgeon extends Doctor {

    private int price;

    public Surgeon(long id, String name, int age, int price) {
        super(id, name, age);
        this.price = price;
    }

    public void operation(Pacient pacient, Diagnosis diagnosis) {
        System.out.println("Хирург что то лишнее обрезал у пциента:D");
    }
}
