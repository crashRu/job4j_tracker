package ru.job4j.oop.profesions;

public class Surgeon extends Doctor {

    private int price;

    public Surgeon(long id, String name, String education, int age, String specialization) {
        super(id, name, education, age, specialization);
    }

    public void operation(Pacient pacient, Diagnosis diagnosis) {
        System.out.println("Хирург что то лишнее обрезал у пциента:D");
    }
}
