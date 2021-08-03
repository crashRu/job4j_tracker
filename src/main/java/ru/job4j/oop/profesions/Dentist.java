package ru.job4j.oop.profesions;

public class Dentist extends Doctor {

    private long price;

    public Dentist(long id, String name, int age, int price) {
        super(id, name, age);
        this.price = price;
    }

    public void vomitedTooth(Pacient pacient) {
        System.out.println("Хирург вырвал все зубы пациенту))");
    }
}
