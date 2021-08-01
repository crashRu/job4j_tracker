package ru.job4j.oop.profesions;

public class Doctor extends Profession {

    private String specialization;

    public Doctor(long id, String name, String suName, String education, int age, String specialization) {
        super(id, name, suName, education, age);
        this.specialization = specialization;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}
