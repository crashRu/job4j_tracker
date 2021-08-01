package ru.job4j.oop.profesions;

public class Doctor extends Profession {
    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}
