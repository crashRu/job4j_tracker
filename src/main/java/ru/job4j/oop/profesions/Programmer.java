package ru.job4j.oop.profesions;

public class Programmer extends Engineer {
    private int lvl;

    public Programmer(long id, String name, int age, int seniority, int lvl) {
        super(id, name, age, seniority);
        this.lvl = lvl;
    }
}
