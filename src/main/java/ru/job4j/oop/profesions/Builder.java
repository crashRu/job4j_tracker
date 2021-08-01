package ru.job4j.oop.profesions;

public class Builder extends Engineer {

    private int seniority;

    public Builder(long id, String name, String suName, String education, int age, int seniority) {
        super(id, name, suName, education, age, seniority);
    }

    public void build(Project project) {
    }
}
