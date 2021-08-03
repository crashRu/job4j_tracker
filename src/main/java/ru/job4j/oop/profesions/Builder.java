package ru.job4j.oop.profesions;

public class Builder extends Engineer {

    private String specialization;

    public Builder(long id, String name, int age, int seniority, String specialization) {
        super(id, name, age, seniority);
        this.specialization = specialization;
    }

    public void build(Project project) {
    }
}
