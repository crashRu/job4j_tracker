package ru.job4j.oop.profesions;

public class Doctor extends Profession {

    public Doctor(long id, String name, int age) {
        super(id, name, age);
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}
