package ru.job4j.oop.profesions;

public class Dentist extends Doctor {

    private long price;

    public Dentist(long id, String name, String suName, String education, int age, String specialization) {
        super(id, name, suName, education, age, specialization);
    }

    public void vomitedTooth(Pacient pacient) {
        System.out.println("Хирург вырвал все зубы пациенту))");
    }
}
