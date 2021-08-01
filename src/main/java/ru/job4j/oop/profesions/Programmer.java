package ru.job4j.oop.profesions;

public class Programmer extends Engineer {

    private int lvl;

    public Programmer(long id, String name, String suName, String education, int age, int seniority, int lvl) {
        super(id, name, suName, education, age, seniority);
        this.lvl = lvl;
    }
}
