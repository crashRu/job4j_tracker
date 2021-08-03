package ru.job4j.oop.profesions;

public class Engineer extends Profession {
    private int seniority;

    public Engineer(long id, String name, int age, int seniority) {
        super(id, name, age);
        this.seniority = seniority;
    }

    public Project getProject(Scheme scheme) {
        return new Project();
    }
}
